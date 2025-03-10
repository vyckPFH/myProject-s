import java.util.Scanner;

public class codifications{
    final static Scanner LER = new Scanner(System.in);
    
    public static void main(String[] args) {
      //  String palabra = LER.next();
        imprintCode();
    }

    public static void imprintCode(){
       int [] array;
       array =  numCodification("macaco");      
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }


    public static int[] numCodification(String word){
        char[] wordInChar;
        char[] alfabeto = {' ' , 'a' , 'b' , 'c', 'd' , 'e' , 'f' , 'g' , 'j' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' ,};
        int arrayLength = word.length();
        int[] wordCodificated = new int[arrayLength + 1];
        int j = 0;
       
        for (int i = 0; i < wordCodificated.length; i++) {
            

            char[] charcAtI = word.toCharArray(i);

            if (charcAtI == alfabeto[i]) {
                wordCodificated[j] = i;
                j++;
            }
            
        }

        return wordCodificated;

    }

}
