import java.util.Scanner;

public class ExeScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        System.out.println("Entre com o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Entre com o seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Bem vindo " + nome + " "+ sobrenome);

        scanner.close();

    }

}
