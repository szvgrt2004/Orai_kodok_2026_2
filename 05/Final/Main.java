class Main
{
    public static void main(String[] args) {
        final int n = 13;
        //n = 14;  -> hibat dobna final miatt
        System.out.println(n);

        final String[] gyumik = {"alma", "szolo", "korte"}; // csak a memoria imet vedi
        gyumik[0] = "szilva";
        System.out.println(gyumik[0]);
    }
}