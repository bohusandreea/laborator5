package ro.uoradea;

public class Employee {
    private String name;
    private String email;
    private double hourRate;
    private int capacity;
    private int freeDays;

    private String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name=name;
    }
    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email=email;
    }

    public  double getHourRate()
    {
        return hourRate;
    }

    public  void setHourRate(double hourRate)
    {
        this.hourRate=hourRate;
    }

    public  int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int capacity)
    {
        this.capacity=capacity;
    }

    public int getFreeDays()
    {
        return freeDays;
    }

    public  void setFreeDays(int freeDays)
    {
        this.freeDays=freeDays;
    }

    public double calculateDaylyIncome()
    {
        return capacity*hourRate;
    }
    public double calculateMonthlyIncome()
    {
        return 30.0*capacity*hourRate-freeDays*capacity*hourRate;
    }


}
