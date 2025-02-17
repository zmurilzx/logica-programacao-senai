import java.util.Scanner;

public class exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos estados tem no Brasil? ");
        int respost = scanner.nextInt();

        if (respost == 26) {
            System.out.println("Parabéns, você acertou!");
        } else {
            System.out.println("Errou jumento kk, era 26.");
        }
    }
}