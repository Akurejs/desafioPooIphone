package org.poo.desafioIphone.reprodutorMusical;

public class TocarMusica {
    public static void main(String[] args) {
        String musicaSelecionada = SelecionarMusica.selecionarMusica();
        String musicaPausada = PausarMusica.PausarMusica();

        System.out.println("Selecionando música...");

        System.out.println(musicaSelecionada);

        System.out.println("Tocando música...");

        System.out.println("Pausando música...");

        System.out.println(musicaPausada);


    }
}





