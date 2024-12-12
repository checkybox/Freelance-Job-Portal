package Project;

public class Job
{
    // attributes
    private String jobName;
    private int minimalWage;

    // constructor
    public Job(String jobName, int minimalWage)
    {
        this.jobName = jobName;
        this.minimalWage = minimalWage;
    }

    // getters
    public String getJobName()
    {
        return this.jobName;
    }

    public int getMinimalWage()
    {
        return this.minimalWage;
    }

    // setters
    public void setJobName(String jobName)
    {
        this.jobName = jobName;
    }

    public void setMinimalWage(int minimalWage)
    {
        this.minimalWage = minimalWage;
    }
}
