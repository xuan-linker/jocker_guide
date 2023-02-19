package base;

/**
 * @author Linker
 * @date 2/10/2023 11:43 PM
 * @description：the bases of Java first
 * 封装、继承、多态
 *
 *  - 结构图？
 */
public class Demo1 {

    public static void main(String[] args) {
        System.out.println("Hello world");
    }

    /**
     * 封装(Encapsulation)
     * 保护隐藏
     * 保护变量，控制接口
     * 保护方法，控制访问
     */
    public class Jocker {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * 继承 extend
     */
    /**
     * simple extend
     */
    class Parent {
    }

    class Child extends Parent {
    }

    public class Animal {
        private String name;
        private int age;

        public Animal(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    /**
     * 子类继承父类一定要有子类的构造方法
     * 可以单继承、多重继承、不同类继承同一个类
     * 不支持多继承
     */

    public class Dog extends Animal {
        public Dog(String name, int age) {
            super(name, age);
        }
    }

    private class Cat extends Animal {
        public Cat(String name, int age) {
            super(name, age);
        }
    }

    public interface behaviour {
        public void bark();

        public void eat();
    }

    protected interface move {
        public void forword();

        public void back();
    }
    /**
     * 父类构造器无参，子类继承后无需super即可调用父类构造器
     *
     * 父类构造器有参，子类继承后必须再显示使用参数构造器
     */
    public class Kitty{
        public Kitty(){
            System.out.println("无参构造");
        }
    }
    public class King extends Kitty{
        public void say(){
            System.out.println("King be used");
        }
    }
    public class Kitty2{
        public Kitty2(String name){
            System.out.println("有参构造 "+name);
        }
    }
    public class King2 extends Kitty2{
        public King2(String name) {
            super(name);
        }

        public void say(){
            System.out.println("King be used");
        }
    }

}
