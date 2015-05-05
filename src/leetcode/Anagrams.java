package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;


/**
 * Created by 7 
 * @BayArea
 * 7:15:46 PM
 * May 4, 2015
 * Given an array of strings, return all groups of strings that are anagrams.

Note: All inputs will be in lower-case.
For example, ["tea","and","ace","ad","eat","dan"] => ["and", "dan", "tea", "eat"]
 */
public class Anagrams {
	public static String sortChars(String s) {
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }   

    public static ArrayList<String> anagrams(String[] strs) {
        
        HashMap<String, LinkedList<String>> hash = new HashMap<String, LinkedList<String>>();
        for (String s : strs) {
            String key = sortChars(s); 
            if (!hash.containsKey(key)) {
                hash.put(key, new LinkedList<String>());
            }   
            LinkedList<String> anagrams = hash.get(key);
            anagrams.add(s);        
        } 
        
        ArrayList<String> result = new ArrayList<String>();
        for (String key : hash.keySet()) {
            LinkedList<String> list = hash.get(key);
            if (list.size() > 1) {
                for (String s : list) {
                    result.add(s);
                }   
            }
        }   
        return result;
    }
}
