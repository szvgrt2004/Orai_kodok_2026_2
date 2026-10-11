class Main
{
    public static void main(String[] args) {
        String[] gyumik = {"alma", "szolo", "korte"};

        //System.out.println(Arrays.toString(gyumik));

        for (int i = 0; i < gyumik.length; i++) 
        {
            System.out.println(gyumik[i]);
        }

        System.out.println("---------");

        

        String[] masik = gyumik.clone();

        masik[0] = "szilva";
        for (String elem : gyumik) {
            System.out.println(elem);
        }
    }
}