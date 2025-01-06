import Project.Admin;
import Project.Freelancer;
import Project.Job;
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

        Admin admin = new Admin("checkybox", "password");
        admin.addUser(freelancers, "Rick");
        admin.addUser(freelancers, "Morty");
        admin.addJob(jobs, "Sleepyhead");

        admin.removeJob(jobs, -1);
        admin.removeUser(freelancers, -1);


        // output available jobs
        Job.printAvailableJobs(jobs);

        // output available freelancers
        Freelancer.printAvailableFreelancers(freelancers);

        // output jobs ordered by salary
        Job.printJobsBySalary(jobs);

        System.out.println(jobs.get(1).equals(jobs.get(3)));
        System.out.println(freelancers.get(1).equals(freelancers.get(3)));
        System.out.println(freelancers.get(1).equals(freelancers.get(2)));

        freelancers.get(1).printFullInfo();
        jobs.get(1).printFullInfo();
        System.out.println();
        System.out.println(jobs.get(1));
    }

    private static ArrayList<Job> initializeJobs()
    {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Network Engineer", 120000, "New York"));
        jobs.add(new Job("DevOps", 135000, "Amsterdam"));
        jobs.add(new Job("Software Engineer", 150000, "San Francisco"));
        jobs.add(new Job("DevOps", 130000, "Berlin"));

        return jobs;
    }

    private static ArrayList<Freelancer> initializeFreelancers()
    {
        ArrayList<Freelancer> freelancers = new ArrayList<>();
        ArrayList<Job> jobs = initializeJobs();
        freelancers.add(new Freelancer("Josh", 28, 5, jobs.get(0)));
        freelancers.add(new Freelancer("Alibek", 30, 7, jobs.get(1)));
        freelancers.add(new Freelancer("Ross", 25, 3, jobs.get(2)));
        freelancers.add(new Freelancer("John", 35, 7, jobs.get(1)));

        return freelancers;
    }

    private static ArrayList<JobPortal> initializeJobPortals()
    {
        ArrayList<JobPortal> jobPortals = new ArrayList<>();

        return jobPortals;
    }
}
