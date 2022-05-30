import java.util.Scanner;

public class ExeScanner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        String sobrenome;
        Integer dia;
        Integer mes;
        Integer ano;

        System.out.println("Entre com o seu nome: ");
        nome = scanner.nextLine();
        System.out.println("Entre com o seu sobrenome: ");
        sobrenome = scanner.nextLine();
        System.out.println("Em que dia você nasceu: ");
        dia = scanner.nextInt();
        System.out.println("E o mês: ");
        mes = scanner.nextInt();
        System.out.println("E o ano: ");
        ano = scanner.nextInt();
        System.out.println("Bem vindo " + nome + " "+ sobrenome);
        System.out.println("Nascido em "+ dia +"/"+ mes + "/"+ ano);
        scanner.close();

    }
}
