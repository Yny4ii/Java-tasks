import java.util.Scanner;

public class EpamAlgorithmization5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 20);
            System.out.print(array[i] + ", ");
        }
        System.out.println();
        for(int numb: array){
            if( numb > array.length){
                System.out.print(numb + ", ");
            }
        }
    }
}

/*Basics of software code development, Линейные программы задача 5
*/
