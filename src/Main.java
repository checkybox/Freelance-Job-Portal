import Project.Job;
import Project.Freelancer;
import Project.JobPortal;

public class Main
{
    public static void main(String[] args)
    {
        // create an array of jobs
        Job[] jobs = new Job[3];
        jobs[0] = new Job("Software Engineer", 120000);
        jobs[1] = new Job("Data Scientist", 105000);
        jobs[2] = new Job("DevOps Engineer", 125000);

        // create an array of job portals
        JobPortal[] jobPortals = new JobPortal[3];
        jobPortals[0] = new JobPortal("HeadHunter", "Russia");
        jobPortals[1] = new JobPortal("Craigslist", "USA");
        jobPortals[2] = new JobPortal("Fiverr", "Israel");

        Freelancer freelancer1 = new Freelancer("John", 27, jobs[1]);
        System.out.println(freelancer1.getJobFull());
    }
}
