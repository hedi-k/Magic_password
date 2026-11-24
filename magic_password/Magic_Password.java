package magic_password;

/**
 * Permet de créer un mot de passe pour les personnes comme moi qui manquent
 * d'imagination. Réalisé avec le pattern MVC
 *
 * @author eddy date 17/11/2026
 */
public class Magic_Password {

    //Point d'éntré du programme.
    public static void main(String[] args) {

        //Initialisation du modèle.
        Model superModel = new Model("aaa"); // Je peux le faire sans paramètre via un second constructeur.
        Calcul superCalcul = new Calcul();
        //Initialisation du controleur.
        Controler superControler = new Controler(superModel, superCalcul);
        //Intilisation de la vue.
        View superVue = new View(superModel, superCalcul, superControler);
    }
}
