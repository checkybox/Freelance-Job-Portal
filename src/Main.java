import Project.Job;
import Project.Freelancer;
import Project.JobPortal;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        // initialize arrays of class instances
        ArrayList<Job> jobs = initializeJobs();
        ArrayList<Freelancer> freelancers = initializeFreelancers();
        ArrayList<JobPortal> jobPortals = initializeJobPortals();

        // output available jobs
        Job.printAvailableJobs(jobs);

        // output available freelancers
        Freelancer.printAvailableFreelancers(freelancers);

        // output jobs ordered by salary
        System.out.println("Jobs ordered by salary:");
        for (int i = 0; i < jobs.size() - 1; i++)
        {
            for (int j = 0; j < jobs.size() - i - 1; j++)
            {
                if (jobs.get(j).getSalary() < jobs.get(j + 1).getSalary())
                {
                    Job temp = jobs.get(j);
                    jobs.set(j, jobs.get(j + 1));
                    jobs.set(j + 1, temp);
                }
            }
        }
        for(Job job : jobs)
        {
            System.out.println(job);
            System.out.println();
        }
    }

    private static ArrayList<Job> initializeJobs()
    {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Network Engineer", 120000, "New York"));
        jobs.add(new Job("DevOps", 135000, "Amsterdam"));
        jobs.add(new Job("Software Engineer", 150000, "San Francisco"));

        return jobs;
    }

    private static ArrayList<Freelancer> initializeFreelancers()
    {
        ArrayList<Freelancer> freelancers = new ArrayList<>();
        ArrayList<Job> jobs = initializeJobs();
        freelancers.add(new Freelancer("Josh", 28, 5, jobs.get(0)));
        freelancers.add(new Freelancer("Alibek", 30, 7, jobs.get(1)));
        freelancers.add(new Freelancer("Ross", 25, 3, jobs.get(2)));

        return freelancers;
    }

    private static ArrayList<JobPortal> initializeJobPortals()
    {
        ArrayList<JobPortal> jobPortals = new ArrayList<>();

        return jobPortals;
    }
}
