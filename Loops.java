
import java.util.*;
public class Loops {
        public static void main(String[] args) {
            int evalue;
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            for(int i=1;i<=q;i++){
                int a = scan.nextInt();
                int b = scan.nextInt();
                int n = scan.nextInt();

                for(int j=1;j<=n;j++){
                    evalue = 0;
                    for(int k=0;k<j;k++){
                        evalue += Math.pow(2,k)*b;
                    }
                    evalue = a + evalue;
                    System.out.print(evalue + " ");
                }
                System.out.println();
            }

        }
    }
