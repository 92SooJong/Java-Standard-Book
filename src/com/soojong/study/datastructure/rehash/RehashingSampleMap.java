package com.soojong.study.datastructure.rehash;

import java.util.ArrayList;

public class RehashingSampleMap<K,V> {

    // HashMap에서 사용할 Node의 구조를 정의한다
    class Node<K, V> {

        K key;
        V value;
        Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    ArrayList<Node<K, V>> buckets;
    int size; // 전체 Node의 개수
    int numBuckets; // 버킷의 개수

    final double DEFAULT_LOAD_FACTOR = 0.75;

    public RehashingSampleMap() {

        numBuckets = 5; //Initial Bucket Number is 5

        buckets = new ArrayList<>(numBuckets);

        for (int i = 0; i < numBuckets; i++) {
            buckets.add(null);
        }
        System.out.println("HashMap created");
        System.out.println("Number of pairs in the Map: " + size);
        System.out.println("Size of Map: " + numBuckets);
        System.out.println("Default Load Factor : " + DEFAULT_LOAD_FACTOR + "\n");
    }

    private int getBucketIndex(K key) {

        // Using the inbuilt function from the object class
        int hashCode = key.hashCode();

        // array index = hashCode%numBuckets
        return (hashCode % numBuckets);
    }

    public void insert(K key, V value) {
        // key와 매칭된 bucket의 인덱스
        int bucketIndex = getBucketIndex(key);

        // bucket을 가져온다. 이 뜻은 각 버켓의 Head Node를 가져온다는 뜻!!
        Node<K, V> head = buckets.get(bucketIndex);

        // bucket내에 이미 존재하고 있는 key인지 검사하고 존재한다면 value를 덮어쓰기 하고 종료
        while (head != null) {

            // If already present the value is updated
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // 새로운 노드를 만든다
        Node<K, V> newElementNode = new Node<>(key, value);

        // 새로운 노드를 넣을 bucket을 가져온다
        head = buckets.get(bucketIndex);

        // 새로 들어온 Node의 next를 첫번째 Node로 한다
        // 원형 Linked List 구조!
        newElementNode.next = head;
        // 새로 들어온 element가 Head가 될 수 있도록 한다
        buckets.set(bucketIndex, newElementNode);

        System.out.println("Pair(" + key + ", " + value + ") inserted successfully.\n");

        // 전체 Node 개수를 1 증가 시킨다
        size++;

        // load factor를 재계산 한다.
        double loadFactor = (1.0 * size) / numBuckets;

        System.out.println("Current Load factor = " + loadFactor);

        // If the load factor is > 0.75, rehashing is done
        if (loadFactor > DEFAULT_LOAD_FACTOR) {
            System.out.println(loadFactor + " is greater than " + DEFAULT_LOAD_FACTOR);
            System.out.println("Therefore Rehashing will be done.\n");

            // Rehash
            rehash();

            System.out.println("New Size of Map: " + numBuckets + "\n");
        }

        System.out.println("Number of pairs in the Map: " + size);
        System.out.println("Size of Map: " + numBuckets + "\n");
    }

    private void rehash() {

        System.out.println("\n***Rehashing Started***\n");

        // The present bucket list is made temp
        ArrayList<Node<K, V> > temp = buckets;

        // New bucketList of double the old size is created
        buckets = new ArrayList<>(2 * numBuckets);

        for (int i = 0; i < 2 * numBuckets; i++) {
            // Initialised to null
            buckets.add(null);
        }
        // Now size is made zero
        // and we loop through all the nodes in the original bucket list(temp)
        // and insert it into the new list
        size = 0;
        numBuckets *= 2;

        // insert 작업을 다시 수행한다!!!!
        for (int i = 0; i < temp.size(); i++) {

            // head of the chain at that index
            Node<K, V> head = temp.get(i);

            while (head != null) {
                K key = head.key;
                V val = head.value;

                // calling the insert function for each node in temp
                // as the new list is now the bucketArray
                insert(key, val);
                head = head.next;
            }
        }

        System.out.println("\n***Rehashing Ended***\n");
    }

    public void printMap() {

        // The present bucket list is made temp
        ArrayList<Node<K, V> > temp = buckets;

        System.out.println("Current HashMap:");
        // loop through all the nodes and print them
        for (int i = 0; i < temp.size(); i++) {

            // head of the chain at that index
            Node<K, V> head = temp.get(i);

            while (head != null) {
                System.out.println("key = " + head.key + ", val = " + head.value);

                head = head.next;
            }
        }
        System.out.println();
    }

    //Function to get an element from Map
    public V getValue(K key){
        //Get actual index of the key
        int actualIndex = getBucketIndex(key);
        Node<K,V> temp = buckets.get(actualIndex);
        //Search for key in list
        while(temp != null){
            if(temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }




}
