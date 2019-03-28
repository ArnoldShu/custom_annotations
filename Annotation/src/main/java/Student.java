/**
 * @ClassName Student
 * @Description 学生类实体
 * @Todo
 * @Author Arnold
 * @Date 2019/3/27 13:05
 * @Version 1.0
 **/
@StudentTableAnnotation("testStudent")
public class Student {
    @StudentFieldAnnotation("name")
    public String name ;

    @StudentFieldAnnotation("sex")
    public String sex ;

    @StudentFieldAnnotation("age")
    public String age ;

    public Student(String name, String sex, String age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
