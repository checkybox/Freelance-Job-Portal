package Abstract;

public abstract class Employment
{
    public Employment() {}

    public Employment(String title, int salary, String location)
    {
        this.id = idCounter++;
        this.title = title;
        this.salary = salary;
        this.location = location;
    }

    // class attributes
    private static int idCounter = 0;
    private int id;
    private String title;
    private int salary;
    private String location;

    // getters
    public int getId() { return id; }
    public String getTitle() { return title; }
    public int getSalary() { return salary; }
    public String getLocation() { return location; }

    // setters
    public void setId(int id) { this.id = id; }
    public void setTitle(String title) { this.title = title; }
    public void setSalary(int salary) { this.salary = salary; }
    public void setLocation(String location) { this.location = location; }

    @Override
    public String toString()
    {
        return "ID : " + this.getId()
                + "\nTitle : " + this.getTitle()
                + "\nSalary : " + this.getSalary()
                + "\nLocation : " + this.getLocation();
    }
}
