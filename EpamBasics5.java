public class EpamBasics5 {
    public static void main(String[] args) {
        int T = 7300;
        int hours = T / 3600;
        int minutes = (T / 60) % 60;
        int sec = T % 60;
        System.out.println("HH: " + hours + " " + "MM:" + minutes + " " + "SS:" + sec % 60);
    }
}
/*Basics of software code development, Линейные программы задача 5
* Дано число T, которе представляет собой время в секундах. Нужно вывести данное значение в часах, минутах и секундах*/
