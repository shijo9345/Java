import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= scanner.nextInt();
        for (int i=0;i<n;i++){
            int num=i+1;
            int set=1;
            for (int s=0;s<n-i-1;s++){
                System.out.print("   ");
            }
            for (int j=0;j<2*i+1;j++){
                if(set==1) {
                    System.out.print(num++ + "  ");
                    if (i == j) {
                        set = 0;
                        num = 2 * i;
                    }
                }
                    else{
                        System.out.print(num-- + "  ");
                    }
                }
            System.out.println();
        }
    }
}
