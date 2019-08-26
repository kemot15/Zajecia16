package Zad3;

import java.util.*;

public class ComputerTest {
    private static final String CPU_OPTION = "cpu";
    private static final String MEMORY_OPTION = "memory";
    private static final String NAME_OPTION = "name";
    
    public static void main(String[] args) {
        //List<Computer> computers = getComputerArray();
        Computer[] computers = getComputerArray();
//        Collections.sort(computers);
//       // System.out.println(computers);
//        for (Computer computer : computers) {
//            System.out.println(computer);
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Po czum sortowac");
        String option = input.nextLine();
        switch (option){
            case CPU_OPTION:
                Arrays.sort(computers, new CpuComparator());
                break;
            case MEMORY_OPTION:
                    Arrays.sort(computers, new NameCompare());
            default:
                Arrays.sort(computers);
        }





    }

    private static Computer[] getComputerArray() {
        Computer[] computers = {new Computer("Dell", 1500,4),
        (new Computer("Asus", 1500,2)),
        (new Computer("Asus", 1500,8)),
        new Computer("Asus", 500,16)};
        
        return computers;
    }
}


//    Komputer opisywany jest poprzez nazwę (name), prędkość procesora (cpu), ilość pamięci ram (memory). Stwórz listę przechowującą przynajmniej cztery obiekty reprezentujące komputer takie, że:
//
//        jeden z obiektów jest całkowicie unikalny
//        kolejne dwa posiadają taką samą nazwę i procesor, ale różną ilość pamięci
//        ostatni posiada taką samą nazwę jak dwa poprzednie, ale wolniejszy procesor i większą ilość pamięci
//        Posortuj listę:
