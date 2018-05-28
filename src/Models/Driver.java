package Models;

import java.util.ArrayList;

public class Driver
{
    private String lastName;
    private String firstName;
    private int yearHiring;
    private String address;
    private ArrayList<Ride> rides;
    private String identification;

    public Driver(String lastName, String firstName, String address, int yearHiring)
    {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.yearHiring = yearHiring;
        rides = new ArrayList<Ride>();
        this.creationID();
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFormattedRides()
    {
        String output = "";
        for(int i = 0; i < rides.size(); i++)
        {
            output += rides.get(i) + "\n";
        }

        return output;
    }

    private void creationID()
    {
        identification = "";
        identification += lastName.charAt(0);
        identification += lastName.charAt(1);
        identification += lastName.charAt(2);
        identification += firstName.charAt(0);
        identification += yearHiring%100; // bug possible here. ex: 2000 = 0
    }

    @Override
    public String toString()
    {
        return "Nom: " +lastName+"\nPrenom: "+firstName+"\nAnnee d'embauche: "+yearHiring+"\nIdentification: "+identification+"\nListe des trajets: "+rides;
    }

}
