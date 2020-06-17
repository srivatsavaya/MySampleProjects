package org.syspar.tests;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class RepeatedWordCount {
    

    public static Map<String, Integer> findRepeatedWords(String s) {

        List<String> listWords = Arrays.asList(s.replace(".", "").split(" "));

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < listWords.size(); i++) {
            String word = listWords.get(i);
            
            if (!map.containsKey(word)) {
                map.put(word, Collections.frequency(listWords, word));
            }
        }

        return map;
    }

    public static void main (String[] args){
        System.out.println("*** Hello Repeated Word Count ***");

        Map<String, Integer> map = findRepeatedWords("Hello Count. of Repeated. Word Count");

        Iterator<Entry<String, Integer>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String, Integer> me = iter.next();
            System.out.println(me.getKey() + ": " + me.getValue());
        }

    } 
}