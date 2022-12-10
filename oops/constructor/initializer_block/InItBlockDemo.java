package oops.constructor.initializer_block;


class InitializerBlockDemo {
    int x;

    { // init block start
        x =10; // OR `this.x = 10`
        System.out.println("init block");
    }

    InitializerBlockDemo() {
        System.out.println(x + " default");
    }

    InitializerBlockDemo(int x) {
        System.out.println(x + " parameterized constructor");
    }

    { // 2ns init block start
        System.out.println("Second init block");
    }

    public static void main(String[] args) {
        new InitializerBlockDemo();
        new InitializerBlockDemo(10);
        new InitializerBlockDemo();
    }

}


