import java.util.Scanner;

public class EpamAlgorithmization6 {
    public static void main(String[] args) {
        int count;
        int g;
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int len = sc.nextInt();
        int array[] = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100) - 20);
            System.out.print(array[i] + ", ");
        }
        for(g=1; g<=len; g++){
            count = 0;
            for(int j=2; j<g; j++){
                if((g%j)!=0) count += 0;
                else count += 1;
            }
            if(count==0){
                sum += array[g];
            }
        }
        System.out.println("Сумма: " +  sum);
    }
}
/*Basics of software code development, Линейные программы задача 6
* Даны числа, нужно вывести сумму тех чисел, индекс которых является простым числом*/
