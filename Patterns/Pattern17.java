import java.util.Scanner;
public class Pattern17 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows :");
        int n= scanner.nextInt();
        char ch='A';
        for (int i=0;i<n;i++){
            for( int j=0;j<i+1;j++){
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }
}
