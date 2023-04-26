/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Jogo;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Guerreiro jogador = new Guerreiro();
        Guerreiro jogador2 = new Guerreiro();
        jogador.arma = "espada";
        jogador2.arma = "espada";
        
        System.out.println("Primeiro jogador digite o nome do seu guerreiro: ");
        jogador.setNome(scanner.nextLine());
        System.out.println("Segundo jogador digite o nome do seu guerreiro: ");
        jogador2.setNome(scanner.nextLine());
        
        System.out.println("O guerreiro "+jogador.nome + " atacou o guerreiro " +jogador2.getNome());
        jogador.ataca(jogador2);
        System.out.println(jogador2.nome+ " perdeu 5 pontos de energia.");
        System.out.println("\n");
        System.out.println("O guerreiro "+jogador2.nome + " atacou o guerreiro " +jogador.getNome());
        jogador2.ataca(jogador);
        System.out.println(jogador.nome+ " perdeu pontos de energia.");
        System.out.println("\n");
        System.out.println(jogador.nome+ " você recebeu uma espada e sua armadura.");
        System.out.println("O guerreiro "+jogador.nome + " atacou o guerreiro " +jogador2.getNome() + " com a "+jogador.arma);
        jogador.atacar(jogador2);
        System.out.println("\n");
        System.out.println(jogador2.nome+ " você não recebeu uma arma.");
        System.out.println("O guerreiro "+ jogador2.nome + " atacou o guerreiro " +jogador.getNome());
        jogador2.ataca(jogador);
        System.out.println(jogador.nome+ " perdeu 5 pontos de energia.");
        
        
        System.out.println(jogador2.nome+ " você tem de energia: " +jogador2.energia);
        System.out.println(jogador.nome+" você tem de energia: " +jogador.energia);
        
        
    }
}
