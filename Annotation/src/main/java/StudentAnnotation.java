import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @ClassName annotation
 * @Description @Target 表示该注解可以用于什么地方，可能的ElementType参数有：
 *                      1.CONSTRUCTOR：构造器的声明
 *                      2.FIELD：域声明（包括enum实例）
 *                      3.LOCAL_VARIABLE：局部变量声明
 *                      4.METHOD：方法声明
 *                      5.PACKAGE：包声明
 *                      6.PARAMETER 参数声明
 *                      7.TYPE：类、接口（包括注解类型）或enum声明
 * @Todo
 * @Author Arnold
 * @Date 2019/3/26 23:10
 * @Version 1.0
 **/
@Target({ElementType.ANNOTATION_TYPE,ElementType.CONSTRUCTOR,ElementType.FIELD,ElementType.LOCAL_VARIABLE,ElementType.METHOD,
ElementType.PACKAGE,ElementType.PARAMETER,ElementType.TYPE})
public @interface StudentAnnotation {
    public String name(); //作为一个属性不是我们认为的方法
    public char sex(); //作为一个属性不是我们认为的方法
    public int age(); //作为一个属性不是我们认为的方法
}
