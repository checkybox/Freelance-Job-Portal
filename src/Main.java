import Project.Job;
import Project.Freelancer;
import Project.JobPortal;
import java.util.ArrayList;

// Add array of freelancers and job portals

public class Main
{
    public static void main(String[] args)
    {
        // initialize arrays of class instances
        ArrayList<Job> jobs = initializeJobs();
        ArrayList<Freelancer> freelancers = initializeFreelancers();
        ArrayList<JobPortal> jobPortals = initializeJobPortals();

        freelancers.get(0).setJob(jobs.get(0));
        System.out.println(jobs.get(0).getId());
        System.out.println(jobs.get(1).getId());

        // output available jobs
        System.out.println();
        System.out.println("Available jobs:");
        for(Job job : jobs)
        {
            System.out.println(job);
        }
    }

    private static ArrayList<Job> initializeJobs()
    {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Network Engineer", 120000, "New York", Job.jobTypes.on_site));
        jobs.add(new Job("DevOps", 135000, "Amsterdam", Job.jobTypes.remote));

        return jobs;
    }

    private static ArrayList<Freelancer> initializeFreelancers()
    {
        ArrayList<Freelancer> freelancers = new ArrayList<>();
        freelancers.add(new Freelancer("Josh", 28, 5, new Job()));
        freelancers.add(new Freelancer("Alibek", 30, 7, new Job()));

        return freelancers;
    }

    private static ArrayList<JobPortal> initializeJobPortals()
    {
        ArrayList<JobPortal> jobPortals = new ArrayList<>();

        return jobPortals;
    }
}
