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
    @StudentFieldAnnotation(Column="name",type="vachar",length = 10)
    public String name ;

    @StudentFieldAnnotation(Column="sex",type="vachar",length = 10)
    public char sex ;

    @StudentFieldAnnotation(Column="age",type="int",length = 10)
    public int age ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
