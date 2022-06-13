public class TestaValores {

    public static void main(String[] args) {
        Conta conta = new Conta(11337, 11897);

        conta.setNumero(-50);

        Conta conta2 = new Conta(11335, 11898);
        Conta conta3 = new Conta(11339, 118910);

        System.out.println(Conta.getTotal());
    }
}
