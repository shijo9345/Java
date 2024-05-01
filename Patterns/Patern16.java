import java.util.Scanner;
public class Patern16 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the rows:");
        int n= scanner.nextInt();
        int l;
        for (int i=-n;i<=n;i++){
            if (i<0){
                l=-i;
            }
            else {
                l=i;
            }
            for (int s=0;s<l;s++){
                System.out.print("  ");
            }
            for (int j=0;j<2*(n-l)+1;j++){
                if ((j==0) || (l+j==n)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
