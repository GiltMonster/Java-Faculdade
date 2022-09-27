import javax.swing.*;

public class Main {
    public static void main(String[] args) {

//        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digte um ano: "));
//        byte mes = Byte.parseByte(JOptionPane.showInputDialog("Digte o mês: "));
//        byte dia = Byte.parseByte(JOptionPane.showInputDialog("Digte o dia: "));

        Data data = new Data();

//        data.setAno(ano);
//        data.setMes(mes);
//        data.setDia(dia);


        data.setDia(Byte.parseByte(JOptionPane.showInputDialog("Digite o dia:")));
        data.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:")));
        data.setMes(Byte.parseByte(JOptionPane.showInputDialog("Digite o mês:")));

        System.out.println("Hoje é dia: " + data.getDia());
        System.out.println("Do mês: " + data.getMes());
        System.out.println("E ano: "  + data.getAno());

        verificarAnoBissexto(data);
    }
    private static void verificarAnoBissexto(Data data) {
        if(data.isAnoBissexto())
            System.out.println(data.getAno() + " é um ano bissexto!!! ");
        else
            System.out.println(data.getAno() + " não é um ano é bissexto!!! ");
    }
}

