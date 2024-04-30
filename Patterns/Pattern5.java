import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }

}
