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

        // create the second freelancer class instance
        Freelancer freelancer2 = new Freelancer("Nikola", 43, "Software Engineer");

        JobPortal jobPortal1 = new JobPortal("HeadHunter", "Russia");
        JobPortal jobPortal2 = new JobPortal("Craigslist", "USA");
        JobPortal jobPortal3 = new JobPortal("Fiverr", "Multinational online marketplace for freelance services","Israel");
    }
}
