/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise07charmespinozabianca;

/**
 *
 * @author espin
 */
public class GrassType extends Monster{
  public GrassType(String name, int hp, int base){
    super(name, "grass", "water", "fire", hp, base);
    atk = base;
    def = base;
  }

  public void rest(){
    this.hp += 0.5 * this.maxHP;
  }
  
  @Override
  public void special(){
    this.hp += 0.2 * this.maxHP;
  }
}
