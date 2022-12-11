public class Theater extends Venue{
    private int numStages;

    public Theater(String n, String l, double v, int num){
        super(n, l, v);
        numStages = num;
    }

  @Override
  public boolean checkAvailability(){
    if(numStages > 0) return true;
    else return false;
  }
  @Override
  public void reserve(){
    numStages--;
  }
  @Override
  public void hostEvent(){
    numStages++;
  }
}
