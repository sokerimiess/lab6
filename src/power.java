import java.util.Scanner;

public class power
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("a: ");
        int a = (int) scanner.nextDouble();

        System.out.print("n: ");
        int n = scanner.nextInt();

        int result = power(a, n);
        System.out.println(result);

        scanner.close();
    }

    public static double power(double a, int n)
    {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            return 1 / power((int) a, -n);
        } else {
            return power((int) a, n);
        }
    }

    private static int power(int a, int n)
    {
        int result = 1;
        for (int i = 0; i < n; i++) {
            result *= a;
        }
        return result;
    }
}