// any imports here
import java.util.Scanner;

/**
 * Description goes here
 * @author [Eshaan Rana]
 * @version [11/5/2024]
 */

public class DataFun{
    public static void main(String[] args){
        Scanner intInput = new Scanner(System.in);
        System.out.println("Hi, please enter your favorite integer: ");
        int favInt = intInput.nextInt();
        if (favInt % 2 == 0){
            System.out.println(favInt + " is even");
        } else {
            System.out.println(favInt + " is odd");
        }
        if (favInt >= 0){
            System.out.println(favInt + " is positive");
        } else if (favInt < 0){
            System.out.println(favInt + " is negative");
        } else {
            System.out.println(favInt + " is zero");
        }
        if (favInt > 1000){
            System.out.println(favInt + " is greater than 1,000");
        }
        else if (favInt > 100){
            System.out.println(favInt + " is greater than 100");
        } else if (favInt > 10) {
            System.out.println(favInt + " is greater than 10");
        }

        switch (favInt){
            case 2:
                System.out.println(favInt + "is the atomic number of the noble gas Helium");
                break;
            case 10:
                System.out.println(favInt + "is the atomic number of the noble gas Neon");
                break;
            case 18:
                System.out.println(favInt + "is the atomic number of the noble gas Argon");
                break;
            case 36:
                System.out.println(favInt + "is the atomic number of the noble gas Krypton");
                break;
            case 54:
                System.out.println(favInt + "is the atomic number of the noble gas Xenon");
                break;
            case 86:
                System.out.println(favInt + "is the atomic number of the noble gas Radon");
                break;

        }

    }
}