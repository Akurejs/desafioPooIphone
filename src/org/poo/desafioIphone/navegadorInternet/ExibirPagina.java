package org.poo.desafioIphone.navegadorInternet;

public class ExibirPagina {
    public static void main(String[] args) {
        String novaAba = AdicionarNovaAba.adicionarNovaAba();
        String atualizaPagina = AtualizarPagina.atualizarPagina();

        System.out.println(novaAba);

        System.out.println("Pesquisando: O que são padrões de cores?");

        System.out.println(atualizaPagina);

        System.out.println("Resultado da Pesquisa: Padrões de cores são uma maneira de descrever as cores em um sistema de cores. A maioria dos modelos de cores possui 3 dimensões, como a mais conhecida: RGB. De Vermelho, Verde e Azul.");
    }
}
