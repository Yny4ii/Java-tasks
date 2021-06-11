import java.util.Scanner;

public class EpamAlgorithmizaion1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;
        int array [] = new int [N];
        for(int i = 0; i < N; i++){
            array[i] = i;
        }
        int K = sc.nextInt();
        for(int j = 0; j < N; j++){
            if(array[j] % K == 0){
                sum += array[j];
            }
        }
        System.out.println("Сумма чисел: " + sum);

    }
}
/*Algorithmization, Одномерные массивы задача 1
 * В массиве А[N] занесены натуральные числа. Найти сумму чисел, кратных K.*/
