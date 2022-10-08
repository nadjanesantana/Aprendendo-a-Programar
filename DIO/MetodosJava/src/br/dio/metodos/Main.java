package br.dio.metodos;

public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calcladora");
        Calclator.soma(3, 6);
        Calclator.subtracao(9, 1.8);
        Calclator.multiilicacao(7, 8);
        Calclator.divisao(5, 2.5);

        //Mensagem
        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem( 7 );
        Mensagem.obterMensagem( 14);
        Mensagem.obterMensagem(1);

        //Empréstimo

        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);





    }
}