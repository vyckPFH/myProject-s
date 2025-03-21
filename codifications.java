import java.util.Scanner;

public class codifications {
    final static Scanner LER = new Scanner(System.in);

    public static void main(String[] args) {
         String palabra = LER.next();
        imprintCode(palabra);
    }

    public static void imprintCode(String palabra) {
        int[] array;
        array = numCodification(palabra);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int[] numCodification(String word) {
        char[] wordInChar = word.toCharArray();
        char[] alfabeto = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'j', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
                'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', };
        int arrayLength = word.length();
        int[] wordCodificated = new int[arrayLength];

        for (int i = 0; i < wordCodificated.length; i++) {

            for (int k = 0; k < alfabeto.length; k++) {

                if (wordInChar[i] == alfabeto[k]) {
                    wordCodificated[i] = k;
                }

            }

        }

        return wordCodificated;

    }

}
