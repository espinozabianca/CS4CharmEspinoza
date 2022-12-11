/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06charmespinozabianca;

/**
 *
 * @author CHARM
 */
public class Exercise06charmespinozabianca {
  public static void main(String[] args) {
    FireType x = new FireType("Litten", 45, 65);
    GrassType y = new GrassType("Sceptile", 70, 85);
    WaterType z = new WaterType("Piplup", 53, 51);

    System.out.println("Simulation of Battles:");

    System.out.println("\n" + x.getName() + " versus " + y.getName() + "\n");
    while (x.getHP() > 0 && y.getHP() > 0) {
      x.attack(y);
      if (y.getHP() <= 0) {
        break;
      }
      y.attack(x);
    }
    x.restoreHealth();
    y.restoreHealth();

    System.out.println("\n" + y.getName() + " versus " + z.getName() + "\n");
    while (y.getHP() > 0 && z.getHP() > 0) {
      y.attack(z);
      if (z.getHP() <= 0) {
        break;
      }
      z.attack(y);
    }
    y.restoreHealth();
    z.restoreHealth();
    
    System.out.println("\n" + x.getName() + " versus " + z.getName() + "\n");
    while (x.getHP() > 0 && z.getHP() > 0) {
      x.attack(z);
      if (z.getHP() <= 0) {
        break;
      }
      z.attack(x);
    }
    x.restoreHealth();
    z.restoreHealth();
  }
}
