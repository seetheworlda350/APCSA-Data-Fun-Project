// any imports here
import java.util.Scanner;

/**
 * This is a program that takes the user's favorite integer and character and performs various operations on them including,
 * 1. Determining if the integer is positive, negative, or zero.
 * 2. Determining if the integer is greater than 1,000, 100, or 10.
 * @author [Eshaan Rana]
 * @version [11/5/2024]
 */

public class DataFun{
    public static void main(String[] args){
        Scanner intInput = new Scanner(System.in);
        System.out.println("Hi, please enter your favorite integer: ");
        int favInt = intInput.nextInt();
        if (favInt >= 0){
            System.out.println(favInt + " is a positive number,");
        } else if (favInt < 0){
            System.out.println(favInt + " is a negative number,");
        } else {
            System.out.println(favInt + " is zero,");
        }
        if (favInt > 1000){
            System.out.println(favInt + " is greater than 1,000,");
        }
        else if (favInt > 100){
            System.out.println(favInt + " is greater than 100,");
        } else if (favInt > 10) {
            System.out.println(favInt + " is greater than 10,");
        }
        if (favInt % 2 == 0){
            System.out.println(favInt + " is even,");
        } else {
            System.out.println(favInt + " is odd,");
        }
        switch (favInt){
            case 2:
                System.out.println(favInt + " is the atomic number of the noble gas Helium.");
                break;
            case 10:
                System.out.println(favInt + " is the atomic number of the noble gas Neon.");
                break;
            case 18:
                System.out.println(favInt + " is the atomic number of the noble gas Argon.");
                break;
            case 36:
                System.out.println(favInt + " is the atomic number of the noble gas Krypton.");
                break;
            case 54:
                System.out.println(favInt + " is the atomic number of the noble gas Xenon.");
                break;
            case 86:
                System.out.println(favInt + " is the atomic number of the noble gas Radon.");
                break;
            default:
                System.out.println(favInt + " is not the atomic number of a noble gas.");
        }

        // SECOND PART
        System.out.println("Please enter your favorite character: ");
        char favChar = intInput.next().charAt(0);

        if (Character.isLetter(favChar)){
                if (Character.isLowerCase(favChar)) {
                    System.out.println(favChar + " is a lowercase letter,");
                }
                else {
                System.out.println(favChar + " is an uppercase letter,");
                }
                if (favChar == 'a' || favChar == 'e' || favChar == 'i' || favChar == 'o' || favChar == 'u' || favChar == 'A' || favChar == 'E' || favChar == 'I' || favChar == 'O' || favChar == 'U'){
                    System.out.println(favChar + " is a vowel,");
                } else {
                    System.out.println(favChar + " is not a vowel,");
                }
            }
                char a = "a".charAt(0);
                char A = "A".charAt(0);
                int ascii = (int) favChar;
                System.out.println(favChar + "'s ASCII value is " + ascii+",");
                String suffix = "";
                int alphabetStart = (int) a;
                int alphabetStartCapital = (int) A;
                if (Character.isLowerCase(favChar)){
                    int position = ascii - alphabetStart + 1;
                    if (position == 1){
                        suffix = "st";
                    }
                    if (position == 2){
                        suffix = "nd";
                    }
                    if (position == 3){
                        suffix = "rd";
                    }
                    if (position > 3){
                        suffix = "th";
                    }
                    System.out.println("It is the " + position + suffix + " letter in the alphabet.");
                } else if (Character.isUpperCase(favChar)){
                    int position = ascii - alphabetStartCapital + 1;
                    if (position == 1){
                        suffix = "st";
                    }
                    if (position == 2){
                        suffix = "nd";
                    }
                    if (position == 3){
                        suffix = "rd";
                    }
                    if (position > 3){
                        suffix = "th";
                    }
                    System.out.println("It is the " + position + suffix + " letter in the alphabet.");
                }
        else
        {
            System.out.println(favChar + " is a numeric digit");
        }
    }

}