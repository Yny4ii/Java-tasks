import java.util.Scanner;

public class EpamAlgorithmizationTwoArray11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;
        int array[][] = new int[10][20];
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                array[i][j] = ((int) (Math.random() * 16));
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }
  mark:      for(int i = 0; i < array.length; i++) {
            count = 0;
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == 5){
                    count++;
                }
                if(count >= 3){
                    System.out.println("Пятерки в строках " + i);
                    continue mark;
                }
                }
            }

        }

    }

/*Algorithmization, Массивы массивов задача 11
 * Матрица 10х20 заполнена числами 1-15. Вывести номера строк, в которых цифра 5 встречается 3 и более раз*/

