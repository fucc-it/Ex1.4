import java.util.Scanner;

public class Factorial {
        static int cFact(int n){
            int result = 1;
            for (int i = 1; i <=n; i ++){
                result = result*i;
            }
            return result;
        }

        public static void main(String[] args){
            System.out.println("Факториал числа: ");
            int n;
            Scanner scan = new Scanner (System.in);
            n = scan.nextInt();
            System.out.println(cFact(n));
        }
    }
