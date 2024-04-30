import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= scanner.nextInt();
        for(int i=0;i<n;i++){
            for (int s=0;s<n-i-1;s++){
                System.out.print("  ");
            }
            int num=2*i+1;
            for (int j=0;j<2*i+1;j++){
                System.out.print(num-- + " ");
            }
            System.out.println();
        }
    }
}
