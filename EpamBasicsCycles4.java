import java.math.BigInteger;

public class EpamBasicsCycles4 {
    public static void main(String[] args) {
        BigInteger sqrt = BigInteger.valueOf(1);
        for(int i = 1; i < 200; i++){
            sqrt = sqrt.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(sqrt);
    }
}
/*Basics of software code development, Циклы задача 4
 Произведения квадратов первых 200 чисел*/
