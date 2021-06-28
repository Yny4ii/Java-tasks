import java.util.Scanner;

public class EpamAlgorithmizationTwoArray8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int temp;
        System.out.println("Введите числа строк: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int array[][] = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Перестановка");
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                temp = array[i][a];
                array[i][a] = array[i][b];
                array[i][b] = temp;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }

    }
}
/*Algorithmization, Массивы массивов задача 8
 * Переставить 2 столбца местами.*/

