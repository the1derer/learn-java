package nested_classes;

class Outer {

    int x = 10;
    static int y =20;

    class Inner {
        void show() {
            System.out.println(x);
            System.out.println(y);
        }
    }    
}

class Temp {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.new Inner();
        i.show();
    }
}
