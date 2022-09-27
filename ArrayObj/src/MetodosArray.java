import javax.swing.*;

public class MetodosArray {
    private static Pessoa[] lista = new Pessoa[4];
    private static int indiceAtual = 0;

    public static void inserir(Pessoa p){
        if (indiceAtual == lista.length){
            lista = alocarNovoArray();
        }
        p.setId(indiceAtual + 1);
        lista[indiceAtual++] = p;
    }
    public static void exibir(){
        for (int i = 0; i < indiceAtual; i++) {
//            for (Pessoa p : lista){
//            System.out.println(p.getNome());
//            System.out.println(p.getIdade());
                System.out.println(lista[i]);
        }
    }


    /**
     * Isso é uma notação então
     * @return Pessoa[]
     */
    private static Pessoa[] alocarNovoArray() {
        Pessoa[] novo =  new Pessoa[indiceAtual + 4];

//        for (int i = 0; i < lista.length; i++) {
//            novo[i] = lista[i];
//        }
        System.arraycopy(lista, 0, novo, 0, lista.length);
        return novo;
    }

    public static int pesquisa(int id){
        int inicio, meio, fim;
        inicio = 0;
        fim = indiceAtual - 1;
        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            if ( id == lista[meio].getId())
                return meio;

            else if (id < lista[meio].getId()) // esquerda
                fim = meio - 1;

            else // - direita
                inicio = meio + 1;
        }
        return -1;
    }

    public static boolean remover(int id){
        int indecePesq = pesquisa(id);

        if(indecePesq != -1){
            for(int i = indecePesq ; i < indiceAtual -1; i++)
            {
                lista[i] = lista[i + 1];
            }
            indiceAtual--;
            return true;
        }
        return false;
    }

    public static boolean atualiza(int id){
        int inceSelecionado = pesquisa(id);
        if(inceSelecionado != -1){
            String nomeNovo = JOptionPane.showInputDialog("Novo nome:");
            lista[inceSelecionado].setNome(nomeNovo);
            return true;
        }
        return false;
    }
}
