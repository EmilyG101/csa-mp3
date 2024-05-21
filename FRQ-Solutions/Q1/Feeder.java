public class Feeder{
/**
The amount of food, in grams, currently in the bird feeder; initialized in the constructor and
* always greater than or equal to zero
*/
  private int currentFood;

  public Feeder(int c){
    currentFood = c;
  }
/**
* Simulates one day with numBirds birds or possibly a bear at the bird feeder,
* as described in part (a)
* Precondition: numBirds > 0
*/
public void simulateOneDay (int numBirds){
  int multipliedFood = 0;
  int rand = (int)(Math.random()*100)+1;
  if(rand <= 95){
    int randFood = (int)(Math.random()*41) +10;
    multipliedFood = randFood * numBirds;
    if(currentFood < multipliedFood){
      currentFood = 0;
    }else{
      currentFood -= multipliedFood;
    }
  }else{
    currentFood = 0;
  }
}

public int simulateManyDays (int numBirds, int number) {
 if(currentFood == 0){
   return 0;
 }
 int count = 0;
 int i = 0;
 while(i < number){
   simulateOneDay(numBirds);
   if(currentFood > 0){
     count++;
    }
    i++;
   }
  return count;
 }

  }

