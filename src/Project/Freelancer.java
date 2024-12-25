package Project;

import Abstract.User;

public class Freelancer extends User
{
    public Freelancer(int id, String name, int age, Job job)
    {
        super(id, name, age);
        this.job = job;
    }

    // class attributes
    private String favoriteLanguage = "Java";
    private Job job;

    // subclass getters and setters
    public Job getJob()
    {
        return this.job;
    }

    // methods of the class
    public String getInfo()
    {
        return "My favorite language is " + this.favoriteLanguage;
    }

    // interface methods implementation
    public void getBasicInfo()
    {
        System.out.println("Basic info placeholder.");
    }

    public void getFullInfo()
    {
        System.out.println("Full info placeholder.");
    }
}
