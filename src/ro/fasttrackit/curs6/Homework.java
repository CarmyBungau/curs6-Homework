package ro.fasttrackit.curs6;

public class Homework {
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c = 12;
        int d = 15;
        int e = a + b + c + d;
        System.out.println(e);
        System.out.println("Numerele impare sunt:");
        for (int i =5;i<=15;i++){
            if (i % 2 != 0) {
                System.out.println(i+"");
            }
        }
    }

}
