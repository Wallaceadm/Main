public class TestaBanco {
    public static void main(String[] args) {

        Cliente paulo = new Cliente();
        paulo.setNome("Paulo Silveira");
        paulo.setCpf("222.222.222-22");
        paulo.setProfissao("programador");

        Conta conta = new Conta(8989,879);
        conta.setTitular(paulo);



        Conta contaDoPaulo = new Conta(789,555);
        contaDoPaulo.deposita(100);
        contaDoPaulo.titular = paulo;
        System.out.println(conta.getTitular().getNome());
        Cliente titularDaConta = conta.getTitular();
        titularDaConta.setProfissao("Programadora");
        System.out.println(conta.getTitular().getProfissao());
    }


}


