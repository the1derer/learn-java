# Rule: F^n overloading can only be achived by change in arguments

1. Access Modifiers don't play any role in case of F^n overloading
    public void show()
    private void show()
    static void show() 
All of the the above are same.


2. F^n Name can't be changed for F^n overloading.

# F^n Overloading by change in Arguments

1. Change in number of argumets for each F^n
Eg.
    void show()
    void show(int x)
    void show(int x, int y)
    void show(int x, int y, char c)

2. Change in data type
Eg. 
    void show(bye b)
    void show(short s)
    void show(int x)
    void show(long l)

 **Some scenarios**


    void show(int x, long l)
    void show(long l, int x)

* Below will compile without error as data types are different:
    show(10, 10L)
    show(10L, 10)

* Below will give compilation error because of exact match for both fuctions after promotion hence producing ambiguity
    show(10, 10)


# [Can't be achived] F^n overloading by change in return type
Eg. Below will give error:
    void show(int x) {}
    int show(int x) { return x;}
    show(10)
