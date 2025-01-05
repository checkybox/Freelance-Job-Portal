package Project;

// TODO: full class overhaul

public class JobPortal
{
    public JobPortal(){}

    public JobPortal(String name)
    {
        this.name = name;
    }

    public JobPortal(String name, String origin, Job[] jobs)
    {
        this.name = name;
        this.origin = origin;
        this.jobs = jobs;
    }

    // class attributes
    private String name;
    private String origin;
    private Job[] jobs;

    // getters
    public String getName()
    {
        return this.name;
    }

    public String getOrigin()
    {
        return this.origin;
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }

    // other class methods
    public void getAvailableJobs()
    {
        System.out.println("Available jobs for portal " + this.getName() + ":");
        for(Job jobs : jobs)
        {
            System.out.println(jobs.getTitle());
        }
    }

    public void getInfo()
    {
        System.out.println(this.getName() + " : " + this.getOrigin());
    }
}