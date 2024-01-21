import java.util.Scanner;

public class reverseofStringUsingArray {
    public static void main(String[] args) {
        reverseofStringUsingArray rev=new reverseofStringUsingArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str= sc.next();
        char[] ch=str.toCharArray();
        System.out.println("Reverse of String is ");
        int j=ch.length;
        for(int i=j;i>0;i--){
            System.out.print(ch[i-1]);
        }


    }
}
