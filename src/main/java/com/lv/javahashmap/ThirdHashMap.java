package com.lv.javahashmap;

/**
 * @Project ：forInterview
 * @Author ：Levi_Bee
 * @Date ：2023/6/2 16:26
 * @description ：自己实现HashMap
 */
public class ThirdHashMap<K, V> {
    /**
     * 节点类
     */
    class Node<K, V> {
        //键值对
        private K key;
        private V value;
        //链表，后继
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Node(K key, V value, Node<K, V> next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    /**
     * 默认容量
     */
    final int DEFAULT_CAPACITY = 16;
    /**
     * 负载因子
     */
    final float LOAD_FACTOR = 0.75f;
    /**
     * HashMap的大小
     */
    private int size;


    /**
     * 桶数组
     */
    Node<K, V>[] buckets;

    /**
     * 无参构造
     */
    public ThirdHashMap() {
        size = 0;
        buckets = new Node[DEFAULT_CAPACITY];
    }

    /**
     * 有参构造器
     */
    public ThirdHashMap(int size, Node<K, V>[] bucket) {
        this.size = size;
        this.buckets = buckets;
    }

    /**
     * @description 哈希函数, 获取地址
     */
    private int getIndex(K key, int length) {
        //获取hash code
        int hashcode = key.hashCode();
        //和桶数组取余
        int index = hashcode & (length - 1);
        return Math.abs(index);
    }

    /**
     * @description put 方法
     */
    public void put(K key, V value) {
        //判断是否需要扩容
        if (size >= buckets.length * LOAD_FACTOR) {


        }
    }

    private void putVal(K key, V value, Node<K, V>[] table) {
        //获取位置
        int index = getIndex(key, table.length);
        Node node = table[index];
        //插入位置为空
        if (node == null) {
            table[index] = new Node<>(key, value);
            size++;
            return;
        }
        //插入位置不为空，说明发生冲突，使用链地址法，遍历链表
        while (node != null) {
            //如果key相同，覆盖
            if ((node.hashCode() == key.hashCode()) && (node.key == key || node.key.equals(key))) {
                node.value = value;
                return;
            }
            node = node.next;
        }
        //当key不再链表中，头插
        Node newNode = new Node(key, value, table[index]);
        table[index] = newNode;
        size++;
    }

    /**
     * 扩容
     */
    private void resize() {
        //创建一个两倍的桶
        Node<K, V>[] newBuckets = new Node[buckets.length * 2];
        //将当前元素重新到新的桶数组
        rehash(newBuckets);
        buckets = newBuckets;
    }

    /**
     * 重新散列当前元素
     */
    private void rehash(Node<K, V>[] newBuckets) {
        //map大小重新计算
        size = 0;
        //将久的桶数组元素重新装到新的桶数组中
        for (int i = 0; i < buckets.length; i++) {
            //为空，跳过
            if (buckets[i] == null) {
                continue;
            }
            Node<K, V> node = buckets[i];
            while (node != null) {
                //将元素访苏新数组
                putVal(node.key, node.value, newBuckets);
                node = node.next;
            }

        }
    }

    /**
     * 获取元素
     */
    public V get(K key) {
        //获取key对应的地址
        int index = getIndex(key, buckets.length);
        if (buckets[index] == null) {
            return null;
        }
        Node<K, V> node = buckets[index];
        //查找链表
        while (node != null) {
            if ((node.hashCode() == key.hashCode()) && (node.key == key || node.key.equals(key))) {
                return node.value;
            }
            node = node.next;
        }
        return null;

    }

    /**
     * 返回hashMap的大小
     */
    public int size() {
        return size;
    }

}
