import javax.swing.*;
import java.sql.*;

public class ExemploPreparedStatement {

    public static void main(String[] args) {

        try{
            String nome = JOptionPane.showInputDialog("Digite o nome:");
            String tel = JOptionPane.showInputDialog("Digte o telefone: ");

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "");
            PreparedStatement ps = cn.prepareStatement("INSERT INTO alunos(alunosNome, alunosTelefone) VALUES (?, ?)");
            ps.setString(1,nome);
            ps.setString(2, tel);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso.!");

            ps.close();
            cn.close();
            System.out.println("Conexão encerrada");
        }catch (SQLException e ){

        }
    }
}
