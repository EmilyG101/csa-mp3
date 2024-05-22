public class Scoreboard {
  private int team1Score;
  private int team2Score;
  private String team1Name;
  private String team2Name;
  private boolean active;

  public Scoreboard(String t1, String t2){
    team1Name = t1;
    team2Name = t2;
    team1Score = 0;
    team2Score = 0;
    active = true;
  }

  public void recordPlay(int num){
    if(num == 0){
      active = !active;
    }
    if(active){
      team1Score += num;
    }else{
      team2Score += num;
    }
  }

  public String getScore(){
    if(active){
      return team1Score + "-" + team2Score + "-" + team1Name;
    }else{
      return team1Score + "-" + team2Score + "-" + team2Name;
    }
  }


