import java.time.Year;

class Person
{
    public String name;
    public String eMail;
    public int yearOfBirth;

    public int howOldAreYou() //példánymetódus
    {
        int currentYear = Year.now().getValue();
        return currentYear - yearOfBirth;
    }
}


public class Main
{
    public static void main(String[] args) 
    {
        Person p1 = new Person();
        p1.name = "Anna";
        p1.eMail = "anna@hellom.com";
        p1.yearOfBirth = 2000;
        System.out.println(p1.howOldAreYou());
    }
}