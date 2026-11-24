package magic_password;

import java.security.SecureRandom;

/**
 * Génére la chaîne en fonction des paramètres selectionnés dans la vue.
 * 
 * @author eddy
 */
public class Calcul {

    private String valeurParDefaut
            = "abcdefghijklmnopqrstuvwxyz";
    private String valeur;

    private final SecureRandom ALEATOIRE = new SecureRandom();

    public String genererChaine(int longueur, boolean maj, boolean num, boolean spe) {

        if (maj) {
            valeur = valeurParDefaut + "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }else{
            valeur = valeurParDefaut;
        }
       
       if(num){
           valeur = valeur + "0123456789";
       }
       
       if(spe){
           valeur = valeur + " ,?;.:/!§&@][{";
       }

        StringBuilder resultat = new StringBuilder(longueur);
        for (int i = 0; i < longueur; i++) {

            resultat.append(valeur.charAt(ALEATOIRE.nextInt(valeur.length())));
        }

        valeur = valeurParDefaut;
        return resultat.toString();
    }

}
