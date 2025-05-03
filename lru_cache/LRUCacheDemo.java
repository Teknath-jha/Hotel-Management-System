package lru_cache;

public class LRUCacheDemo {
    public static void main(String[] args) {
        LRUCache<Integer, String> lruCache = new LRUCache<>(4);

        lruCache.put(1, "Apple");
        lruCache.put(2, "Mango");
        lruCache.put(3, "Banana");
        lruCache.put(4, "Grapes");

        System.out.println(lruCache.get(1)); 
        System.out.println(lruCache.get(2));

        lruCache.put(5, "Eviction");

        System.out.println(lruCache.get(3)); // null, as it was evicted
        System.out.println(lruCache.get(4)); 

        lruCache.put(2, "Guava"); // updated one 

        System.out.println(lruCache.get(1)); 
        System.out.println(lruCache.get(2)); 
    }
}
