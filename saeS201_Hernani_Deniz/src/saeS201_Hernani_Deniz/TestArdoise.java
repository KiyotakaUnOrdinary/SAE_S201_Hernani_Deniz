package saeS201_Hernani_Deniz;
/**
 * Comment intégrer la librairie ardoise.jar dans votre projet Eclipse
 *
 * 1/ Créer un dossier libs dans votre projet Eclipse
 * Clic droit sur votre projet -> New -> Folder
 *
 * 2/ Copier ardoise.jar dans le dossier libs
 *
 * 3/ Déclarer ardoise.jar comme librairie externe pour votre projet
 * Clic droit sur ardoise.jar (dossier libs) -> Build Path -> Add to Build Path
 */

/**
 * Importation des classes
 * PointPlan
 * Segment
 * Ardoise
 *
 * qui sont fournis dans la librairie ardoise.jar
 */
import ardoise.*;

/**
 * Classe TestArdoise
 * @author Bouchaib
 * @version 2013
 *
 * Validation de l'intégration de la librairie ardoise.jar au projet Eclipse
 */
public class TestArdoise {

    public static void main(String []args ){
        Ardoise ardoise = new Ardoise();
        ardoise.test();
    }
}
