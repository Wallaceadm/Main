package Dh;

public class UsuarioJogo {
    public String nome;
    public String nickname;
    public int pontuacao;
    public int nivel;

    public UsuarioJogo(String nome,String nickname){
        this.nome = nome;
        this.nickname = nickname;
    }

    public void aumentarPontuacao(int pontos){
        this.pontuacao =+ pontos;
    }

    public void subirNivel(){
        this.nivel++;
    }

    public void bonus(int valor){

       int bonus = this.pontuacao =+ valor;
    }
}
