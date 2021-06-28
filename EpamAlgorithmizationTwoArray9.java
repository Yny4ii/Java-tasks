
import java.util.Scanner;

public class EpamAlgorithmizationTwoArray9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int sum;
        int max = 0;
        int temp = 0;


        int array[][] = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[j][i];
                if(sum > max){
                    max = sum;
                    temp = i + 1;
                }


            }
        }

        System.out.println(max + " " + temp);
    }
}
/*Algorithmization, Массивы массивов задача 9
 * Задана матрица неотрицательных чисел.Посчитать сумму элементов в каждом столбце.
 * Определить, какой столбец содержит максимальную сумму..*/
