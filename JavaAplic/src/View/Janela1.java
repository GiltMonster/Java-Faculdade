package View;

import javax.swing.*;
import java.awt.*;

public class Janela1 extends JFrame {
    JLabel jl1, jl2;
    JTextField txtNome, txtEndereço;
    public Janela1() {
        Container c = getContentPane();
        //define o titulo
        setTitle("Primeira janela Swing");
        //define o layout padrão
        setSize(600, 400);
        getContentPane().setLayout(null);
        c.setBackground(new Color(0x1C1E26));

        jl2 = criarRotulo("Endereço: ", 10, 10, 200, 30);
        jl1 = criarRotulo("Nome: ", 10, 40, 200, 30);

        txtNome = criarCaixaTexto(110, 10, 200, 20);
        txtEndereço = criarCaixaTexto(80, 40, 230, 20);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    private JTextField criarCaixaTexto(int x, int y, int w, int h) {
        JTextField texto = new JTextField();
        texto.setLocation(x, y);
        texto.setSize(w, h);
        texto.setFont(new Font("Courier new", Font.BOLD, 20));
        texto.setHorizontalAlignment(0);
        add(texto);
        return texto;
    }

    private JLabel criarRotulo(String texto, int x, int y, int w, int h){
        JLabel rotulo = new JLabel();
        rotulo.setText(texto);
        rotulo.setLocation(x, y);
        rotulo.setSize(w, h);
        rotulo.setBackground(new Color(0xB61D1D));
        rotulo.setForeground(new Color(255, 255, 255));
        rotulo.setFont(new Font("Courier new", Font.BOLD, 20));
        rotulo.setToolTipText("rotuloabel Exemplo");
        rotulo.setHorizontalAlignment(SwingConstants.LEFT);
        rotulo.setVerticalAlignment(SwingConstants.TOP);
        add(rotulo);
        return rotulo;
    }

    public static void main(String[] args) {
        new Janela1();
    }

}
