import Project.Job;
import Project.Freelancer;
import Project.JobPortal;
import java.util.ArrayList;
import java.util.List;

// Add array of freelancers and job portals

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Job> jobs = initializeJobs();
        Freelancer john = new Freelancer("John", 28, 4, jobs.get(0));

        System.out.println(jobs.get(0).getId());
        System.out.println(jobs.get(1).getId());

        // test getters
//        System.out.println(jobs.get(0).getTitle());
//        System.out.println(jobs.get(0).getSalary());
//        System.out.println(jobs.get(0).getLocation());
//        System.out.println(jobs.get(0).getJobType());
//        jobs.get(0).getBasicInfo();
//        jobs.get(0).getFullInfo();
//        System.out.println();

        Freelancer f1 = new Freelancer("Josh", 28, 5, new Job());
        System.out.println(f1);
        f1.getFullInfo();

//        hashing algorithm works!!!!!
//        System.out.println(net_eng.hashCode());
//        System.out.println(net_eng);
//        net_eng.setSalary(149990);
//        net_eng.setTitle("Network ROBBER");
//        System.out.println(net_eng.hashCode());

        // output available jobs
        System.out.println();
        System.out.println("Available jobs:");
        for(Job job : jobs)
        {
            System.out.println(job);
        }

        john.getFullInfo();
    }

    private static ArrayList<Job> initializeJobs()
    {
        ArrayList<Job> jobs = new ArrayList<>();
        jobs.add(new Job("Network Engineer", 120000, "New York", Job.jobTypes.on_site));
        jobs.add(new Job("DevOps", 135000, "Amsterdam", Job.jobTypes.remote));
        return jobs;
    }
}
