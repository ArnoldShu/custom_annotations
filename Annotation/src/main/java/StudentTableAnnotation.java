import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/** 
  * @Description: 模拟orm 学生表注解
  * @Param:  
  * @return:  
  * @Author: Arnold 
  * @Date: 2019/3/27 
  * 
 **/ 
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StudentTableAnnotation {
    String value();
}
