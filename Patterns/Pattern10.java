import java.util.Scanner;
public class Pattern10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            for (int s=0;s<n-i-1;s++){
                System.out.print("  ");
            }
            for (int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
