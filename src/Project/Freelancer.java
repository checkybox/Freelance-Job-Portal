package Project;

import Abstract.User;
import Interfaces.JobAction;
import java.util.ArrayList;

public class Freelancer extends User implements JobAction
{
    public Freelancer() {}

    public Freelancer(String name, int age, int experience, Job job)
    {
        super(name, age);
        this.experience = experience;
        this.job = job;
    }

    // subclass attributes
    private int experience;
    private Job job;

    // subclass getters and setters
    public Job getJob() { return this.job; }
    public int getExperience() { return this.experience; }
    public void setJob(Job job) { this.job = job; }
    public void setExperience(int experience) { this.experience = experience; }

    public static void printAvailableFreelancers(ArrayList<Freelancer> freelancers)
    {
        System.out.println("Available freelancers:");
        for(Freelancer freelancer : freelancers)
        {
            System.out.println(freelancer);
            System.out.println();
        }
    }

    // interface methods implementation
    public void printBasicInfo()
    {
        System.out.println("Basic info placeholder.");
    }

    public void printFullInfo()
    {
        System.out.println("Outputting full info for freelancer " + this.getName() + ":");
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        if (job == null)
        {
            return super.toString() + "Experience : " + experience + " years";
        }
        else
        {
            return super.toString() + "Experience : " + experience
                    + " years\nJob : " + job.getTitle();
        }
    }

    // equal if they have the same job and experience
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Freelancer freelancer = (Freelancer) obj;
        if (experience != freelancer.experience) return false;
        return job.equals(freelancer.job);
    }

    @Override
    public int hashCode()
    {
        return (getName() == null ? 0 : getName().hashCode());
    }

    @Override
    public void applyForJob(Job job)
    {
        System.out.println("Applying for job " + job.getTitle() + ".");
        this.setJob(job);
        System.out.println("Successfully applied for job " + job.getTitle() + ".");
    }
}
