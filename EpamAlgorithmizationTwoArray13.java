import java.util.Scanner;

public class EpamAlgorithmizationTwoArray13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int temp = 0;
        boolean sort;

        int array[][] = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = ((int) (Math.random() * 100));
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
        System.out.println("Сортировка массива по возрастанию");
        for (int i = 0; i < array.length; i++) {
            sort = false;
            while (!sort) {
                sort = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if(array[j][i] > array[j+ 1][i]){
                        sort = false;
                        temp = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = temp;
                    }
                }
            }
        }
        for(int [] a : array){
            for(int b : a){
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println("Сортировка массива по убыванию");
        for (int i = 0; i < array.length; i++) {
            sort = false;
            while (!sort) {
                sort = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if(array[j][i] < array[j+ 1][i]){
                        sort = false;
                        temp = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = temp;
                    }
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
/*Algorithmization, Массивы массивов задача 13
 * Отсортировать столбцы массива по убыванию и возрастанию значений элементов..*/
