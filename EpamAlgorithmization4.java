import java.util.Scanner;

public class EpamAlgorithmization4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = 0;
        int max = 0;
        int temp;
        int i = 0;

        System.out.println("Введите длину массива: ");
        int len  = sc.nextInt();
        int array [] = new int[len];
        for(i = 0; i < array.length; i++){
            array[i] = ((int) (Math.random() * 100) - 20);
            System.out.print(array[i] + ", ");
            if(array[i] > max ){
                max = i;
            }
            if(array[i] < min) {
                min = i;
            }
        }
        System.out.println();

        temp = array[max];
        array[max] = array[min];
        array[min] = temp;
        for(int numb: array){
            System.out.print(numb + " ");
        }
    }
}
/* Basics of software code development, Линейные программы задача 4
* Поменять местами максимальное и минимальное значения.
* */
