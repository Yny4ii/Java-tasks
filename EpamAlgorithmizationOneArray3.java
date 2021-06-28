
import java.util.Scanner;
public class EpamAlgorithmizationOneArray3 {
    public static void main(String[] args) {
        int [] array = {1, 5, 2, 6, 3, 7};
        for (int min = 0; min < array.length-1; min++) {
            int least = min;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[least]) {
                    least = j;
                }
            }
            int tmp = array[min];
            array[min] = array[least];
            array[least] = tmp;
        }
        for(int a : array){
            System.out.print(a + " ");
        }
    }
}
/*Algorithmization, Одномерные массивы. Сортировки задача 3
 * Сортировка выбором.*/
