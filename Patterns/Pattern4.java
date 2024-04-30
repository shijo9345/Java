import java.util.Scanner;
public class Pattern4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++) {
                System.out.print(j+1 + " ");
            }
            System.out.println();
        }
    }
}
