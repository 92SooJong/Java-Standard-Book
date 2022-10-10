# Generics

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

## Generic Method
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



## Wild Card

It looks fine(Integer is sub-class of Object), but it doesn't work.
Because List<Integer> is not sub-class of List<Object>.
```java
public class GenericMethodMain {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        //printList(intList); error!!

    }
    
    private static void printList (List<Object> myList) {
        System.out.println();
    }

}
```

you can use wild card(question mark) when you don't know what exactly generic type is going to be.
```java
public class GenericMethodMain {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList); // it works

    }
    
    private static void printList (List<?> myList) {
        System.out.println();
    }

}
```


you can also use `extends` keyword for boundary in wild card.
printList's parameter must be child of Animal.

```java
import com.soojong.basic.generics.Animal;

public class GenericMethodMain {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        //printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);

    }

    private static void printList(List<? extends Animal> myList) {
        System.out.println();
    }

}
```