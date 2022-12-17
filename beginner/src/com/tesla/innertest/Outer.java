package com.tesla.innertest;

public class Outer {
    public int num = 777;
    // 可以在外部类中创建内部类的对象
    Inner inner = new Inner();
    private String name = "Tom";

    public void show() {

        System.out.println(name);
        inner.test();
    }

    public void identify() {
        String game = "Football Manager";

        class InnerInFunc {
            public void show() {
                System.out.println(game);
            }
        }

        // 调用局部内部类中的方法需要创建局部内部类对象且必须写在创建局部内部类之后
        InnerInFunc iif = new InnerInFunc();
        iif.show();
    }

    // 定义在类中与成员方法同级的类是成员内部类
    public class Inner {
        public String name = "Tylor";

        public void show() {
            System.out.println("公有成员内部类中的show方法");

            // 成员内部类可以使用外部类的公有成员变量
            System.out.println(num);

            // 成员内部类可以使用外部类的私有成员变量
            System.out.println(name);

            // 当内部类定义了与外部类重名字的成员变量时调用外部类的成员变量
            System.out.println(Outer.this.name);
        }

        public void test() {
            System.out.println("可以在外部类中创建内部类的对象");
        }
    }
}
