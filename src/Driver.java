import java.util.ArrayList;

public class Driver
{
    private String nom;
    private String prenom;
    private int anneeE;
    private String adresse;
    ArrayList<Ride> rideArrayList;
    private String identification;

    //Constructeur pour driver
    public Driver(String nom, String prenom,String adresse, int anneeE)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.anneeE = anneeE;
        rideArrayList = new ArrayList<Ride>();
        this.creationID();
    }

    //Accesseur liste des trajets
    public ArrayList<Ride> getRideArrayList()
    {
        return rideArrayList;
    }

    //méthode permettant de créer l'identification du chauffeur
    private void creationID()
    {
        identification = "";
        identification += nom.charAt(0);
        identification += nom.charAt(1);
        identification += nom.charAt(2);
        identification += prenom.charAt(0);
        identification += anneeE%100;
    }

    //méthode toString
    @Override
    public String toString()
    {
        String retour = "Nom:" +nom+"\nPrenom:"+prenom+"\nAnnee d'embauche:"+anneeE+"\nIdentification:"+identification+"\nListe des trajets:"+rideArrayList;
        return retour;
    }

}
