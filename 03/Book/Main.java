public class Main
{
    public static void main(String[] args)
    {
        Book book1 = new Book("Dűne", "Frank Herbert", 412); //példányosítás
        /*book1.title = "Dune";
        book1.author = "Frank Herbert";
        book1.pages = 412;*/
        System.out.println("Title: " + book1.title);

        Book book2 = new Book("Alapítvány", "Asimov", 255);
        /*book2.title = "Alapítvány";
        book2.author = "Asimov";
        book2.pages = 255;*/

        System.out.println("Title: " + book2.title);
    }
}