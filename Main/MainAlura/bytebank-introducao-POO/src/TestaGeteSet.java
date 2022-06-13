public class TestaGeteSet {
    public static void main(String[] args) {
        Conta conta = new Conta(59,89);
        //conta.numero não compila;
        System.out.println(conta.getNumero());
    }
}
