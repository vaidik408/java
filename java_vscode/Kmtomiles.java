import java.util.Scanner;



public class Kmtomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter number for conversion"); 
        double a = sc.nextInt();
        double mile= (a * 0.6214);
        System.out.println(mile);
    }
}
