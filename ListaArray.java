public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int contador;
    private int indiceBusca;


    public ListaArray(){
        elementos = new int[1000];
        contador = 0;

    }

    public int getElemento(int acesso){
        return elementos[acesso];
    }

    public int getIndice(int acesso){
        return this.indiceBusca;

    }

    @Override
    public boolean insert(int chave){
        if (contador > 1000) {
            return false;
        }
        else{
            elementos[contador] = chave;
            contador = contador + 1;
            return true;
        }
    }

    @Override
    public boolean delete(int chave) {
        
        return false;
    }

    @Override
    public boolean search(int chave){
        for (int i = 0 ; i == elementos.length ; i++){
            if (elementos[i] == chave){
                this.indiceBusca = i;
                return true;
            }
        }
        return false;
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void main(String[] args) {
        ListaArray r = new ListaArray();
        r.insert(12);
        r.insert(10);
        System.out.println(r.getElemento(0));
        System.out.println(r.getElemento(1));

        r.search(10);
        

    }
}
