import java.util.Scanner;
public class EpamBasicsBranches5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double res1, res2;
        if (x <= 3) {
            res1 = Math.pow(x, 2) - 3 * x + 9;
            System.out.println(res1);
        } else if (x > 3) {
            res2 = 1 / (Math.pow(x, 3) + 6);
            System.out.println(res2);
        }
    }
}
/*Basics of software code development, Ветвления задача 5
Вычислить значения функции
 */
