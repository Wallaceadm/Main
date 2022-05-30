package Dh;

public class ContaDh {
    public static void main(String[] args) {
        Conta primeiraConta = new Conta(12, "Wallace");
        primeiraConta.divida = 200;
        primeiraConta.aumentarDivida(200);
        System.out.println(primeiraConta.divida);
        primeiraConta.pagarDivida(350);
        System.out.println(primeiraConta.divida);

        Conta segundaConta = new Conta(1, "Wall");
        System.out.println(segundaConta.numeroCliente);
    }




}
