package Project;

public class Freelancer
{
    // default constructor
    public Freelancer(){}

    // main constructor
    public Freelancer(String name, int age, Job job)
    {
        this.name = name;
        this.age = age;
        this.job = job;
    }

    // class attributes
    private String name;
    private int age;
    private Job job;

    // getters
    public String getName()
    {
        return this.name;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getJob()
    {
        return this.job.getName();
    }

    // setters
    public void setName(String name)
    {
        this.name = name;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public void setJob(String job)
    {
        this.job.setName(job);
    }

    // methods of the class
    public String getJobFull()
    {
        return(this.getName() + " is a " + this.getJob());
    }

    public void isOlderThan(Freelancer freelancer)
    {
        if(this.age > freelancer.getAge())
        {
            System.out.println(this.name + " is older than " + freelancer.getName());
        }
        else
        {
            System.out.println(this.name + " is not older than " + freelancer.getName());
        }
    }
}
