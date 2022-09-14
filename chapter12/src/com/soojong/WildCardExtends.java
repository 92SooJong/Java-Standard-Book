package com.soojong;

import java.util.ArrayList;

/**
 * 680 페이지
 *
 * 제네릭 와일드 카드 extends 예시 코드
 */
public class WildCardExtends {

    public static void run(){
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));

    }
}

class Fruit { public String toString() { return "Fruit";}}
class Apple extends Fruit { public String toString() { return "Apple";}}
class Grape extends Fruit { public String toString() { return "Grape";}}


class Juice{
    String name;

    Juice(String name) { this.name = name +"Juice";}
    public String toString() { return name; }
}

class Juicer{
    static Juice makeJuice(FruitBox<? extends  Fruit> box){
        String tmp = "";

        for(Fruit f : box.getList()) tmp += f + " ";
        return new Juice(tmp);
    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();

    void add(T item){ list.add(item);}
    T get(int i){return list.get(i);}
    ArrayList<T> getList() {return list;}
    int size(){return list.size();}
    public String toString(){return list.toString();}
}

class FruitBox<T extends Fruit> extends Box<T>{}




