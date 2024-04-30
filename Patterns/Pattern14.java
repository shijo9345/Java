import java.util.Scanner;
public class Pattern14 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n= scanner.nextInt();
        int l;
        for (int i=-n;i<=n;i++){
            if(i<0){
                l=-i;
            }
            else {
                l=i;
            }
            for (int s=0;s<l;s++){
                System.out.print("  ");
            }
            for (int j=0;j<2*(n-l)+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
