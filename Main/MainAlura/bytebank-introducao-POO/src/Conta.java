public class Conta {
    private double saldo;
    int agencia;
    int numero;
    Cliente titular;
    private static int total;

    public Conta(int agencia, int numero){
        Conta.total++;
        System.out.println("o total de contas é " +  Conta.total);
        if(agencia <=0){
            System.out.println("invalido");
            return;
        }
        this.agencia = agencia;
        this.numero = numero;

        System.out.println("Estou criando uma conta "+this.numero);
    };



    //void não dar retorno, só executa a ação para aquela foi criada;
   public void deposita(double valor){

       this.saldo += valor;
    }
    //tem retorno;
    public boolean saca(double valor){
       if(this.saldo >= valor){
           this.saldo -= valor;
           return true;
       }else {
           return false;
       }
       
    }

    public boolean transfere(double valor, Conta destino){
        if(this.saldo >= valor){
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        }

        return false;
    }

    public double getSaldo(){

       return this.saldo;
    }

    public int getNumero(){
       return   this.numero;
    }

    public void setNumero(int numero) {
       if(numero <= 0){
           System.out.println("Numero de conta inválido");
           return;
       }
        this.numero = numero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Valor de agência inválido");
            return;
        }
            this.agencia = agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public static int getTotal() {

        return Conta.total;
    }
};

