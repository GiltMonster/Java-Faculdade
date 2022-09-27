public class Data {
    private int ano;
    private byte mes;
    private byte dia;

    public Data() {
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0 ){
            this.ano = ano;
        }else {
            System.out.println("Ano invalido!!");
        }
    }

    public byte getMes() {
        return mes;
    }

    public void setMes(byte mes) {
        if (mes > 0 && mes <= 12){
            this.mes = mes;
        }else{
            System.out.println("Mes invalido!!");
        }
    }

    public byte getDia() {
        return dia;
    }

    public void setDia(byte dia) {
        if (dia > 0 && dia <= 31) {
            this.dia = dia;
        }else{
            System.out.println("Dia invalido!!");
        }
    }

    public boolean isAnoBissexto(){
        if ((ano % 4 == 0) && (ano % 100 != 0)||(ano % 400 == 0)){
            return true;
        }else{
            return false;
        }
    }
}
