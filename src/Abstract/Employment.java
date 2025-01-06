package Abstract;

// Need to override equals() and other things

import Interface.Outputable;

import java.util.Objects;

public abstract class Employment implements Outputable
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

    // abstract methods
    public abstract void printBasicInfo();
    public abstract void printFullInfo();

    @Override
    public String toString()
    {
        return "Title : " + this.getTitle()
                + "\nSalary : " + this.getSalary()
                + "\nLocation : " + this.getLocation();
    }
}
