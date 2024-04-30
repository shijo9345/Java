import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
               if((i==0) || (i==n-1) || (j==0) || (j==n-1)){
                   System.out.print("* ");
               }
               else {
                   System.out.print(j + " ");
               }
            }
            System.out.println();
        }
    }
}
