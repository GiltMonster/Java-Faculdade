package funcionario;

import javax.swing.*;
import java.util.ArrayList;

public class TesteArrayList {

    public static void main(String[] args) {

        int yesORno = JOptionPane.showConfirmDialog(null, "Deseja add um novo usuario?");

        if (yesORno == 0){
            pergunta();
        }
    }
    public static void pergunta(){
        String nome = JOptionPane.showInputDialog("Digite o nome");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));

        Funcionario func1 = new Funcionario(nome, idade);
        ArrayList funcionarios = new ArrayList();

        funcionarios.add(func1);
        imprimirFuncionario(funcionarios);
        int yesORno = JOptionPane.showConfirmDialog(null, "Deseja add um novo usuario?");
        if (yesORno == 0){
            pergunta();
        }
    }

    public static void imprimirFuncionario(ArrayList funcionarios){
        Funcionario func;
        System.out.println("Qtde de funcionarios: " + funcionarios.size());

        for(int nCont = 0; nCont < funcionarios.size(); nCont++){

            func = (Funcionario) funcionarios.get(nCont);
            System.out.println("Funcionario " +(nCont + 1) + ":\n" + func);
        }
        System.out.println("============FIM=============");
    }

    
}
