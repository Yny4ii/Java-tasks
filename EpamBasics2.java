public class EpamBasics2 {
    public static void main(String[] args) {
        int a = 6;
        int b = 5;
        int c = 5;


        int degree1 = 2;
        int degree2 = 3;
        int degree3 = -2;
        double results = (b + Math.sqrt(Math.pow(b, degree1) + 4 * a * c) / (2 * a)) - Math.pow(a, degree2) * c + Math.pow(b, degree3);
        System.out.println(results);
    }
}

/*Basics of software code development, Линейные программы задача 2

Вычислить значение выражения по формуле */
