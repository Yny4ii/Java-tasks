import java.util.Scanner;

public class EpamAlgorithmizationTwoArray15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int array[][] = new int[len][len];
        int max = array[0][0];
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
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] % 2 !=0){
                    array[i][j] = max;
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Максимальный элемент " + max);

    }
}
/*Algorithmization, Массивы массивов задача 15
 * Найти max и заменить все нечетные значение на него.*/
