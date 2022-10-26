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
        Elemento e = inicio;
        String nomePesq;
        while (e != null){
            nomePesq = (String) e.getObjeto();

            if (nome.equalsIgnoreCase(nomePesq)) {
                Object[] v = new Object[2];
                v[0] = e;
                v[1] = nomePesq;
                return v;
            }
            e = e.getProx();
        }
        return null;
    }

    public static  boolean remover(String nome){
        Object [] obj = pesquisar(nome);
        if (obj != null) {
            Elemento e = (Elemento) obj[0];

            //Remover inicio
            if (e == inicio){
                inicio = e.getProx();
                //apaga a conexão com o proximo:
                e.setProx(null);
                //apaga a conexão com o anterior:
                inicio.setAnt(null);
                //ou
                //e.getProx().setAnt(null);

                //Remover atual:
            } else if (e == atual) {
                atual = e.getAnt();
                aux = atual;
                atual.setProx(null);
                e.setAnt(null);

                //Remover qualquer
            }else {
                e.getAnt().setProx(e.getProx());
                e.getProx().setAnt(e.getAnt());
                e.setProx(null);
                e.setAnt(null);
            }
            return true;
        }
        return false;
    }

}
