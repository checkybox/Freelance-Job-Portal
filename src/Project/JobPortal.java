package Project;

public class JobPortal
{
    // attributes
    private String name;
    private String origin;
    private Job[] jobs;

    // slim constructor
    public JobPortal(String name)
    {
        this.name = name;
    }

    // main constructor
    public JobPortal(String name, String origin, Job[] jobs)
    {
        this.name = name;
        this.origin = origin;
        this.jobs = jobs;
    }

    public void getJobs()
    {
        System.out.println("Available jobs for portal " + this.getName() + ":");
        for(Job jobs : jobs)
        {
            System.out.println(jobs.getName());
        }
    }

    public void getInfo()
    {
        System.out.println(this.getName() + " : " + this.getOrigin());
    }

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
}