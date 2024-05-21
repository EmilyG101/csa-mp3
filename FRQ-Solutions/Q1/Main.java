public class Main {
  public static void main(String[] args) {
    System.out.println("2024 FRQ 1");
    int rand = (int)(Math.random() * 501) + 500;
    Feeder food = new Feeder(rand);
    food.simulateOneDay(4);
   System.out.println(food.simulateManyDays(5,10));
  } 
}
