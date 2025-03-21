import java.util.Random;
import java.util.Scanner;

public class obi1 {

    final static Scanner LER = new Scanner(System.in);
    final static Random RAM = new Random();

    public static void main(String[] args) {

        int[] vetor = new int[1000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = RAM.nextInt(1500);
            System.out.println(vetor[i]);
        }

    }
}
