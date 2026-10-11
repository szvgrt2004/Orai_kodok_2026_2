class Movie
{
    private String title;
    private int year;
    private double score;

    //konstruktor
    public Movie(String title, int year, double score) 
    {
        this.setScore(score);
        this.title = title;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return String.format("%s; %.1f (%d)", this.title, this.score, this.year);
    }

    public void setScore(double newScore) 
    {
        this.score = newScore;
        if(newScore < 0.0)
        {
            score = 0.0;
        }
        if(newScore > 10.0)
        {
            score = 10.0;
        }
    }

    public String getTitle() {
        return title;
    }
}

public class Main
{
    public static void main(String[] args) 
    {
        Movie m1 = new Movie("Pókember: Vadonatúj nap", 2026, 8.0); //példányosítás
        //System.out.println(m1);

        Movie m2 = new Movie("A remény rabjai", 1994, 9.3);

        Movie m3 = new Movie("Csillagok között", 2014, -8.7);
        System.out.println(m3);
        m3.setScore(12.5);
        System.out.println(m3);
        System.out.println(m3.getTitle());
    }
}