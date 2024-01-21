import java.util.Scanner;
public class reverseString {
    public static void main(String[] args) {
        reverseString rev= new reverseString();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        System.out.println("Reverse of String is "+rev.reverse(str));
    }
    static  String reverse(String s){
        String rev="";
        for(int j=s.length();j>0;j--){
            rev=rev+(s.charAt(j-1));

        }
        return rev;
    }

}
