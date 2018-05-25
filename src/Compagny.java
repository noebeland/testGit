import java.util.ArrayList;

public class Compagny
{
    ArrayList<Limousine> compagnyArrayList = new ArrayList<Limousine>();
    ArrayList<Driver> driverArrayList = new ArrayList<Driver>();

    //méthode pour ajouter une limousine
    public void addLimousine(Limousine l)
    {
       compagnyArrayList.add(l);
    }

    //méthode pour ajouter des conducteurs
    public void addDriver(Driver d)
    {
        driverArrayList.add(d);
    }


}
