import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Please enter a Number: ");
        sayi=input.nextInt();

        if(PalindromBul.isPalindrom(sayi)==true){
            System.out.println(sayi + " is a palindrom number!");
        }else{
            System.out.println(sayi + " is not a palindrom number...");
        }
    }
}
