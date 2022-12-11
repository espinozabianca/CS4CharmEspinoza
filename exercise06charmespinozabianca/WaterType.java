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
public class WaterType extends Monster{
  public WaterType(String name, int hp, int base){
    super(name, "water", "fire", "grass", hp, base);
    atk *= 0.7;
    def *= 1.3;
  }

  @Override
  public void special(){
    this.def += 2;
    this.hp -= 0.1 * this.maxHP;
    super.special();
  }
}