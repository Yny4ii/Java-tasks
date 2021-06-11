public class EpamBasics3 {
    public static void main(String[] args) {

        double x = 30.00;
        double y = 60.00;
        double degree1 = Math.toRadians(x);
        double degree2 = Math.toRadians(y);
        double degree3 = Math.toRadians(y * x);

        double result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y) * Math.tan(degree3));
        System.out.println(result);

    }
}
/* Basics of software code development, Линейные программы задача 3
* Вычислить выражение по формуле
* */
