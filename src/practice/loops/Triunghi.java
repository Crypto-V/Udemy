package practice.loops;

public class Triunghi {
    public static void main(String[] args) {
//        //first way of making the triangle...
//        System.out.println("    .    ");
//        System.out.println("   ...   ");
//        System.out.println("  .....  ");
//        System.out.println(" ....... ");
//        System.out.println("......... ");
//
//        //Second way of making the triangle...
        makeTriangle();
        secondPart();
    }
    public static void makeTriangle(){
        String star="*";
        String sIncrement="*";
        String space=" ";
        int i =0;
        while(i<5){
            System.out.println(star);
             star=sIncrement+star+sIncrement;
             i++;
                    }
    }
    public static void secondPart(){
        int rows = 5, k = 0;
        for(int i = 1; i <= rows; ++i, k = 0) {
            for(int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println();
        }
        }
    }

