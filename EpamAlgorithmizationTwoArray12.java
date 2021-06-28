import java.util.Scanner;

public class EpamAlgorithmizationTwoArray12 {
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
                    if(array[i][j] > array[i][j + 1]){
                        sort = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
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
                    if(array[i][j] < array[i][j + 1]){
                        sort = false;
                        temp = array[i][j];
                        array[i][j] = array[i][j + 1];
                        array[i][j + 1] = temp;
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
/*Algorithmization, Массивы массивов задача 12
 * Отсортировать строки массива по убыванию и возрастанию значений элементов..*/
