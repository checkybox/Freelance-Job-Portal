package Project;

import org.jetbrains.annotations.NotNull;

public class Freelancer extends User
{
    // main constructor
    public Freelancer(int id, String name, int age, Job job)
    {
        super(id, name, age);
        this.job = job;
    }

    // class attributes
    private String favoriteLanguage = "Java";
    private Job job;

    // getters derived from superclass

    // setters derived from superclass

    // methods of the class
    public String getInfo()
    {
        return "My favorite language is " + this.favoriteLanguage;
    }
}
