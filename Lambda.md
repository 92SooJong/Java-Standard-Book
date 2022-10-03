# lambda

## No lambda expression
for practice, we create Printable interface which has one method
```java
public interface Printable {

    void print();

}
```
Cat class implements Printable
```java
public class Cat implements Printable {

    private String name;
    private int age;

    @Override
    public void print() {
        System.out.println("Meow");
    }
}
```
In main class we can use like this.
```java
public class LambdaMain {

    public static void main(String[] args) {
        printThing(new Cat());
    }

    static void printThing(Printable thing){
        thing.print();
    }

}
```
## Lambda expression without parameter
With lambda, you can change code like this. ( Actually, We don't need Cat class anymore to implement Printable )
we can parameterize interface implementation method with no name & return type.
```java
public class LambdaMain {

    public static void main(String[] args) {
        
        // lambda expression
        printThing( () -> {
            System.out.println("Meow");
        });
        
        // simplify
        Printable lambdaPrintable = () -> System.out.println("Meow");
        printThing(lambdaPrintable);

    }

    static void printThing(Printable thing){
        thing.print();
    }

}
```
## Lambda expression with parameter & return
```java
public interface Printable {

    String print(String suffix);

}
```
You don't need to use keyword for return when you don't have any print or complex logic  
```java
public class LambdaMain {

    public static void main(String[] args) {

        Printable lambdaPrintable = (s) -> "Meow" + s;
        printThing(lambdaPrintable);
    }

    static void printThing(Printable thing){
        thing.print("!!");
    }

}
```
For guarantee that interface has single abstract method, we can use `@FunctionalInterface`
When we use `@FunctionalInterface`, compile can easily recognize which interface can be used for Lambda.
```java
@FunctionalInterface
public interface Printable {

    String print(String suffix);

}
```
