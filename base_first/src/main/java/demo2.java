/**
 * @author Linker
 * @date 2/11/2023 4:07 AM
 * @description：
 */
public class demo2 {
    /**
     * Java 和 C++ 的区别
     * 1. 指针 - C++有指针
     * 2. 继承 - Java类单继承（接口多继承），C++多重继承
     * 3. GC - Java有内存管理垃圾回收机制(GC)
     * 4. 重载 - C++支持方法重载和操作符重载 - Java支持方法重载
     * 同
     * 1. 都支持封装、继承、多态
     *
     */

    /**
     * JVM vs JDK vs JRE
     * JVM(Java Virtual Machine) Java虚拟机
     * JDK (包括 运行环境JRE、 编译器javac、 工具jdb、javadoc)
     * JRE 运行环境(包括JVM)
     */

    /**
     * 解释型语言 - 一句一句解释为机器码再运行 - 开发效率快，执行较慢 - Python、JavaScript
     * 编译型语言 - 一次翻译为机器码 - 执行速度快 - C、C++
     *
     * Java 即有编译也有解释 - Java先编译、后解释 - Java编译成字节码、字节码需要由Java解释器解释执行
     */
    /**
     * OracleJDK - Oracle公司的商业版 - 稳定
     * OpenJDK - 开源，OracleJDK的分支
     */

    /**
     * b = a++
     * b = ++a
     * 符号在前就先加/减，符号在后就后加/减
     */

    /**
     * continue \ break \ return
     * continue - 直接下一次循环
     * break - 终止循环
     * return - 结束方法
     */

    /**
     * 成员变量 \ 局部变量
     * 成员变量属于类 - 局部变量是方法的参数
     * 成员变量 能被 public,private,static修饰 - 局部变量不能被前三者和static修饰 - 都能被final修饰
     * 生存时间 - 成员变量是对象一部分，随对象创建而存在 - 局部变量随方法调用而自动生存、结束而消亡
     * 默认值 - 成员变量未赋值，则默认以类型赋值 (final 显式赋值) - 局部变量不会自动赋值
     */

    /**
     * 静态变量
     * 被所有实例共享，多个对象共享一份静态变量
     * 通常final修饰静态变量为常量
     */

    /**
     * 字符型常量 - ？？ - 2字节
     * 字符串常量 - 地址值，字符串在内存中位置 - 若干字节
     */

    /**
     * 方法
     * 有参/无参 - 有返回值/无返回值
     */
    public void fc1() {
    }

    public void fc2(int a) {
    }

    public int fc3() {
        return 1;
    }

    public int fc4(int a) {
        return a;
    }

    /**
     * 静态方法不能调用非静态成员
     * 1.静态方法属于类，类加载时分配内存，通过类名直接访问 - 非静态成员属于实例对象，对象实例化后通过类的实例对象去访问
     * 2.类的非静态成员不存在时，静态方法已存在，则静态方法调用内存中不存在的非静态成员，非法
     */

    /**
     * 静态方法和实例方法的不同
     * 1.静态方法 调用 类名.方法名 或 对象.方法名(可以但不建议)
     * -实例方法 调用 对象.方法名
     */
    public void method() {
    }

    public static void staticMethod() {
    }

    public static void main(String[] args) {
        demo2 d = new demo2();
        demo2.staticMethod();//类.方法名
        d.method();//对象.方法名
    }

    /**
     * 访问类成员是否存在限制
     * 静态方法访问本类成员，只允许访问静态成员(静态成员变量和静态方法)，不允许访问实例成员(实例成员变量和实例方法)
     * 实例方法无此限制
     *
     * 静静 - 动静、动动
     */

    /**
     * 重载和重写
     * 重载 - 输入数据不同，有不同处理
     * 重写 - 子类继承父类，同方法，输入数据相同，有不同结果(覆盖父类方法)
     *
     * 重载是同一个类中多个同名方法根据不同的传参来执行不用的逻辑处理
     */
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder("重载");

    /**
     * 重写
     * 1.方法名相同、参数列表相同 - 子类返回值类型比父类方法返回值更小或相等
     *                       - 子类抛出异常范围小于等于父类
     *                       - 访问修饰符范围大于等于父类
     * 2.父类修饰符 private\final\static  子类不能重写 - static修饰可以被再次声明
     * 3.构造方法无法被重写
     */





}
