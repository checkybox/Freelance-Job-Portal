package Project;

// Need to implement abstract methods

import Abstract.Employment;

public class Job extends Employment
{
    public Job() {}

    public Job(String title, int salary, String location, jobTypes jobType)
    {
        super(id++, title, salary, location);
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

    private static int id = 0;
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

    // only jobs with the same title are equal
    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Job job = (Job) obj;
        return jobType == ((Job) obj).getJobType();
    }

    @Override
    public int hashCode()
    {
        return (getTitle() == null ? 0 : getTitle().hashCode());
    }
}
