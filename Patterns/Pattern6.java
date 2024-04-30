import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n=scanner.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<i+1;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
