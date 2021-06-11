import java.util.Scanner;

public class EpamBasicsCyclec8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Число a: ");
        String a = sc.nextLine();
        System.out.println("Число b: ");
        String b = sc.nextLine();

        for (int f = 0; f < a.length(); f++) {
            a.charAt(f);
        }
        System.out.println(" ");
        for (int g = 0; g < b.length(); g++) {
            b.charAt(g);
        }
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if (a.charAt(i) == b.charAt(j)) {
                    System.out.print(b.charAt(j));
                }
            }
        }
    }
}

/*Basics of software code development, Циклы задача 8
* Даны 2 числа, вывести цифры, входящие в запись обеих чисел*/
