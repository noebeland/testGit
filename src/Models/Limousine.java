package Models;

public class Limousine
{
    private int registrationNumber;
    private int tankCapacity;
    private int passengerCapacity;
    private String color;

    public Limousine(int registrationNumber, int tankCapacity, int passengerCapacity, String color)
    {
        this.registrationNumber = registrationNumber;
        this.tankCapacity = tankCapacity;
        this.passengerCapacity = passengerCapacity;
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "Numero d'mmatriculation:" +registrationNumber+"\nCapacite du reservoir:"+tankCapacity+"\nNombre de passage:"+passengerCapacity+"\nCouleur:"+color;
    }
}
