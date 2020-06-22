package org.syspar.tests;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class SortedHashMap {

    public static Map<String, Integer> sortByValue(final Map<String, Integer> map, boolean ascend) {
        if (!ascend)
            return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).collect(
                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        else
            return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue()).collect(
                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    public static Map<String, Integer> sortByKey(final Map<String, Integer> map, boolean ascend) {

        if (!ascend) {

            return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey().reversed()).collect(
                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        } else {

            return map.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByKey()).collect(
                    Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            // Use below statement to compare strings for ignore case return
            /*
             * return map.entrySet().stream() .sorted((e1, e2) ->
             * e2.getKey().toLowerCase().compareTo(e1.getKey().toLowerCase()))
             * .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) ->
             * e1, LinkedHashMap::new));
             */
        }
    }

    public static <K, V, E> void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("USA", 100);
        map.put("jobs", 200);
        map.put("Software", 50);
        map.put("technology", 70);
        map.put("opportunity", 200);

        Map<String, Integer> resultMap = sortByValue(map, true);
        System.out.println("After Sorting values:");
        Set<Entry<String, Integer>> set2 = resultMap.entrySet();
        Iterator<Entry<String, Integer>> iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Entry<String, Integer> me2 = (Entry<String, Integer>) iterator2.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }

        Map<String, Integer> map1 = sortByKey(map, true);
        System.out.println("After Sorting keys:");
        Set<Entry<String, Integer>> set21 = map1.entrySet();
        Iterator<Entry<String, Integer>> iterator21 = set21.iterator();
        while (iterator21.hasNext()) {
            Entry<String, Integer> me2 = (Entry<String, Integer>) iterator21.next();
            System.out.print(me2.getKey() + ": ");
            System.out.println(me2.getValue());
        }
    }
}