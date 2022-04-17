import java.util.Scanner;

public class Average {
    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int n = in.nextInt();
        double arr_n [];
        arr_n = new double[n];
        int length = arr_n.length;
        double sum;
        sum = 0.0;
        double d;
        d = 0.0;
        for ( n = 0; n < arr_n.length; n++) {
            if ( n < length + 1) {
                System.out.print("Введите число в массив: ");
                double a = in.nextDouble();
                arr_n[n] = a;
            }
            sum = sum + arr_n[n];
        }
        d = sum/length;
        for ( n = 0; n < arr_n.length; n++) {
            arr_n[n]=arr_n[n]*d;
            System.out.println(arr_n[n]);
        }

    }
}
