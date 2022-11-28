
### Que: Can we make our own class immutable?
Yes, since we can't change values present in objects of Immutable class, and values carried in objects are hold in non-Static Data Member(DM),
to make non-Static DM unchangeable we can make them **`private` & 'blank `final`'** & initialize  them via constructors.

---

## Rules/Ways to Make Custom Immutable class

1. Don't provide "setter" methods(methods that modify field or objects referred to by fields).
2. Make all fields **`private` & 'blank `final`'**.
3. Don't allow sub-classes(child classes) to override methods. The simplest way to do this is declare the class as final.
    **`String` class is also final.
4. A more sophisticated approach is to make the constructor private and construct instance in factory method.
    i. Now, if we make constructors of any class `private`, no other class will be able to construct object of that class.
    ii. So, we have to provide a method which can make objects on calling this method. This method is called **factory method**.

###### Example of above point

```java
class FactoryExample {
    private FactoryExample() {
        /*
         * This private constructor can't be used outside this class to create objects of this class.
        */
    }

    public static FactoryExample getInstance() {
        return new FactoryExample();
    }

    public static void main(String arg[]) {
        FactoryExample factoryObj = FactoryExample.getInstance();
    }
}

class Demo {
    public static void main(String[] args) {
        // FactoryExample constructorObj = new FactoryExample(); // not allowed
        FactoryExample factoryObj = FactoryExample.getInstance();
    }
}
```

5. If the instance fields include references to mutable objects, don't allow these objects to be changed.
###### Example:-
When we have object of another mutable class in our immutable class i.e. during HAS-A relationship, we are not allowing changes in object via our immutable class, but there is a possibility that reference-id of same object can be present elsewhere leading to change in it. So, we have to make sure that reference-id of this object is not shared elsewhere.

6. Don't provide methods that modify the mutable objects.
7. Don't share reference to the mutable object.
8. Never store reference to external mutable objects passed to the constructor. If necessary, create copies and store references to copies.
   Similarly create copies of your internal mutable objects when necessary to  avoid returning the originals in your methods.
