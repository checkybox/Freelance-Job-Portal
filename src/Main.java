import Project.Job;
import Project.Freelancer;
import Project.JobPortal;

public class Main
{
    public static void main(String[] args)
    {
        Freelancer freelancer = new Freelancer("John", 28, "Data Scientist");
        System.out.println(freelancer.getName());
        System.out.println(freelancer.getAge());
        System.out.println(freelancer.getJob());

        freelancer.work();
    }
}
