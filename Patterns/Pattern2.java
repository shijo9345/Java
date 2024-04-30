import java.util.Scanner;
public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        for( int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print(" ");
            }
            for(int j=1;j<=i+1;j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
}
