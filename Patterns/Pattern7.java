import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=scanner.nextInt();
        int num=1;
        for(int i=0;i<n;i++){
            for(int s=0;s<n-i-1;s++){
                System.out.print("  ");
            }
            for (int j=0;j<2*i+1;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
