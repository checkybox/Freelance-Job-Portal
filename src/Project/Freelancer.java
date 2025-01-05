package Project;

import Abstract.User;

// Needs some more overrides here and there

public class Freelancer extends User
{
    public Freelancer(String name, int age, int experience, Job job)
    {
        super(id++, name, age);
        this.experience = experience;
        this.job = job;
    }

    // class attributes
    private static int id = 0;
    private int experience;
    private Job job;

    // subclass getters and setters
    public Job getJob() { return this.job; }
    public int getExperience() { return this.experience; }
    public void setJob(Job job) { this.job = job; }
    public void setExperience(int experience) { this.experience = experience; }

    // interface methods implementation
    public void getBasicInfo()
    {
        System.out.println("Basic info placeholder.");
    }

    public void getFullInfo()
    {
        System.out.println("Outputting full info for freelancer " + this.getName() + ":");
        System.out.println(toString());
    }

    @Override
    public String toString()
    {
        if (job == null)
        {
            return super.toString() + "Experience : " + experience;
        }
        else
        {
            return super.toString() + "Experience : " + experience
                    + "\nJob : " + job.getTitle();
        }
    }
}
