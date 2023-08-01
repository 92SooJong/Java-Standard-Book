package com.soojong.study.datastructure.rehash;

public class RehashingMain {

    public static void main(String[] args) {
        // Creating the Map
        RehashingSampleMap<String, String> map = new RehashingSampleMap<>();

        // Inserting elements
        map.insert("1", "Geeks");
        map.printMap();

        map.insert("2", "forGeeks");
        map.printMap();

        map.insert("3", "A");
        map.printMap();

        map.insert("4", "Computer");
        map.printMap();

        map.insert("5", "Portal");
        map.printMap();

        //Get element from Map
        String key = "4";
        String value = map.getValue(key);
        System.out.println("Value at key "+ key +" is: "+ value);

    }

}
