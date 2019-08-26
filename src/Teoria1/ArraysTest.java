package Teoria1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.lang.System.out;

public class ArraysTest {
    public static void main(String[] args) {
//        int[] t1 ={4, 7, 2, 9, 5, 1};
//        int[] t2 ={4, 7, 2, 9, 1, 5};
//
//        int search = Arrays.binarySearch( t1, 2);
//        System.out.println(search);
//
//        System.out.println(Arrays.equals(t1, t2));
//        System.out.println(Arrays.asList(t1));
//        Arrays.sort(t1);
//        System.out.println(t1);

        List<Integer> ints = Arrays.asList(4, 7, 2, 9, 5, 1);
        Integer min = Collections.min(ints);
        Integer max = Collections.max(ints);
        out.println(min);

        Collections.shuffle(ints);
        out.println(ints);
        int freq = Collections.frequency(ints, 7);
        Collections.sort(ints);
        out.println(ints);



        }
    }

