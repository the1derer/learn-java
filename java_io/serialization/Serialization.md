# Serialization and Deserialization

Serialization: Process of converting an object  into stream.
Deserialization: Process of converting stream back into object.

```
Object ---serialization---> Stream
 ^                             |
 |-------deserialization<------|
```

* Since, only objects(buffer) of Stream of classes can be made to travel, so, to move objects of non-Stream classes we use Serialization-Deserialization to turn object of normal classes to stream classes.

## Advantages of serialization

1. To save the state of object(current value of its DM)(state of object changes when any event occurs on it) or to persist an object.

For Ex:
We want to save an ob

2. To travel an object on a network.

Node-1 -> object -> serialized -> network -> deserialized -> object -> Node-2

## Rules and Regulations to convert objects to Streams

1. Only the objects of those classes can be serialized which are implementing the `Serializable` interface(to put restriction).

* Serializable` is a marker interface, that means it doesn't have any method.

### Situation in which marker interfaces are made / why we have no methods in `Serializable`

* When we make a object of class that is implementing a `Serializable` it simply converts this object into Stream, no method is ran on this object.
* So we have no method in `Serializable` interface.

2. If a parent class has implemented `Serializable` interface, then, child class doesn't need to implement it. But, vice-versa is not true.

3. Only the instance DM of a class are saved via serialization process. Coz only instance DM are those in object buffer.

4. `static` DM and `transient` DM are not saved via serialization process.
5. If you don't want the value of any non-static data member via serialization process, then make it transient.

6. When we deserialize an object, the constructor of that class is never executed.

```java
class Emp implements Serializable {
    int salary;
    Temp t = new Temp();

    Emp() {
        salary = 1000;
    }

    void salaryChange(int salary) {
        this.salary = salary;
    }

    psvm() {
        Emp e1 = new Emp();
        Sysout(e1.salary);
        e1.salaryChange(25000);
    }

    class Temp {...}
}
```

7. The classes of associated object mut be implementing a `Serializable` interface.

8. The serializable compile-time associates with each serializable class a version number, called a 'serialVersionUID', which is used during deserialization, to verify  that the sender and receiver of a serialized object have loaded classes for that object that are compatible with respect to serialization.
If the receiver has loaded a class for the object that has a diff. 'serialVersionUID' then that of the corresponding sender's class, then deserialization will result in an InvalidClassException. A serializable class can declare its own serialVersionUID explicitly by declaring a field named 'serialVersionUID' that must be static final and of type long.serial

    `ANY-ACCESS-MODIFIER static final long serialVersionUID=42L;`

If a serializable class doesn't explicitly declare a 'serialVersionUID', then the serialization runtime will calculate a default 'serialVersionUID' value for that class based on various aspect of the class, as described in the Java Object Serialiaztion Specification.
However, it is strongly recommended that serializable class explicitly declare 

[serialization remaining notes](./Serialization_remaining_notes.pdf)
