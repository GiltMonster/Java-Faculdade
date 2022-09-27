package ex14;

import javax.swing.*;
import java.util.Arrays;

public class TesteEx {

    public static void main(String[] args) {
        int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade"));

        ClienteBanco clienteBanco[] = new ClienteBanco[qtd];

        for(int i = 0; i < qtd; i++) {

            clienteBanco [i] = new ClienteBanco();
            clienteBanco [i].setCpf(JOptionPane.showInputDialog("Digite Seu CPF"));
            clienteBanco [i].setNome(JOptionPane.showInputDialog("Digite seu nome"));
            clienteBanco [i].setEnderco(JOptionPane.showInputDialog("Digite seu endereço"));
        }

        for (int i=0; i < qtd; i++){
            System.out.println("");
            System.out.println("Cliente " + (i + 1));
            System.out.println(clienteBanco[i]);
        }

    }
}
