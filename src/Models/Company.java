package Models;

import java.util.ArrayList;

public class Company
{
    ArrayList<Limousine> limousines = new ArrayList<Limousine>();
    ArrayList<Driver> driverArrayList = new ArrayList<Driver>();

    public void addLimousine(Limousine l)
    {
       limousines.add(l);
    }

    public void addDriver(Driver d)
    {
        driverArrayList.add(d);
    }

    public String showAllRides() {
        System.out.println("all rides");
        return "all rides";
    }

    public String showAllDrivers() {
        String output = "Driver count: " + driverArrayList.size() + "\n";
        for(int i = 0; i < driverArrayList.size(); i++)
        {
            output += i + ": " + driverArrayList.get(i) + "\n";
        }

        return output;
    }

    public Driver findDriverByName(String firstName, String lastName) {
        Driver driver;
        for(int i = 0; i < driverArrayList.size(); i++)
        {
            driver = driverArrayList.get(i);
            if (driver.getFirstName().equals(firstName) && driver.getLastName().equals(lastName)) {
                return driver;
            }
        }

        return null;
    }
}
