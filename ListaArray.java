public class ListaArray implements EstruturaDeDados{

    private int[] elementos;
    private int contador;
    private int indiceBusca;


    public ListaArray()
    {
        elementos = new int[10];
        contador = 0;
    }

    public int getElemento(int acesso)
    {
        return elementos[acesso];
    }

    @Override
    public boolean insert(int chave)
    {
        if (contador > 10)
        {
            return false;
        }
        else{
            elementos[contador] = chave;
            contador = contador + 1;
            return true;
        }
    }

    @Override
    public boolean delete(int chave)
    {
        int cont = 0;
        if(search(chave) == true)
        {
            for(int x = this.indiceBusca ; x < elementos.length; x++ )
            {
                elementos[x] = elementos[x + 1];
                cont = x;
                for(int j = cont; j < elementos.length-1; )
                {
                    elementos[cont] = elementos[cont + 1];
                    contador--;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public boolean search(int chave)
    {
        for (int i = 0 ; i < elementos.length ; i++)
        {
            if (elementos[i] == chave)
            {
                this.indiceBusca = i;
                return true;
            }
        }

        return false;
    }

    @Override
    public int minimum() {
        int y = maximum();
        for( int i = 0 ; i < elementos.length; i++){
            if (elementos[i] < y && elementos[i] != 0 ){
                y = elementos[i];

            }
        }
        return y;
    }

    @Override
    public int maximum(){
        int x = elementos[0];
        for( int i = 0 ; i < elementos.length; i++)
        {
            if(elementos[i] > x)
            {
                x = elementos[i];

            }
        }
        return x;
    }

    @Override
    public int sucessor(int chave)
    {
        search(chave);
        if(this.indiceBusca < elementos.length && this.indiceBusca >= 0)
        {
            return elementos[this.indiceBusca + 1];
        }
        return -1;
    }

    @Override
    public int prodessor(int chave)
    {
        search(chave);
        if(this.indiceBusca <= elementos.length && this.indiceBusca > 0)
        {
            return elementos[this.indiceBusca - 1];
        }
        return -1;
    }

    public static void main(String[] args)
    {
        ListaArray r = new ListaArray();
        r.insert(12);
        r.insert(10);
        r.insert(5);
        r.insert(25);
        r.insert(100);

        System.out.println(r.minimum());
        System.out.println(r.maximum());
        System.out.println(r.sucessor(10));
        System.out.println(r.prodessor(100));
        System.out.println(r.delete(5));
        System.out.println(r.delete(100));
        System.out.println(r.minimum());
        System.out.println(r.maximum());

    }
}