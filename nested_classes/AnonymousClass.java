package nested_classes;


// 1st Way
class OuterAnon1 {
    int x =101;
    static int y =202;

    My display() {
        return new My() {
            public void show(){
                System.out.println(x);
                System.out.println(y);
            }
        };
    }

    public static void main(String[] args) {
        OuterAnon1 o = new OuterAnon1();
        My z = o.display();
        z.show();
    }
    
}

interface My { void show();}


// 2nd way ==> when we pass a ref. of interface to a fn, we create a object of a interface in class which implments that interface and pass the ref.
class OuterAnon2 {
    int x =10;
    static int y = 20;
    
    void display(My z) {
        z.show();
    }

    public static void main(String[] args) {
        OuterAnon2 o = new OuterAnon2();
        o.display(new My() {
            public void show() {
                System.out.println("show from 2nd way");
            }
        });
    }
}

// 3rd way

class OuterAnon3 {
    int x =10;
    static int y = 20;
    

    public static void main(String[] args) {
        My z = new My() {
            public void show() {
                System.out.println("show from 3rd way");
            }
        };
        z.show();
    }
}


// 4th way --> marker interface

class OuterAnon4 {
    int x =10;
    static int y =20;

    public static void main(String[] args) {
        My4 z = new My4() {}; // not an interface, but an anonymous class
    }
}

interface My4 {}; // marker interface