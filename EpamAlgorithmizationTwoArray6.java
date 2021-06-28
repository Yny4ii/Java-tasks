import java.util.Scanner;

public class EpamAlgorithmizationTwoArray6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int count = 0;
        int count2 = 0;


        int array[][] = new int[len][len];

        for (int i = 0; i < array.length; i++) {
            count++;
            for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = count;
            }
        }
        for (int i = 1; i < array.length; i++) {
            count2++;
            for (int j = 0; j < count2; j++) {
                array[i][len - j - 1 ] = 0;
            }
        }

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[i][j]);
                }
                System.out.println();

            }

        }
    }

/*Algorithmization, Массивы массивов задача 6
 * Построить квадратную матрицу по образцу.*/
