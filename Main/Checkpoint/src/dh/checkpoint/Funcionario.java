package dh.checkpoint;

public class Funcionario {
    private String nome;
    private String cpf;

    private int matricula;

    private double salario;
    private Endereco referencia;

    public Funcionario(){

    }

    public double getBonus(){

        return this.salario * 0.12;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        if(matricula <= 0) {
            System.out.println("Valor de matricula inválido");
            return;
        }
        this.matricula = matricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getReferencia() {
        return referencia;
    }

    public void setReferencia(Endereco referencia) {
        this.referencia = referencia;
    }


}

