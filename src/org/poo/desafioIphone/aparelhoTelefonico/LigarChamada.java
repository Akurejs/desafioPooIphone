package org.poo.desafioIphone.aparelhoTelefonico;

public class LigarChamada {
    public static void main(String[] args) {
        String correioVoz = IniciarCorrerioVoz.iniciarCorrerioVoz();
        String chamadaPerdida = AtenderChamada.atenderChamada();

        System.out.println("Ligando para a Lanchonete...");

        System.out.println(chamadaPerdida);

        System.out.println(correioVoz);

    }
}
