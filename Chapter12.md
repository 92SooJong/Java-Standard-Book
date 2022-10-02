# Chapter 12 - Generics ,Enum, Annotation

## 1.6 Generic Method
Generic Method has Generic Type on method head.

For example, `Collections.sort` method is Generic Method.
```java
static <T> void sort(List<T> list, Comparator<? super T> c)
```
you have to divide between Generic class Type and Generic method type.
If they use same Type Character(like T), It is different.
In static method, we can't use Generic Type on parameter, but When using Generic Method, it is exception 
```java
class Fruit<T>{
    //...
    public static <A> void sort(List<A> list, Comparator<? super A> c){
        //...
    }
}
```

You can use simultaneously class and interface for generic type. (Animal is class, Serializable is interface)
Class must come before interface. Be careful that interface doesn't use `implements`.
now generic Type (T) must be child of Animal & Serializable
```java
public class Printer <T extends Animal & Serializable> {
    T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
```

