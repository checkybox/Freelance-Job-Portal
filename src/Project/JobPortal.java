package Project;

public class JobPortal
{
    // attributes
    private String jobPortalName;
    private String description;
    private String origin;

    // empty constructor
    public JobPortal(){}

    // constructor with only name property
    public JobPortal(String jobPortalName)
    {
        this.jobPortalName = jobPortalName;
    }

    // constructor without description
    public JobPortal(String jobPortalName, String origin)
    {
        this.jobPortalName = jobPortalName;
        this.origin = origin;
    }

    // constructor with all properties
    public JobPortal(String jobPortalName, String description, String origin)
    {
        this.jobPortalName = jobPortalName;
        this.description = description;
        this.origin = origin;
    }

    // getters
    public String getJobPortalName()
    {
        return this.jobPortalName;
    }

    public String getDescription()
    {
        return this.description;
    }

    public String getOrigin()
    {
        return this.origin;
    }

    // setters
    public void setJobPortalName(String jobPortalName)
    {
        this.jobPortalName = jobPortalName;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setOrigin(String origin)
    {
        this.origin = origin;
    }
}