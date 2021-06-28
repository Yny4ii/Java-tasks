import java.util.Scanner;

public class EpamAlgorithmizationTwoArray4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int count;

        int array[][] = new int[len][len];

        for (int i = 0; i < array.length; i++) {
            count = 0;
            for (int j = 0; j < array[i].length; j++) {
                count++;
                array[i][j] = count;
                if(i % 2 != 0){
                    array[i][j] = len - count + 1;
                }
            }
        }
        for(int [] a : array){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
/*Algorithmization, Массивы массивов задача 4
 * Сформировать квадратную матрицу по образцу..*/
