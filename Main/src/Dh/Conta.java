package Dh;

public class Conta {
        public int numeroCliente;
         public String nome;
        public double divida;

public Conta(int numeroCliente, String nome){
    this.numeroCliente = numeroCliente;
    this.nome = nome;
};

    public void aumentarDivida(double valor) {
    this.divida += valor;
};

public void pagarDivida(double valor){
    this.divida -= valor;
}


}
