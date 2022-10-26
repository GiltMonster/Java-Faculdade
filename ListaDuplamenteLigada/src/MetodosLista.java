public class MetodosLista {
    private static Elemento aux, inicio = null, atual;

    public static void incerir(Object objeto){
        if (objeto instanceof String) {

            if (inicio == null) {
                inicio = new Elemento(objeto, null, null);
                aux = inicio;

            } else {
                atual = new Elemento(objeto, null, aux);
                aux.setProx(atual);
                aux = atual;
            }
        }else{
            System.out.println("!!Objeto invalido!!");
        }
    }

    public static void exibir(){
        Elemento e = atual;

        while(e != null){
            System.out.println(e.getObjeto());
            e = e.getAnt();

        }
    }

    public static  Object[] pesquisar(String nome){
        return null;
    }

    public static  boolean remover(String nome){
        Object [] obj = pesquisar(nome);

        return false;
    }

}
