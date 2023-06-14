package saeS201_Hernani_Deniz;

import ardoise.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    	// Instanciation de l'ardoise
        Ardoise ardoise = new Ardoise();
        
        // ETOILE
        // Instanciation des points pour chaque branche (chapeau)
        PointPlan point1 = new PointPlan(170, 52);
        PointPlan point2 = new PointPlan(173, 45);
        PointPlan point3 = new PointPlan(177, 52);

        PointPlan point4 = new PointPlan(177, 52);
        PointPlan point5 = new PointPlan(184, 57);
        PointPlan point6 = new PointPlan(177, 60);

        PointPlan point7 = new PointPlan(177, 60);
        PointPlan point8 = new PointPlan(174, 66);
        PointPlan point9 = new PointPlan(170, 60);

        PointPlan point10 = new PointPlan(170, 60);
        PointPlan point11 = new PointPlan(164, 57);
        PointPlan point12 = new PointPlan(170, 52);
        
        // Instanciation des branches (chapeaux)
        Chapeau branche1 = new Chapeau(point1, point2, point3);
        Chapeau branche2 = new Chapeau(point4, point5, point6);
        Chapeau branche3 = new Chapeau(point7, point8, point9);
        Chapeau branche4 = new Chapeau(point10, point11, point12);
        
        // Instanciation de l'étoile avec les branches
        Etoile etoile = new Etoile(branche1, branche2, branche3, branche4);
        
        // Ajout de l'étoile dans l'ardoise
        ardoise.ajouterForme(etoile);
        
        // OISEAUX
        // Instanciation des points pour chaque chapeau
        PointPlan point1A = new PointPlan(118, 13);
        PointPlan point2A = new PointPlan(123, 20);
        PointPlan point3A = new PointPlan(128, 13);

        PointPlan point4A = new PointPlan(133, 30);
        PointPlan point5A = new PointPlan(136, 32);
        PointPlan point6A = new PointPlan(138, 30);

        PointPlan point7A = new PointPlan(142, 14);
        PointPlan point8A = new PointPlan(144, 17);
        PointPlan point9A = new PointPlan(146, 14);

        // Instanciation des oiseaux avec les points
        Chapeau oiseau1 = new Chapeau(point1A, point2A, point3A);
        Chapeau oiseau2 = new Chapeau(point4A, point5A, point6A);
        Chapeau oiseau3 = new Chapeau(point7A, point8A, point9A);
        
        // Ajout des oiseaux dans l'ardoise
        ardoise.ajouterForme(oiseau1);
        ardoise.ajouterForme(oiseau2);
        ardoise.ajouterForme(oiseau3);
        
        // MAISON
        // Instanciation des points pour chaque structure et instanciation des structures (quadrilateres, triangle)
        Quadrilatere corpsMaison = new Quadrilatere(new PointPlan(80, 140), new PointPlan(180, 198));
    	Triangle toitMaison = new Triangle(new PointPlan(80, 140), new PointPlan(130, 100), new PointPlan(180, 140));
    	Quadrilatere porteMaison = new Quadrilatere(new PointPlan(120, 170), new PointPlan(140, 198));
    	
        // Instanciation de la maison avec les structures
        Maison maison = new Maison(corpsMaison, toitMaison, porteMaison);
        
        // Ajout de la maison dans l'ardoise
        ardoise.ajouterForme(maison);
        
        // TOUR
        // Instanciation des points pour crée l'objet tour
        Quadrilatere tour = new Quadrilatere(new PointPlan(9, 100), new PointPlan(20, 198));

        // Ajout de la tour dans l'ardoise
        ardoise.ajouterForme(tour);
        
        // MONTAGNE
        // Instanciation des points pour la montagne 1 et 2
        PointPlan point1B = new PointPlan(3, 14);
        PointPlan point2B = new PointPlan(43, 3);
        PointPlan point3B = new PointPlan(112, 14);
        
        PointPlan point1C = new PointPlan(152, 7);
        PointPlan point2C = new PointPlan(166, 3);
        PointPlan point3C = new PointPlan(172, 7);
        
        // Création du triangle pour la montagne 1 et 2
        Triangle montagne1 = new Triangle(point1B, point2B, point3B);
        Triangle montagne2 = new Triangle(point1C, point2C, point3C);
        
        // Ajout de la montagne1 dans l'ardoise
        ardoise.ajouterForme(montagne1);
        ardoise.ajouterForme(montagne2);

        // Affichage graphique de l'ardoise
        ardoise.dessinerGraphique();
        
        // Attente d'une seconde
        Thread.sleep(1000);
        
        // Déplacement des oiseaux de 10 points en abscisse et 20 points en ordonnée
        oiseau1.deplacer(10, 20);
        oiseau2.deplacer(10, 20);
        oiseau3.deplacer(10, 20);
        
        // Affichage graphique de l'ardoise
        ardoise.dessinerGraphique();
        }
    	
     }

