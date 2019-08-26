package Zad3;

import java.util.Comparator;

public class CpuComparator implements Comparator<Computer> {

    public int compare(Computer o1, Computer o2) {
        if (o1 == null && o2 == null)
            return 0;
        if (o1 ==null && o2 !=null)
            return -1;
        if (o1 !=null && o2 ==null)
            return 1;
        if(o1.getCpu()> o2.getCpu())
            return 1;
        if(o1.getCpu()<o2.getCpu())
            return -1;

        return 0;
    }
}
