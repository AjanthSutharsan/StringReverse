
import java.util.Scanner;
public class StringReverse
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Reverse;
        int length;
        do {
            System.out.println("Please type in the string of characters which you want to be reversed.");
            Reverse = input.nextLine(); 
            length = Reverse.length();
            int i;

            for(i=1;i<=Reverse.length();i++) {
                int j=length-i;
                System.out.print(Reverse.charAt(j));
            }
            System.out.println();
        } while(length!=0);


    }
}
