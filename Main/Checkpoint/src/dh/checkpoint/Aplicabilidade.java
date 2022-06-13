package dh.checkpoint;

public class Aplicabilidade {
    public static void main(String[] args) {
        ContratadoClt clt1 = new ContratadoClt();
        clt1.setNome("Azzy");
        clt1.setMatricula(5555);
        clt1.setCpf("235.555.998-59");
        clt1.setSalario(5000);

        Endereco funcionarioClt1 = new Endereco();
        funcionarioClt1.setRua("Jaconi");
        funcionarioClt1.setBairro("Tijuca");
        funcionarioClt1.setEstado("Rio de Janeiro");
        funcionarioClt1.setNumero(12);

        clt1.setReferencia(funcionarioClt1);


        System.out.println(clt1.getCpf());
        System.out.println(clt1.getSalario());
    }
}
