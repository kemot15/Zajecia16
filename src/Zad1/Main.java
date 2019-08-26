package Zad1;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int[] numbers = readFile("liczby.txt");
            System.out.println(Arrays.toString(numbers));
            Arrays.sort(numbers);
            System.out.println(Arrays.toString(numbers));

            Arrays.sort(numbers);
            System.out.println("Min " +numbers[numbers.length-1]);
            System.out.println("Min " +numbers[0]);

            System.out.println("15 wystepuje " + Arrays.binarySearch(numbers, 15));
          //  Collections.sort(numberList.);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    private static int[] readFile (String path) throws FileNotFoundException {
        int[] numbers = new int[30];
        String line = "";
        int i = 0;
        Scanner fileReader = new Scanner(new File(path));
            while (fileReader.hasNextLine()){
                numbers[i] = fileReader.nextInt();
                i++;
            }
        return numbers;
    }
}
