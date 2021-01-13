import java.util.Scanner;
public class firstQuestion {

    public static void palindromeCheck(int numberToCheck){

        int reverse = 0, x;
        int number = numberToCheck;
        while(numberToCheck>0)
        {
            x = numberToCheck % 10;
            reverse = (reverse*10)+x;
            numberToCheck = numberToCheck/10;
        }
        if(reverse==number)
            System.out.println("It is a Palindrome number.");
        else
            System.out.println("Not a palindrome");
    }

    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number that you want to check whether the number is a palindrome or not 🎉🥳: ");
        int n = in.nextInt();
        palindromeCheck(n);
    }
}
