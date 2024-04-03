import java.util.Scanner;

public class vowelandconsonant {
    public static void main(String[] args) {
        
        char Alphabet;
        System.out.println("Enter the Alphabet:-");
        Scanner read=new Scanner(System.in);
        Alphabet=read.next().charAt(0);

        if(Alphabet=='a'  || Alphabet=='e' || Alphabet=='i' || Alphabet=='o' || Alphabet=='u' ||
            Alphabet=='A'  || Alphabet=='E' || Alphabet=='I' || Alphabet=='O' || Alphabet=='U')
            {
                System.out.println(Alphabet+"is vowel alphabet");
            
       } else{
        System.out.println(Alphabet+"is Consonant Alphabet");
    }
    }
}
