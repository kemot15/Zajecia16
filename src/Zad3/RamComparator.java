package Zad3;

import java.util.Comparator;

public class RamComparator implements Comparator<Computer> {
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
