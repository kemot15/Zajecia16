package Zad3;

import java.util.Comparator;

public class NameCompare implements Comparator<Computer> {

    @Override
    public int compare(Computer o1, Computer o2) {
        if (o1 == null && o2 == null)
            return 0;
        if (o1 ==null && o2 !=null)
            return -1;
        if (o1 !=null && o2 ==null)
            return 1;
        if (o1.getRam() > o1.getRam())
            return 1;
        if (o1.getRam() < o2.getRam())
                return -1;
        return 0;


    }
}


//    Przerób kod w taki sposób, aby komputery domyślnie były sortowane na podstawie nazwy (alfabetycznie).
//    Zdefiniuj dwa dodatkowe komparatory, które pozwolą posortować je po prędkości procesora lub ilości pamięci ram.
//
//        Stwórz tablicę z przynajmniej trzema różnymi komputerami.
//        Poproś użytkownika o podanie kryterium sortowania (nazwa, cpu, ram), posortuj tablicę i wyświetl ją na ekranie.
