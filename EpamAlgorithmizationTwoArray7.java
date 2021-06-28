import java.util.Scanner;

public class EpamAlgorithmizationTwoArray7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int count = 0;

        double array[][] = new double[len][len];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin((i * i - j * j) / len);
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        for(double [] a : array){
            for(double b : a){
                if(b > 0){
                    count++;
                }
            }
        }
        System.out.println("Кол-во положительных элементов " + count);
    }
}
/*Algorithmization, Массивы массивов задача 7
 * Сформировать матрицу по образцу A[I, J] = sin(I * I - J * J) / N
 * и посчитать кол-во положительных элементов.*/
