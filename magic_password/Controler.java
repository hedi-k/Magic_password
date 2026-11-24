package magic_password;

/**
 * Controleur, fait la passerelle entre le modèle et la vue.
 *
 * @author eddy
 */
public class Controler {

    private Model superModel;
    private Calcul superCalcul;

    //Constructeur de classe.
    public Controler(Model superModel, Calcul superCalcul) {
        
        this.superModel = superModel;
        this.superCalcul = superCalcul;
    }

    public void generate(int nbChar, boolean maj, boolean num, boolean spe) {   
        this.superModel.setMdp( this.superCalcul.genererChaine(nbChar, maj, num, spe) );
    }

}
