package Zad2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("b", "c", "d", "a", "b", "a", "z", "e", "a", "d");//new LinkedList<>();
//
//        stringList.add("a");
//        stringList.add("e");
//        stringList.add("g");
//        stringList.add("s");
//        stringList.add("h");
//        stringList.add("a");
//        stringList.add("g");
//        stringList.add("a");
//        stringList.add("a");
//        stringList.add("a");

        System.out.println("Lista niepostortowana: " + stringList);
        Collections.sort(stringList);
        System.out.println("Lista posortowana: " + stringList);
        Collections.reverse(stringList);
        System.out.println("Lista odwrocona: " + stringList);
        Set<String> stringSet = new TreeSet<>();
        Map<String, Integer> map = getUniqeMap(stringList);
        System.out.println(map);

        String word = getMaxFrequencyWord(map);
        System.out.println(word);




        System.out.println("Elementy unikatowe" + stringSet);
    }

    private static String getMaxFrequencyWord(Map<String, Integer> map) {
        String mostFrequent = null;
        int maxFreq = 1;
        Set<String> strings = map.keySet();
        for (String s: strings){
            if (maxFreq < map.get(s)){
                maxFreq = map.get(s);
                mostFrequent = s;
            }
        }
        return mostFrequent;

    }

    private static Map<String, Integer> getUniqeMap (List<String> list){
        Map<String,Integer> map = new TreeMap<>();
        for (String s: list) {
            if(map.containsKey(s)){
                map.put(s, map.get(s)+1);
            }
            else
                map.put(s,1);
        }
        return map;
    }
}

//    Stwórz listę z 10 napisami, z których część będzie się powtarzała. Następnie wyświetl na ekranie:
//
//        nieposortowaną listę
//        posortowaną listę
//        listę posortowaną w odwrotnej kolejności
//        * liczbę wystąpień unikalnych elementów
//        * informację o tym jaki element powtarza się najczęściej