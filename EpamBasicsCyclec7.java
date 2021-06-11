
import java.util.Scanner;
public class EpamBasicsCyclec7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = m; i < n; i++){
            System.out.print("Делители  для числа " + i +": ");
            for(int j = 1; j < i; j++){
                if(i % j == 0 & j!=1 & j!=i){
                    System.out.print(j + ", " );
                }
            }
            System.out.println();
        }
    }
}
/*Basics of software code development, Циклы задача 7
 * Для каждого числа, в промежутке от m до n вывести делитель(кроме 1 и самого числа)*/
