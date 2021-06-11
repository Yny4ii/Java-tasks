import java.util.Scanner;

public class EpamAlgorithmization3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zeroCount = 0;
        int posCount = 0;
        int negCount = 0;

        System.out.println("Введите длину массива: ");
        int len  = sc.nextInt();
        int array [] = new int[len];
        for(int i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 100) - 20);
            System.out.print(array[i] + ", ");
        }
        for(int numb : array){
            if(numb > 0){
                posCount++;
            }
            if(numb < 0){
                negCount++;
            }
            if(numb == 0){
                zeroCount++;
            }
        }
        System.out.println("\nБольше нуля: " + posCount);
        System.out.println("Меньше нуля: " + negCount);
        System.out.println("Равны нулю: " + zeroCount);
    }
}
/*Algorithmization, Одномерные массивы задача 3
 * Дана последовательность чисел. Нужно подсчитать кол-во отрицательных чисел, положительных, и равных нулю.*/
