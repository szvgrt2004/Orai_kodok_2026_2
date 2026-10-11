class Proba
{
    public int szoroz(int a, int b)
    {
        System.out.println("1.verzio");
        return a * b;
    }

    public double szoroz(double a, double b)
    {
        System.out.println("2.verzio");
        return a * b;
    }
}


class Main
{
    public static void main(String[] args) 
    {
        Proba p = new Proba();
        System.out.println(p.szoroz(5, 7)); 
        System.out.println("---");
        System.out.println(p.szoroz(5.0, 7.0)); 
    }
}