package Zad3;

public class Computer {
    private String name;
    private int cpu;
    private int ram;

    public Computer(String name, int cpu, int ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "name='" + name + '\'' +
                ", cpu=" + cpu +
                ", ram=" + ram +
                '}';
    }

//    @Override
//    public int compareTo(Computer o) { //mozna rozpisac kazdy przypadek osobno,
//        if (o == null){
//            return 1;
//        }
////        if (this.cpu > o.cpu) {
////            return 1;
////        }else if (this.cpu ==o.cpu) {
////            if (this.ram > o.ram)
////                return 1;
////            else if (this.ram == o.ram) {
////                return this.name.compareTo(o.name);
////            } else
////                return -1;
////        }else {
////            return -1;
////        }
//        return this.name.compareTo(o.name);
//    }
}
//        po prędkości procesora
//        jeśli prędkość procesora jest taka sama, to uwzględnij ilość pamięci
//        jeśli ilość pamięci jest taka sama to uwzględnij nazwę w kolejności alfabetycznej
//        Wyświetl posortowaną listę na ekranie
