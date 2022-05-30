package Dh;

import java.util.Scanner;

public class Dogs {
    private String nome;
    private String raca;
    private int nascimento;
    private double peso;

    private boolean possuiChip;

    private boolean ferido;

    private boolean apto;



public Dogs(String nome, String raca, int nascimento, double peso, boolean ferido, boolean possuiChip, boolean apto){
    this.raca = raca;
    this.nascimento = nascimento;
    this.peso = peso;
    this.ferido = ferido;
    this.possuiChip = possuiChip;
    this.apto = apto;
}

public void saberIdade(int idade){
    idade = (2022 - nascimento);
}

public boolean estePossuiChip(){
    if(possuiChip){

        Scanner  scanner = new Scanner(System.in);
        System.out.println("Pode inserir o nome");
        this.nome = scanner.nextLine();
    }

    return false;
}

    public boolean estaApto() {

    if(!this.ferido && (this.peso >= 5.0)) {
        this.apto = true;
        System.out.println("O dog está apto");
    }
     return false;
    }
}
