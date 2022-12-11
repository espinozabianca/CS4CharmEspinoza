/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07charmespinozabianca;

/**
 *
 * @author espin
 */
public class main {
    public static void main(String[] args) {
    GrassType g = new GrassType("Sceptile", 70, 85);
    Location l = new Location("Starbucks", "Iced Caramel Macchiato");
    Trainer t = new Trainer("Charlie", l);
    NPC n = new NPC("Jack", l);

     System.out.println("The trainer interacts with monster.");
     t.inspect(g);
     System.out.println("\nThe trainer interacts with NPC.");
     t.inspect(n);
     System.out.println("\nThe trainer interacts with location.");
     t.inspect(l);
  }
}
