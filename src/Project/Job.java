package Project;

import java.util.ArrayList;
import Abstract.Employment;

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

    private jobTypes jobType;

    // subclass getters and setters
    public jobTypes getJobType() { return this.jobType; }
    public void setJobType(jobTypes jobType) { this.jobType = jobType; }

    public static void printAvailableJobs(ArrayList<Job> jobs)
    {
        System.out.println("Available jobs:");
        for(Job job : jobs)
        {
            System.out.println(job);
            System.out.println();
        }
    }

    // interface methods implementation
    public void getBasicInfo()
    {
        System.out.println("Basic info placeholder.");
    }

    public void getFullInfo()
    {
        System.out.println("Full info placeholder.");
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

    // only jobs with the same title are equal
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return jobType.equals(job.jobType);
    }

    @Override
    public int hashCode()
    {
        return (getTitle() == null ? 0 : getTitle().hashCode());
    }
}
