import java.sql.*;

public class ExemploResultadoSet {
    public static void main(String[] args) {
        try {

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aulas", "root", "");
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alunos");
            while (rs.next()){
                Aluno novo = new Aluno();
                novo.setId(rs.getInt("aluno_id"));
                novo.setNome(rs.getString("alunosNome"));
                novo.setTelefone(rs.getString("alunosTelefone"));
                System.out.println(novo);
            }
            rs.close();
            st.close();
            cn.close();
        }catch (SQLException e){
            System.out.println("Falha ao realizar a operação.");
            e.getMessage();
        }
    }
}
