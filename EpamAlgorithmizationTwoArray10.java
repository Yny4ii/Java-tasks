import java.util.Scanner;

public class EpamAlgorithmizationTwoArray10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();

        int array[][] = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = ((int) (Math.random() * 100) -20);
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                if(i == j & array[i][j] > 0){
                    System.out.println(array[i][j]);
                }

            }

        }
    }
}
/*Algorithmization, Массивы массивов задача 10
 * Найти положительные элементы главной диагонали.*/
