import java.util.Scanner;

public class thirdQuestion {
    public static String reverseIt(String a){
        String b = "";
        int c = a.length();
        for(int i=c-1; i>=0; i--)
            b = b + a.charAt(i);
        return b;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string that you want to reverse 🎉🥳: ");
        String makeReverse = in.nextLine();
        System.out.println(reverseIt(makeReverse));
    }
}
