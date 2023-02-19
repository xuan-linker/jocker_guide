package spring;

/**
 * @author Linker
 * @date 2/19/2023 12:27 AM
 * @description：Spring IoC
 */
public class Demo2 {
    /**
     * IoC(Inversion of Control:控制反转) - 设计思想
     * - 创建对象由Spring管理
     *
     * - 控制 - 对象创建(实例化、管理)
     * - 反转 - 控制权交给外部环境(Spring框架、IoC容器)
     *
     * IoC 容器就像是一个工厂,当我们需要创建一个对象的时候,只需要配置好配置文件/注解即可,
     *   ，完全不用考虑对象是如何被创建出来的。
     *
     *  IoC 容器实际上就是个 Map（key，value），Map 中存放的是各种对象
     *
     *
     */

    /**
     * 什么是 Spring Bean？
     * Bean 是被 IoC 容器所管理的对象
     */

    /**
     * 将一个类声明为 Bean 的注解有哪些?
     *
     * @Component:通用的注解,可标注任意类为 Spring 组件,
     * @Repository:持久层即 Dao 层，主要用于数据库相关操作
     * @Service:服务层，主要涉及一些复杂的逻辑，需要用到 Dao 层
     * @Controller:Spring MVC 控制层，用户接受用户请求并调用 Service 层返回数据给前端页面
     */

    /**
     * @Component 和 @Bean 的区别是什么？
     * @Component - 类
     * @Bean - 方法
     * 
     *
     */

}
