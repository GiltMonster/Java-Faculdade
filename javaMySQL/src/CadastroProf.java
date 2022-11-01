
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class CadastroProf extends JFrame implements ActionListener {
    JButton btnOk, btnCancelar;
    JTextField campUsuario, campEnde, campTel, campCpf, campRg;
    JLabel nome, endereco, telefone, cpf, rg;

    public CadastroProf() {
        setTitle("Cadastro Professor");
        setSize(500, 300);
        GridLayout gl = new GridLayout(6, 2, 3, 3);
        getContentPane().setBackground(new Color(240, 128, 128));
        getContentPane().setLayout(gl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nome = criarRotulo("Nome:");
        campUsuario = new JTextField();
        getContentPane().add(campUsuario);

        endereco = criarRotulo("Endereco:");
        campEnde = new JTextField();
        getContentPane().add(campEnde);

        telefone = criarRotulo("Telefone:");
        campTel = new JTextField();
        getContentPane().add(campTel);

        cpf = criarRotulo("CPF:");
        campCpf = new JTextField();
        getContentPane().add(campCpf);

        rg = criarRotulo("RG:");
        campRg = new JTextField();
        getContentPane().add(campRg);

        btnOk = criarBotao("Ok", 'O');
        btnCancelar = criarBotao("Cancelar", 'C');

        setVisible(false);

    }

    private JButton criarBotao(String texto, char c) {
        JButton botao = new JButton(texto);
        botao.setMnemonic(c);
        botao.addActionListener(this);
        add(botao);
        return botao;
    }

    private JLabel criarRotulo(String texto) {
        JLabel rotulo = new JLabel(texto);
        rotulo.setFont(new Font("Times New Roman", Font.BOLD, 18));
        rotulo.setForeground(Color.black);
        rotulo.setHorizontalAlignment(SwingConstants.CENTER);
        add(rotulo);
        return rotulo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnOk) {
            JOptionPane.showMessageDialog(null, "Formulario gravado com Sucesso");
            campUsuario.setText("");
            campEnde.setText("");
            campTel.setText("");
            campCpf.setText("");
            campRg.setText("");

        }
        if (e.getSource() == btnCancelar) {
            //ExMenus2 a = new ExMenus2();
            JOptionPane.showMessageDialog(null, "Cancelando Formulario");
            setVisible(false);
            //a.setVisible(true);
            System.exit(0);

        }

    }
}
