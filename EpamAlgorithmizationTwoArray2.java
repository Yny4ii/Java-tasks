import java.util.Scanner;

public class EpamAlgorithmizationTwoArray2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int array[][] = new int[len][len];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
            array[i][j] = ((int) (Math.random() * 100));
            System.out.print(array[i][j] + ", ");
        }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    System.out.println(array[i][j]);
                }
            }
        }
    }
}


/*Algorithmization, Массивы массивов задача 2
 * Вывести элементы диагонали.*/
