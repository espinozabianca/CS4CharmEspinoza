public class IndieBand extends Band implements SelfPromoting{
  private String origin;
  
    public IndieBand(String s, int p, String o){
        super(s, p);
        origin = o;
    }

  @Override
  public void perform(){
        if(selectedVenue != null){
            performances++;
          if(selectedVenue.location.equals(origin)){
            popularity += 10;
          }
          else{
            popularity += 5;
          }
          selectedVenue.hostEvent();
          selectedVenue = null;
        }
    }

  @Override
  public void advertise(){
    popularity += (performances/10);
  }
}
