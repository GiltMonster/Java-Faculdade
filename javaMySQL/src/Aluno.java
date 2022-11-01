public class Aluno {

    public Aluno() {
    }

    public Aluno(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    private String nome, telefone;
    private int id;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "ID:" + id + "\n" +
               "Aluno:" + nome + '\n' +
               "Telefone:" + telefone + '\n';
    }
}
