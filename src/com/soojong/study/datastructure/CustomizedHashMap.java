package com.soojong.study.datastructure;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;


// Definition of Hash : https://www.scaler.com/topics/data-structures/hashing-in-data-structure/
public class CustomizedHashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable {

    /**
     *
     * Capacity : the number of buckets
     * Load factor : The Load Factor is a threshold,
     *                  if the ratio of the current element by initial capacity crosses this threshold then the capacity increases
     *                  so that the operational complexity of the HashMap remains O(1).
     * Treeify :
     */
    // int is 4-byte(32-bit)
    // 0000 0000 0000 0000 0000 0000 0001 0000
    static final int DEFAULT_INITIAL_CAPACITY = 1 << 4; // 16 = 2^4

    // 0100 0000 0000 0000 0000 0000 0000 0000
    static final int MAXIMUM_CAPACITY = 1 << 30; // 1073741824 = 2^30

    // 75% of map size
    // 75%를 넘어가면 Capacity를 늘린다
    // 관련 설명 : https://www.scaler.com/topics/data-structures/load-factor-and-rehashing/
    static final float DEFAULT_LOAD_FACTOR = 0.75f;

    // https://stackoverflow.com/questions/43911369/hashmap-java-8-implementation
    // If a bucket contains more than eight items, it should become a tree.
    static final int TREEIFY_THRESHOLD = 8;

    // determine when tree structure is changed to non-tree structure
    static final int UNTREEIFY_THRESHOLD = 6;

    // This constant basically says not to start making buckets into trees if our HashMap is very small
    // it should resize to be larger first instead.
    // CAPACITY가 64개는 넘어야 CAPACITY의 구조가 tree가 될 수 있다. 그전까지는 CAPACITY의 수를 늘리는 방식을 사용한다
    static final int MIN_TREEIFY_CAPACITY = 64;


    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }
}
