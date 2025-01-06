package Abstract;

// Need to override equals() and other things

import Interface.Outputable;

import java.util.Objects;

public abstract class Employment implements Outputable
{
    public Employment() {}

    public Employment(int id, String title, int salary, String location)
    {
        this.id = id;
        this.title = title;
        this.salary = salary;
        this.location = location;
    }

    // class attributes
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
    public abstract void getBasicInfo();
    public abstract void getFullInfo();

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Employment employment = (Employment) obj;
        return Objects.equals(title, employment.title);
    }
}
