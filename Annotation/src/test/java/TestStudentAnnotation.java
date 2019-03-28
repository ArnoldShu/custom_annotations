import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @ClassName TestStudentAnnotation
 * @Description 测试方法,通过自定义注解来完成模拟orm的sql拼接
 * @Todo
 * @Author Arnold
 * @Date 2019/3/26 23:22
 * @Version 1.0
 **/
public class TestStudentAnnotation {
    public static void main(String[] args) {
        Student testDto = new Student("小明", "1","12");
        Student testDto1= new Student("小宏", "0","13");
        Student testDto2 = new Student("小李", "1","14");

        String sql = assembleSqlFromObj(testDto);
        String sql1 = assembleSqlFromObj(testDto1);
        String sql2 = assembleSqlFromObj(testDto2);
        System.out.println(sql);
        System.out.println(sql1);
        System.out.println(sql2);
    }

    /**
      * @Description:  通过注解来组装查询条件，生成查询语句
      * @Param:  Object
      * @return: String
      * @Author: Arnold
      * @Date: 2019/3/28
      *
     **/
    public static String assembleSqlFromObj(Object obj) {
        StudentTableAnnotation table = obj.getClass().getAnnotation(StudentTableAnnotation.class);
        StringBuffer sbSql = new StringBuffer();
        String tableName = table.value();
        sbSql.append("select * from " + tableName + " where 1=1 ");
        Field[] fileds = obj.getClass().getDeclaredFields();
        for (Field f : fileds) {
            String fieldName = f.getName();
            String methodName = "get" + fieldName.substring(0, 1).toUpperCase()
                    + fieldName.substring(1);
            try {
                StudentFieldAnnotation column = f.getAnnotation(StudentFieldAnnotation.class);
                if (column != null) {
                    Method method = obj.getClass().getMethod(methodName);
                    String value = (String) method.invoke(obj);
                    if (value != null && !value.equals("")) {
                        if (!isNum(column.value()) && !isNum(value)) {
                            // 判断参数是不是 in 类型参数 1,2,3
                            if (value.contains(",")) {
                                sbSql.append(" and " + column.value() + " in (" + value + ") ");
                            } else {
                                sbSql.append(" and " + column.value() + " like '%" + value + "%' ");
                            }
                        } else {
                            sbSql.append(" and " + column.value() + "=" + value + " ");
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sbSql.toString();
    }

    /**
     * 检查给定的值是不是 id 类型 1.检查字段名称 2.检查字段值
     *
     * @param target
     * @return
     */
    public static boolean isNum(String target) {
        boolean isNum = false;
        if (target.toLowerCase().contains("id")) {
            isNum = true;
        }
        if (target.matches("\\d+")) {
            isNum = true;
        }
        return isNum;
    }
}
