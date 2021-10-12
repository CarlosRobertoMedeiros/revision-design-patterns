package br.com.roberto.designpattern.javabook.behavioral.strategy.exemplo2.cliente;

public class LutaSimulator {

    public static void main(String[] args) {

        Jogador guerreiro = new Guerreiro();
        guerreiro.associarArma();
        guerreiro.lutar();

        Jogador rainha = new Rainha();
        rainha.associarArma();
        rainha.lutar();

        Jogador rei = new Rei();
        rei.associarArma();
        rei.lutar();

        Jogador troll = new Troll();
        troll.associarArma();
        troll.lutar();

    }
}
