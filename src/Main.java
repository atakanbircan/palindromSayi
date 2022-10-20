import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number){
        int temp= number,reverseNumber=0,lastNumber;
        while (temp!=0){
            lastNumber = temp %10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp/=10;
        }

        if (number==reverseNumber){
            return true;
        }
        else
            return false;
    }


    public static void main(String[] args) {
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz: ");
        sayi=input.nextInt();
        if (isPalindrom(sayi)==true){
            System.out.println(sayi+" polindrom sayıdır.");
        }
        else {
            System.out.println(sayi +" polindrom sayı değildir.");
        }
    }
}