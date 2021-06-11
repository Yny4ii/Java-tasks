import java.util.Scanner;
public class EpamBasicsCycles1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;
        for(int i = 1; i < number; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
/*Basics of software code development, Циклы задача 1
Сумма всех чисел от 1 до введенного числа*/
