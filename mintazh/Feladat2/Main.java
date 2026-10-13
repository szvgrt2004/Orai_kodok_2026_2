import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Adj meg szavakat (vegre a kilepesehez): ");
        
        String szo;
        int darab = 0;
        int osszhossz = 0;
        int leghosszabb = 0;
        String leghosszabbSzo = "";
        double atlag = 0.0;

        while (true) 
        { 
            szo = sc.nextLine(); 

            if(szo.equals("vege"))
            {
                break;
            }

            darab++;
            osszhossz += szo.length();

            if(szo.length() > leghosszabb)
            {
                leghosszabb = szo.length();
                leghosszabbSzo = szo;
            }
        }
        System.out.println("Szavak szama: " + darab);
        atlag = (double) osszhossz / darab;
        System.out.printf("Atlagos hossz: %.2f\n", atlag);
        System.out.println("Leghosszabb szo: " + leghosszabbSzo);

        sc.close();
    }
}