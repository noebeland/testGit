public class Limousine
{
    private int immatriculation;
    private int reservoir;
    private int passager;
    private String couleur;

    //Constructeur pour limousine
    public Limousine(int immatriculation, int reservoir, int passager, String couleur)
    {
        this.immatriculation = immatriculation;
        this.reservoir = reservoir;
        this.passager = passager;
        this.couleur = couleur;
    }

    //méthode toString
    @Override
    public String toString()
    {
        String retour = "Numero d'mmatriculation:" +immatriculation+"\nCapacite du reservoir:"+reservoir+"\nNombre de passage:"+passager+"\nCouleur:"+couleur;
        return retour;
    }
}
