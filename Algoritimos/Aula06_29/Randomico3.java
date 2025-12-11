package Aula06_29;

public class Randomico3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int binario = (int) (Math.random() * 2);
            System.out.println(binario);
        }
    }
}
