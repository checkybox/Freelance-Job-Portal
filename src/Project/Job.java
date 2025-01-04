package Project;

import Abstract.Employment;

public class Job extends Employment
{
    public Job() {}

    public Job(String title, int salary, String location, jobTypes jobType)
    {
        super(title, salary, location);
        this.jobType = jobType;
    }

    public enum jobTypes
    {
        on_site("On-Site"),
        remote("Remote");

        private final String friendlyName;

        jobTypes(String friendlyName)
        {
            this.friendlyName = friendlyName;
        }

        @Override
        public String toString()
        {
            return this.friendlyName;
        }
    }

    private jobTypes jobType;

    // subclass getters and setters
    public jobTypes getJobType() { return this.jobType; }
    public void setJobType(jobTypes jobType) { this.jobType = jobType; }

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
        return "Title : " + this.getTitle()
                + "\nSalary : " + this.getSalary()
                + "\nLocation : " + this.getLocation()
                + "\nJob Type : " + this.jobType + "\n";
    }
}
