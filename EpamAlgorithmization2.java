
import java.util.Scanner;

public class EpamAlgorithmization2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int z;

        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 50));
            System.out.print(array[i] + ", ");
        }
        System.out.println("Введите число z: ");
        z = sc.nextInt();
        for (int numb : array) {
            if (numb > z) {
                numb = z;
                count++;
            }
            System.out.print(numb + ", ");
        }
        System.out.println("Кол-во замен: " + count);
    }
}
/*Algorithmization, Одномерные массивы задача 2
 * Дана последовательность чисел. Нужно заменит все члены, которые больше числа Z этим числом, подсчитать кол-во замен.*/
