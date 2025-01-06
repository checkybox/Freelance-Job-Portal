package Project;

// TODO: full class overhaul
import java.util.ArrayList;

public class JobPortal
{
    public JobPortal(){}

    public JobPortal(String name)
    {
        this.id = idCounter++;
        this.name = name;
    }

    public JobPortal(String name, String origin, ArrayList<Job> jobs)
    {
        this.id = idCounter++;
        this.name = name;
        this.origin = origin;
        this.jobs = jobs;
    }

    // class attributes
    private static int idCounter = 0;
    private int id;
    private String name;
    private String origin;
    private ArrayList<Job> jobs;

    // getters
    public String getName() { return this.name; }
    public String getOrigin() { return this.origin; }

    // setters
    public void setName(String name) { this.name = name; }
    public void setOrigin(String origin) { this.origin = origin; }

    public void listJobs()
    {
        System.out.println("Available jobs for portal " + this.getName() + ":");
        for(Job jobs : jobs)
        {
            System.out.println(jobs.getTitle());
        }
    }
}