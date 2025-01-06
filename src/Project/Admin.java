package Project;

import Abstract.User;
import java.util.ArrayList;

public class Admin extends User
{
    public Admin(String username, String password)
    {
        super(username);
        this.password = password;
    }

    // all admin-created users will have negative id's
    private static int lastUserId = 0;
    private static int lastJobId = 0;
    private String username;
    private String password;

    public void addUser(ArrayList<Freelancer> freelancers, String username)
    {
        System.out.println("Adding user " + username + "...");
        Freelancer freelancer = new Freelancer();
        freelancer.setName(username);
        freelancer.setId(--lastUserId);
        freelancers.add(freelancer);
        System.out.println("User " + freelancer.getName() + " added successfully.");
        System.out.println("User ID: " + freelancer.getId());
    }

    public void addJob(ArrayList<Job> jobs, String title)
    {
        System.out.println("Adding job " + title + "...");
        Job job = new Job();
        job.setTitle(title);
        job.setId(--lastJobId);
        jobs.add(job);
        System.out.println("Job " + job.getTitle() + " added successfully.");
        System.out.println("Job ID: " + job.getId());
    }

    public void removeUser(ArrayList<Freelancer> freelancers, int id)
    {
        System.out.println("Removing user with ID " + id);
        for (Freelancer freelancer : freelancers)
        {
            if (freelancer.getId() == id)
            {
                System.out.println("User " + freelancer.getName() + " removed successfully.");
                freelancers.remove(freelancer);
                return;
            }
        }
        System.out.println("User with ID " + id + " not found.");
    }

    public void removeJob(ArrayList<Job> jobs, int id)
    {
        System.out.println("Removing job with ID " + id);
        for (Job job : jobs)
        {
            if (job.getId() == id)
            {
                System.out.println("Job " + job.getTitle() + " removed successfully.");
                jobs.remove(job);
                return;
            }
        }
        System.out.println("Job with ID " + id + " not found.");
    }
}
