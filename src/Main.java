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
        ArrayList<Freelancer> freelancers = initializeFreelancers(jobs);
        ArrayList<JobPortal> jobPortals = initializeJobPortals(jobs);

        // create an admin, add users and jobs, remove users and jobs
        Admin admin = new Admin("checkybox", "password");
        admin.addUser(freelancers, "Rick");
        admin.addUser(freelancers, "Morty");
        admin.addJob(jobs, "Sleepyhead");

        admin.removeJob(jobs, -1);
        admin.removeUser(freelancers, -1);

        // output available jobs
        System.out.println("Available jobs:");
        Job.printJobs(jobs);

        // output available freelancers
        Freelancer.printAvailableFreelancers(freelancers);

//        // output jobs ordered by salary
//        // (order of jobs in the array will change)
//        Job.printJobsBySalary(jobs);
//
//        // output available jobs again
//        System.out.println("Available jobs:");
//        Job.printJobs(jobs);

        System.out.println(jobs.get(1).equals(jobs.get(3)));
        System.out.println(freelancers.get(1).equals(freelancers.get(3)));
        System.out.println(freelancers.get(1).equals(freelancers.get(2)));
        System.out.println();

        freelancers.get(1).printFullInfo();
        System.out.println();
        jobs.get(1).printFullInfo();
        System.out.println();

        jobPortals.get(0).listJobs();
        jobPortals.get(1).listJobs();
        System.out.println();

        ArrayList<Job> filteredJobs = Job.searchJobsBySalary(jobs, 140000);
        System.out.println("Jobs with salary >= 140000:");
        Job.printJobs(filteredJobs);

        ArrayList<Job> filteredJobs2 = Job.searchJobsByLocation(jobs, "Amsterdam");
        System.out.println("Jobs in Amsterdam:");
        Job.printJobs(filteredJobs2);

        freelancers.get(4).applyForJob(jobs.get(1));
    }

    private static ArrayList<Job> initializeJobs()
    {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Network Engineer", 120000, "New York"));
        jobs.add(new Job("DevOps", 135000, "Amsterdam"));
        jobs.add(new Job("Software Engineer", 150000, "San Francisco"));
        jobs.add(new Job("DevOps", 130000, "Berlin"));
        jobs.add(new Job("Software Engineer", 140000, "Amsterdam"));

        return jobs;
    }

    private static ArrayList<Freelancer> initializeFreelancers(ArrayList<Job> jobs)
    {
        ArrayList<Freelancer> freelancers = new ArrayList<>();
        freelancers.add(new Freelancer("Josh", 28, 5, jobs.get(0)));
        freelancers.add(new Freelancer("Alibek", 30, 7, jobs.get(1)));
        freelancers.add(new Freelancer("Ross", 25, 3, jobs.get(2)));
        freelancers.add(new Freelancer("John", 35, 7, jobs.get(1)));

        return freelancers;
    }

    private static ArrayList<JobPortal> initializeJobPortals(ArrayList<Job> jobs)
    {
        ArrayList<JobPortal> jobPortals = new ArrayList<>();
        jobPortals.add(new JobPortal("Craigslist", "USA", jobs));
        jobPortals.add(new JobPortal("LinkedIn"));
        jobPortals.add(new JobPortal("HeadHunter", "Russia", jobs));

        return jobPortals;
    }
}
