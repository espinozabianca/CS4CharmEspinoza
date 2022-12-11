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
    super.special();
  }
}
