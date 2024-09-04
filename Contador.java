import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira uma frase: ");
        String frase = scanner.nextLine();

        int count = countLetraA(frase);

        System.out.println("A letra 'a' aparece " + count + " vezes.");

        scanner.close();
    }
    public static int countLetraA(String stg){
        int count = 0;
        for (int i=0; i < stg.length(); i++){
            char charz = stg.charAt(i);
            if (charz == 'a' || charz == 'A') {
                count++;
            }
        }
        return count;
    }
}
