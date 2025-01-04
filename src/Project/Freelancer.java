package Project;

import Abstract.User;

import java.sql.SQLOutput;

public class Freelancer extends User
{
    public Freelancer(int id, String name, int age, int workExperience, Job job)
    {
        super(id, name, age);
        this.workExperience = workExperience;
        this.job = job;
    }

    // class attributes
    private int workExperience;
    private Job job;

    // subclass getters and setters
    public Job getJob() { return this.job; }

    public void setJob() { this.job = job; }

    // interface methods implementation
    public void getBasicInfo()
    {
        System.out.println("Basic info placeholder.");
    }

    public void getFullInfo()
    {
        System.out.println(toString());

        // System.out.println("Full info placeholder.");
    }
}
