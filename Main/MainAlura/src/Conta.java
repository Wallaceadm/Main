public class Conta {
    double saldo;
    int agencia;
    int numero;
    String titular;
    Class destino;
    public Conta(){
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
}