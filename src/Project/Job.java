package Project;

import Abstract.Employment;
import java.util.ArrayList;

public class Job extends Employment
{
    public Job() {}

    public Job(String title, int salary, String location)
    {
        super(title, salary, location);
    }

    public enum jobTypes
    {
        on_site("On-Site"),
        remote("Remote");

        private final String friendlyName;

        jobTypes(String friendlyName) { this.friendlyName = friendlyName; }

        @Override
        public String toString() { return this.friendlyName; }
    }

    // subclass attributes
    private jobTypes jobType;

    // subclass getters and setters
    public jobTypes getJobType() { return this.jobType; }
    public void setJobType(jobTypes jobType) { this.jobType = jobType; }

    public static void printJobs(ArrayList<Job> jobs)
    {
        for(Job job : jobs)
        {
            System.out.println(job);
            System.out.println();
        }
    }

    public static void printJobsBySalary(ArrayList<Job> jobs)
    {
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

    public static ArrayList<Job> searchJobsBySalary(ArrayList<Job> jobs, int minSalary)
    {
        ArrayList<Job> foundJobs = new ArrayList<>();
        for(Job job : jobs)
        {
            if (job.getSalary() >= minSalary)
            {
                foundJobs.add(job);
            }
        }
        return foundJobs;
    }

    public static ArrayList<Job> searchJobsByLocation(ArrayList<Job> jobs, String location)
    {
        ArrayList<Job> foundJobs = new ArrayList<>();
        for(Job job : jobs)
        {
            if (job.getLocation().equals(location))
            {
                foundJobs.add(job);
            }
        }
        return foundJobs;
    }

    public void printFullInfo()
    {
        System.out.println("Outputting full info for job " + this.getTitle() + ":");
        System.out.println(this);
    }

    @Override
    public String toString()
    {
        if (jobType == null)
        {
            return super.toString();
        }
        else
        {
            return super.toString() + "Job Type : " + jobType;
        }
    }

    // equal if they have the same title
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return getTitle().equals(job.getTitle());
    }

    @Override
    public int hashCode()
    {
        return (getTitle() == null ? 0 : getTitle().hashCode());
    }
}
