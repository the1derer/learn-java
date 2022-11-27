package generics;

class Gen<T> {

    T ob;

    Gen(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        Class c = ob.getClass();// getting class of object at runtime
        System.out.println(c.getName());
    }  
}

public class GenericsDemo {
    public static void main(String[] args) {
        Gen<Integer> iOb = new Gen<Integer>(98);
        iOb.showType();
        int v = iOb.getOb(); // unboxing
        System.out.println(v);

        Gen<String> strOb = new Gen<> ("Geneeric Test"); // diamond('<>') operator
        strOb.showType();
        String str = strOb.getOb();

        System.out.println("value:" + str);
        
        Emp e1 = new Emp();
        Gen <Emp> eOb = new Gen<>(e1);
        eOb.showType();
        Emp e2 = eOb.getOb();
        System.out.println(e2.x);
    }
}

class Emp { int x = 200; }


//------------

class TwoGenerics<T, V> {
    T ob1;
    V ob2;

    TwoGenerics(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    void showType() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }
}

//----------------------------

class ThreeGenerics<T, V, lalu> {
    T ob1;
    V ob2;
    lalu ob3;

    ThreeGenerics(T o1, V o2, lalu o3) {
        ob1 = o1;
        ob2 = o2;
    }

    void showType() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
        System.out.println(ob3.getClass().getName());
    }
}

//----------------------------

/*
 * IMP: Bounding:- Binding generic datatype with a class, i.e. Generic class can only be replaced with objects of that class or its child classes.
 * 
 */

class Stats<T extends Number> {
    T[] nums;

    Stats(T[] o) {
        nums = o;
    }

    double average() {
        double sum=0.0; //= 0.0;
        for(T i : nums)
            sum += i.doubleValue(); // 'Number' class fn that convert objects of Number or its child to Double.
        return sum/nums.length;
    }
}

class BoundDemo {
    public static void main(String[] args) {
        Integer inums[] = {1, 2, 3, 4, 5}; //boxing
        Stats<Integer> iob = new Stats<>(inums);

        double v = iob.average();
        System.out.println(v);

        Stats<Double> dob = new Stats<> (new Double[] {1.1, 2.2, 3.3, 4.4, 5.5});// anon array

        double w= dob.average();
        System.out.println(w);

        // Stats<String> sob = new Stats<> (new String[] {"aa"}); // will give compilation error as generic is bound by 'Number' class
    }
}

//-------------------------------------

/*
 * Array of ref. variable of generic  class -- https://www.baeldung.com/java-generics#wildcards
 */
class Temp<T> {
    T x;
    T y;

    Temp(T x, T y) {
        this.x = x;
        this.y = y;
    }

    public static void main(String[] args) {
        Temp<?> t[] = new Temp<?>[10]; // '?' this creates array of ref. variable array doesn't create object. Here '?' mak sure tat aot all ref. variable has same class object

        t[0] = new Temp<Integer>(10, 20);
        t[1] = new Temp<Double>(20.9, 20.0);
        t[2] = new Temp<String>("str", "20");


    }
}


class Generics<T extends Number> {
    T ob;

    T vals[];

    Generics(T o, T[] nums) {
        ob = o;
        vals = nums;
    }
}

class GenArray {
    public static void main(String[] args) {
        Integer [] n = {1, 2, 4, 6, 7};
        Generics<Integer> iOb = new Generics<>(50, n);

        // Generics<Integer> gen[] = new Generics<Integer>[10]; // compilation error as we can't create an array of type-specific generic refernces;
        Generics<?> gens[] = new Generics<?>[2]; //ok

        gens[0] = new Generics<Integer>(10, n);
        gens[1] = new Generics<Float>(2.3f, new Float[] {1.1f, 2.3f});
    }
}

//---------------------------------------------------------

// Making local variables generic

class GenericConstructor {
    private double val;

    <T extends Number> GenericConstructor(T args) {
        val = args.doubleValue();
    }

    void showVal() {
        System.out.println(val);
    }
}

class GenericConstructorDemo {

    public static void main(String[] args) {

        // GenericConstructor test1 = new GenericConstructor('a'); // gives compilation error as 'Character' is not a child of Number and Gereric is bounded by 'Number' class
        GenericConstructor test = new GenericConstructor(100);
        GenericConstructor test2 = new GenericConstructor(123.5F);

        test.showVal();
        test2.showVal();
        
    }

}

/* ------------------------------------------------------------------------------
 * Generics in Method
 */

class GenMethDemo {

    static <T, V extends T> boolean isIn(T x, V[] y) { // declare generics after modifier
        for(T i : y)
            if(x.equals(i)) return true;

        return false;
    }

    static <T extends Number> double add (T x, T y) {
        double d = x.doubleValue() + y.doubleValue();
        return d;
    }
}

/* --------------------------------------------------------------------------------------------------
 * Generics in Hierarchy
 */

class NonGen { // parent class is non-generic
    int num;

    NonGen(int i) {
        num = i;
    }

    int getNum() {
        return num;
    }
}

class GenericsHier1<T> extends NonGen {
    T ob;

    GenericsHier1(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class HierDemo2 {
    public static void main(String[] args) {
        GenericsHier1<String> w = new GenericsHier1<String>("hello", 47);
        System.out.println(w.getOb());
        System.out.println(w.getNum());
    }
}

//------------------

class GenericParent<T> {
    T ob;

    GenericParent(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }
}

class GenericChild<T> extends GenericParent<T> {

    GenericChild(T o) {
        super(o);
    }
}

class HierDemo3 {
    public static void main(String[] args) {
        
        GenericParent<Integer> iOb = new GenericParent<>(88);

        GenericChild<Integer> iOb2 = new GenericChild<>(99);
        GenericChild<String> strOb2 = new GenericChild<>("Generics Test");

        if(iOb2 instanceof GenericChild<?>)
            System.out.println("iOb2 is instance of GenericChild");
        
        if(iOb2 instanceof GenericParent<?>)
            System.out.println("iOb2 is instance of GenericParent");
        
        if(strOb2 instanceof GenericParent<?>)
            System.out.println("strOb2 is instance of GenericParent");
        
        //see if iOb is an instance of GenericChild, which it is not
        if(iOb instanceof GenericChild<?>)
            System.out.println("iOb is instance of GenericChild");
    }
}

// TODO: Upper-bound and lower-bound wildcard --> <? extends Number> <? super Number>