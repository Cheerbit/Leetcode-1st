package leetcode;

import java.util.AbstractMap;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;

/**
 * Created by 7 
 * @BayArea
 * 12:15:09 AM
 * Jun 10, 2015
 * Design and implement a data structure for Least Recently Used (LRU) cache. 
 * It should support the following operations: get and set.

get(key) - Get the value (will always be positive) of the key 
if the key exists in the cache, otherwise return -1.

set(key, value) - Set or insert the value if the key is not already present. 
When the cache reached its capacity, 
it should invalidate the least recently used item before inserting a new item.
 */
public class LRUCache {
	private Node head = null;
	private HashMap<Integer, Node> map = new HashMap<Integer, Node>();
	private int capacity = 0;
	
	public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if (map.containsKey(key)) {
        		Node n = map.get(key);
        		remove(n);
        		add(n);
        		return n.entry.getValue();
        } else {
        		return -1;
        }
    }
    
    public void set(int key, int value) {
        if (map.containsKey(key)) {
        		Node n = map.get(key);
        		n.entry.setValue(value);
        		remove(n);
        		add(n);
        } else {
        		Node n = new Node();
        		n.entry = new AbstractMap.SimpleEntry<Integer, Integer>(key, value);
        		add(n);
        		map.put(key, n);
        		if (map.size() > capacity) {
        			Node last = head.prev;
        			remove(last);
        			map.remove(last.entry.getKey());
        		}
        }
    }
    
    public void remove(Node n) {
    		if (n == head) {
    			head = n.next;
    		}
    		n.prev.next = n.next;
    		n.next.prev = n.prev;
    }
    
    public void add(Node n) {
    		if (head != null) {
    			n.prev = head.prev;
    			head.prev.next = n;
    			n.next = head;
    			head.prev = n;
    			head = n;
    		} else {
    			head = n;
    			head.next = n;
    			head.prev = n;
    		}
    }
    
    
}

class Node {
	Node prev;
	Node next;
	AbstractMap.SimpleEntry<Integer, Integer> entry;
}
