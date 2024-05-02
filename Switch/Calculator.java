import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a=scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b= scanner.nextInt();
        System.out.print("Enter the operator: ");
        char operator=scanner.next().charAt(0);
        switch (operator){
            case '+':
                System.out.println(a+ "+" + b + "=" +(a+b));
                break;
            case '-':
                System.out.println(a+ "-" +b +"=" +(a-b));
                break;
            case '*':
                System.out.println(a + "*" + b +"=" +(a*b));
                break;
            case '/':
                System.out.println(a + "/" + b +"=" +(a/b));
                break;
            case '%':
                System.out.println(a + "%" + b +"=" +(a%b));
                break;
            default:
                System.out.println("Enter the valid number:");
        }
    }
}
