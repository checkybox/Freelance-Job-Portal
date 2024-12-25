package Project;

/* TODO:
derive properties from employment superclass
add jobType parameter (full-time/part-time/freelance/remote/on-site)
 */

import Abstract.Employment;

public class Job extends Employment
{
    public Job(String title, float salary, String location, String jobType)
    {
        super(title, salary, location);
        this.jobType = jobType;
    }

    // class attributes
    private String jobType;

    // subclass getters and setters
    public String getJobType()
    {
        return this.jobType;
    }

    public void setJobType(String jobType)
    {
        this.jobType = jobType;
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
}
