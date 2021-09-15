package org.example;

import javafx.scene.Parent;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        //EntrerNombre();
       // CreerFichier();
    }

    public static void EntrerNombre()
    {
        System.out.println("Veuillez entrer un nombre:");
         Scanner resultat = new Scanner(System.in);

         while(!resultat.hasNextInt())
        {
            System.out.println("Ceci n'est pas un nombre, veuillez entrer un nombre:");
            resultat.next();

        }
        System.out.println("Merci votre nombre est " + resultat.nextInt() );


    }


    public static void CreerFichier() throws IOException {

            File file = new File("C:\\Users\\1584887\\IdeaProjects\\untitled\\untitled\\src\\main\\java\\org\\example","vide.txt");

            if (file.createNewFile()){
                System.out.println("File is created");
            }
            else System.out.println("File already exist");
            String parent = file.getParent();

            File file2 = new File(parent,"Ghiles Kouaou.txt");

        if (file2.createNewFile()){
            System.out.println("File is created");
        }
        else System.out.println("File already exist");

    }


}
