public class Ride
{
    private String villeD;
    private String villeA;
    private int kmD;
    private int kmA;
    private Limousine num_limousine;

    //Constructeur pour Ride
    public Ride(String villeD, String villeA, int kmD, int kmA)
    {
        this.villeD = villeD;
        this.villeA = villeA;
        this.kmD = kmD;
        this.kmA = kmA;
    }

    //méthode toString
    @Override
    public String toString()
    {
        String retour = "Ville de depart:" +villeD+"\nVille d'arriver:"+villeA+"\nKilometrage au depart:"+kmD+"\nKilometrage a l'arrivee:"+kmA;
        return retour;
    }
}
