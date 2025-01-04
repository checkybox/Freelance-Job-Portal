import Abstract.User;
import Project.Job;
import Project.Freelancer;
import Project.JobPortal;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Job net_eng = new Job("Network Engineer", 120000, "New York", Job.jobTypes.on_site);
        Job dev_ops = new Job("DevOps", 135000, "Amsterdam", Job.jobTypes.remote);

        Freelancer john = new Freelancer(0, "John", 28, 4, net_eng);

        // test getters
        System.out.println(net_eng.getTitle());
        System.out.println(net_eng.getSalary());
        System.out.println(net_eng.getLocation());
        System.out.println(net_eng.getJobType());
        net_eng.getBasicInfo();
        net_eng.getFullInfo();
        System.out.println();

        // call toString
        System.out.println(net_eng);
        System.out.println(dev_ops);

        System.out.println(john);

        User user = new Freelancer(20, "Josh", 28, 5, new Job());
        System.out.println(user);
        user.getFullInfo();
    }
}
