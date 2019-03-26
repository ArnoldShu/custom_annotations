# custom_annotations

#### 介绍
注解以及自定义注解的相关知识

#### 注解知识点
1.Java提供了一种原程序中的元素关联任何信息和任何元数据的途径和方法。

2.java 1.5引入注解其中Java SE5内置了三种标准注解：

     @Override，表示当前的方法定义将覆盖超类中的方法。

     @Deprecated，使用了注解为它的元素编译器将发出警告，因为注解@Deprecated是不赞成使用的代码，被弃用的代码。

     @SuppressWarnings，关闭不当编译器警告信息。
 
3.元注解
| 注解名称 | 作用 |
| --------| ---- |
| @Target | 表示该注解可以用于什么地方，可能的ElementType参数有：1.CONSTRUCTOR：构造器的声明 2.FIELD：域声明（包括enum实例）3.LOCAL_VARIABLE：局部变量声明 4.METHOD：方法声明 5.PACKAGE：包声明 6.PARAMETER 参数声明 7.TYPE：类、接口（包括注解类型）或enum声明 |
| @Retention | 表示需要在什么级别保存该注解信息。可选的RetentionPolicy参数包括：1.SOURCE：注解将被编译器丢弃 2.CLASS：注解在class文件中可用，但会被VM丢弃 3.RUNTIME：VM将在运行期间保留注解，因此可以通过反射机制读取注解的信息 |
| @Document | 将注解包含在Javadoc中 |
| @Inherited | 允许子类继承父类中的注解 |


4.自定义注解       
     ![自定义注解语法](https://images.gitee.com/uploads/images/2019/0326/160427_1fd9acc2_1635774.jpeg "1553587433(1).jpg")



