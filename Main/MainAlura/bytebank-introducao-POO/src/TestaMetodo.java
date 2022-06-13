public class TestaMetodo {
    public static void main(String[] args) {
        Conta contaDoPaulo = new Conta(5,8);
        contaDoPaulo.deposita(50);


        boolean conseguiuRetirar = contaDoPaulo.saca(20);
        System.out.println(conseguiuRetirar);

        Conta contaDaMarcela = new Conta(5,5);
        contaDaMarcela.deposita(1000);

        System.out.println(contaDaMarcela.transfere(300, contaDoPaulo ));
        System.out.println(contaDoPaulo.getSaldo());


    }
}
