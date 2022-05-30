package Dh;

public class CriaJogador {

    public static void main(String[] args) {
        UsuarioJogo jogadorOne = new UsuarioJogo("Wall","StForce");

        jogadorOne.aumentarPontuacao(5);
        System.out.println(jogadorOne.pontuacao);
        jogadorOne.bonus(2);
        System.out.println(jogadorOne.pontuacao);


    }
}
