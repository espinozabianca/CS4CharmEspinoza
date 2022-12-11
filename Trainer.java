/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise09charmespinozabianca;

/**
 *
 * @author espin
 */
import java.util.*;

public class Trainer {
    protected String name;
    private Monster activeMonster;
    private ArrayList<Monster> team;

    public Trainer(String n){
        this.name = n;
        this.activeMonster = null;
        this.team = new ArrayList<>();
    }

    public Monster getActiveMonster(){
        return activeMonster;
    }
    public ArrayList<Monster> getTeam(){
        return team;
    }

    public String getName(){
        return name;
    }

    public void capture(Monster m){
        if(m.getHP() < m.getMaxHP()*0.2){
            team.add(m);
            System.out.println(this.getName() + " caught " + m.getName() + ".");
        }
        else{
            System.out.println(this.getName() + " failed to catch " + m.getName() + ".");
        }
    }
    public void battle(Monster m){
        activeMonster.attack(m);
    }
    public void battle(Trainer t){
        activeMonster.attack(t.getActiveMonster());
    }
    public void sureCapture(Monster m) throws AlreadyCapturedException, FullTeamException 
    {
        if(team.contains(m)){
          throw new AlreadyCapturedException (m.getName() + " has already been captured.");
        }

        if(team.size() == 6){
          throw new FullTeamException ("Team is already full!");
        }
          
        else if(!team.contains(m) && team.size() < 6){
          team.add(m);
          System.out.printf("%s was successfully captured.\n", m.getName());
        }
    }
    public void release(Monster m) throws NotInTeamException
    {
      if(team.contains(m)){
        team.remove(m);
        System.out.printf("%s was released from the team.\n", m.getName());
      }

      else if(!team.contains(m)){
        throw new NotInTeamException(m.getName() + " is not in your team.");
      }
    }
}
