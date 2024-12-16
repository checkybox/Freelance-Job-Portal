import Project.Job;
import Project.Freelancer;
import Project.JobPortal;

public class Main
{
    public static void main(String[] args)
    {
        /* create the first freelancer class instance
        and output its properties */
        Freelancer freelancer1 = new Freelancer("John", 28, "Data Scientist");
        System.out.println(freelancer1.getName());
        System.out.println(freelancer1.getAge());
        System.out.println(freelancer1.getJob());
        System.out.println();

        // create the second freelancer class instance
        Freelancer freelancer2 = new Freelancer("Nikola", 43, "Software Engineer");

        // create several jobPortal instances and output their properties
        JobPortal jobPortal1 = new JobPortal("HeadHunter", "Russia");
        JobPortal jobPortal2 = new JobPortal("Craigslist", "USA");
        JobPortal jobPortal3 = new JobPortal("Fiverr", "Multinational online marketplace for freelance services","Israel");
        System.out.println(jobPortal1.getJobPortalName() + " : " + jobPortal1.getOrigin());
        System.out.println(jobPortal2.getJobPortalName() + " : " + jobPortal2.getOrigin());
        System.out.println(jobPortal3.getJobPortalName() + " : " + jobPortal3.getOrigin());
        System.out.println();

        // check if freelancer2 is older than freelancer1
        System.out.println("Checking if " + freelancer2.getName() + " is older than " + freelancer1.getName() + "...");
        if(freelancer2.getAge() > freelancer1.getAge())
        {
            System.out.println(freelancer2.getName() + " is older than " + freelancer1.getName());
        }
        else
        {
            System.out.println(freelancer2.getName() + " is not older than " + freelancer1.getName());
        }
        System.out.println();

        // do the same using the isOlderThan method
        System.out.println("Checking if " + freelancer1.getName() + " is older than " + freelancer2.getName() + "...");
        freelancer1.isOlderThan(freelancer2);
    }
}
