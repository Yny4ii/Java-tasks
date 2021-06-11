public class EpamBasicsBranches4 {
    public static void main(String[] args) {
        int a = 20;
        int b = 50;

        int x = 10;
        int y = 14;
        int z = 5;
        if((x <= a && y <= b || y <= a && x <= b ||
                x <= a && z <= b || z <= a && x <= b ||
                z <= a && y <= b || y <= a && z <= b)){
            System.out.println("Кирпич пройдет");
        }else {
            System.out.println("Кирпич не пройдет");
        }
    }
}
/*Basics of software code development, Ветвления задача 4
Заданы размеры отверстия( А и В) и размеры кирпича(x, y, z). Нужно определить, влезет ли кирпич через отверстие*/
