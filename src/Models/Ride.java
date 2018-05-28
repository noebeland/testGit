package Models;

import Models.Limousine;

public class Ride
{
    private String departureCity;
    private String arrivalCity;
    private int kmAtDeparture;
    private int kmAtArrival;
    private Limousine limousineUsed;

    public Ride(String departureCity, String arrivalCity, int kmD, int kmA)
    {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.kmAtDeparture = kmD;
        this.kmAtArrival = kmA;
    }

    @Override
    public String toString()
    {
        return "Ville de depart:" +departureCity+"\nVille d'arriver:"+arrivalCity+"\nKilometrage au depart:"+kmAtDeparture+"\nKilometrage a l'arrivee:"+kmAtArrival;
    }
}
