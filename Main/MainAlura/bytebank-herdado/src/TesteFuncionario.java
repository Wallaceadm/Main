public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario nico = new Funcionario();
        nico.setNome("Nico Sapat");
        nico.setCpf("25698889-10");
        nico.setSalario(2570.00);

        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());

    }
}
