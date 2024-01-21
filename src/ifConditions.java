import java.util.Scanner;

public class ifConditions {
    public static void main(String[] args) {
        ifConditions ifc=new ifConditions();
        System.out.println("Enter any Number : ");
        Scanner sc = new Scanner(System.in);
        int str = sc.nextInt();
        if(str%2==0){
            System.out.println(str+" is Even number");

        }else{
            System.out.println(str+" is odd number.");
        }
    }
}
