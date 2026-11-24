package magic_password;

import java.security.SecureRandom;

/**
 * Représente l'objet "mot de passe".
 *
 * @author eddy
 */
public class Model {

    private String mdp;

    /**
     * Constructeur de la classe.
     *
     * @param mdp
     */
    public Model(String mdp) {

        this.mdp = mdp;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

}
