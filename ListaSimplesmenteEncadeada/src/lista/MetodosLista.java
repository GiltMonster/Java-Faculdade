package lista;

public class MetodosLista {

    private static Elemento inicio = null, atual, aux;

    /**
     * insere objetos na lista encadeada
     *
     * @param objeto
     */
    public static void inserir(Object objeto) {
        if (objeto instanceof Pet) {

            if (inicio == null) {
                /** Lista vazia
                 * @param inicio
                 *
                 */
                inicio = new Elemento(objeto, null);
                aux = inicio;
            } else {
                atual = new Elemento(objeto, null);
                aux.setProx(atual);
                aux = atual;
            }
        }
    }

    /**
     * Exibee o conteudo da lista simplesmente ligada.
     */
    public static void exibir() {
        Elemento e = inicio;
        while (e != null) {

            System.out.println(e.getObjeto());
            e = e.getProx();
        }
    }

    public static Object pesquisar(String nome) {

        Elemento e = inicio;
        Pet pet;
        while (e != null) {
            pet = (Pet) e.getObjeto();

            if (nome.equals(pet.getNome())) {
                return pet;
            }
            e = e.getProx();
        }
        return null;
    }

    /**
     * Pesquisa para fazer a operação de remover um elemento na lista simplesmente encadeada.
     *
     * @param pet Pet
     * @return Object[]
     */

    private static Object[] pesquisar(Pet pet) {
        Elemento re = inicio;
        Elemento are = inicio;
        Pet petPesq;
        Object[] v = new Object[2];
        while (re != null) {
            petPesq = (Pet) re.getObjeto();
            if (pet.getNome().equals(petPesq.getNome())) {
                v[0] = re;
                v[1] = are;
                return v;
            }
            are = re;
            re = re.getProx();
        }
        return null;
    }

    public static boolean remover(Pet pet){
        Object[] v=pesquisar(pet);
        if (v != null){
            Elemento re = (Elemento) v[0];
            Elemento are = (Elemento) v[1];
/**
 * ele entra no if para verificar qual remover,
 * no caso... vai remover o primeiro.
 */
            if (re == inicio){
                inicio = re.getProx();
                re.setProx(null);
/**
 * entra no elseif para verificar se caiu no fim da lista
 */
            } else if (re == atual) {
                atual = are;
                aux = are;
                are.setProx(null);

                /**
                 *
                 */
            }else {
                are.setProx(re.getProx());
                re.setProx(null);
            }
            return true;
        }
        return false;
    }

}
