import java.util.Scanner;

public class simple {
    public static void main(String[] args) {
        int p,t,r,Simpleinterest;
        System.out.println("enter the Value of p:-");
        Scanner read=new Scanner(System.in);
        p=read.nextInt();
        System.out.println("Enter The value of t:- ");
        Scanner read1=new Scanner(System.in);
        t=read1.nextInt();
        System.out.println("Enter the value of r:-");
        Scanner read2=new Scanner(System.in);
        r=read2.nextInt();
        Simpleinterest=(p*t*r)/100;
        System.out.println("Simple interest="+Simpleinterest);
    }
}
