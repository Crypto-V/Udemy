package practice.loops;

public class Patrat {
    public static void main(String[] args) {
        //First way of making...
//        System.out.println("............");
//        System.out.println("............");
//        System.out.println("............");
//        System.out.println("............");
//        System.out.println("............\n");

        //Second way of making ...
        makePatrat();
    }
    public static void makePatrat(){
        int i=0;
        while (i<5){
            System.out.println("............");
            i++;
        }
    }
}
