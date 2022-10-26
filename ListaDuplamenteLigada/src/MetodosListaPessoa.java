public class MetodosListaPessoa {
    private static Elemento aux, inicio, atual;

    public static void incerir(Object objeto){
        if (objeto instanceof Pessoa) {

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

        Elemento e = inicio;

        //De tras pra frente
        //Elemento e = atual;

        while(e != null){
            System.out.println(e.getObjeto());
            e = e.getProx();

            //para ir de tras pra frente.
            //e = e.getAnt();
        }
    }

    public static  Object[] pesquisar(Pessoa pessoa){
        Elemento e = inicio;
        Pessoa idPesq;
        while (e != null){
            idPesq = (Pessoa) e.getObjeto();

            if (pessoa.getId() == idPesq.getId()) {
                Object[] v = new Object[2];
                v[0] = e;
                v[1] = idPesq;
                return v;
            }
            e = e.getProx();
        }
        return null;
    }

    public static boolean remover(Pessoa pessoa){
        Object [] obj = pesquisar(pessoa);
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

