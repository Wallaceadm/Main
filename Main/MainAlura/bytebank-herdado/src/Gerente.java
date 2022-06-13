//Gerente eh um Funcionario, Gerente herda da class Funcionario
//private -significa que só é visível nessa classe.
//public - fica entre o public e private - visível para os filhos da classe mãe - protected - Público para os filhos.
// super - definir que o atríbuto vem da classe mãe. Deixe o código mais expressivo.
//reescrita método definido na classe mãe, sendo utilizadas na classe filha. SOBREESCREVE
//posso deixar tudo privado e através do extends puxar os métodos
public class Gerente extends Funcionario {

    private int senha;

    public Gerente(){

    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        }

        return false;
    }
    //reescrista
    public double getBonificacao(){
        System.out.println("Chamando o método bonificacao do GERENTE");
        return super.getBonificacao() + super.getSalario();
    }


}
