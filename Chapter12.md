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


