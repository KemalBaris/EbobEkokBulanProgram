import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, k = 1;
        int ebob = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz :");
        n1 = input.nextInt();
        System.out.print("n2 sayınısını giriniz :");
        n2 = input.nextInt();

        while (k <= n1)
        {
            if (n1 % k == 0 && n2 % k == 0) {
                ebob = k;
            }
            k++;

        }
        System.out.println(" EBOB : " + ebob);
        k = 1;
        while (k <= (n1 * n2))
        {
            if (k % n1 == 0 && k % n2 == 0) {
                System.out.println("EKOK : " + k);
                break;
            }
            k++;
        }


    }
}