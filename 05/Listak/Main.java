import java.util.ArrayList;
import java.util.List;

class Proba
{

    private Proba()
    {
        //nem lehet példányosítíani -> minden metódusnak statikusnak kell lennie
    }

    public static List<Integer> getPrimes()
    {
        List<Integer> tmp = new ArrayList<>();

        tmp.add(2);
        tmp.add(3);
        tmp.add(5);

        return tmp;
    }
}


class Main
{
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(7);
        lista.add(5);

        kiir(lista);

        System.out.println("----");
        System.out.println(Proba.getPrimes());
        
    }

    static void kiir(List<Integer> lista)
    {
        System.out.println(lista);
    }
}