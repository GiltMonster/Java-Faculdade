import javax.swing.*;
import java.awt.*;

public class Janela1 extends JFrame {

    public Janela1(){
        //define o titulo
        setTitle("Primeira janela Swing");
        //define o layout padrão
        setSize(300,100);
        //
        setLayout(null);

        setBackground(new Color(0x0909CB));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        Component center = null;
        setLocationRelativeTo(center);
    }

    public static void main(String[] args) {
        new Janela1();
    }

}
