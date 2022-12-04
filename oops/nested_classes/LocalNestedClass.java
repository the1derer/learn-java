package oops.nested_classes;


/*
 * If you made local class within a static fn of a outer class, only access static things of outer class in local class.
 * If made local class within non-static then it access all the DM and fn of outer class
 */
class OuterEx1 {
    int x =10;
    static int y =20;

    void display() {
        class Inner {
            void show() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        Inner i = new Inner();
        i.show();
    }

    public static void main(String[] args) {
        OuterEx1 o = new OuterEx1();
        o.display();
    }
    
}
// above show() fn is ran by inner class, now we can to run it by outer class
class OuterEx2 {
    int x=10;
    int y = 20;

    My display() {
        class Inner implements My {
            public void show() {
                System.out.println(x);
                System.out.println(y);
            }
        }
        My M = new Inner();
        return M; // ref. present in 'M' being returned when display() is called
    }

    public static void main(String[] args) {
        OuterEx2 o = new OuterEx2();
        My z = o.display();
        z.show();
    }
}

interface My {
    void show();
}