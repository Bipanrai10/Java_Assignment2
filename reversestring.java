import java.util.Scanner;

public class reversestring {
    public static void main(String[] args) {
        String str, reverse="";
        int i;
        System.out.println("Enter the String:-");
        Scanner read=new Scanner(System.in);
        str=read.nextLine();

        for(i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            reverse=ch+reverse;
        }
System.out.println("Reverse word is "+reverse);
    }
    
}
