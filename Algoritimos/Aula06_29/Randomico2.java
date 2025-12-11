
package Aula06_29;

public class Randomico2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            int num = (int) (Math.random() * 10);
            System.out.println(num);
        }
    }
}
