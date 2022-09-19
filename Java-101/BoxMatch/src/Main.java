public class Main {

    public static void main(String[] args) {
	  Fighter fighter1 = new Fighter("ABC",10,120,100,25);
	  Fighter fighter2 = new Fighter("BDE",20,85,85,35);

	  Match match = new Match(fighter1,fighter2,70,110);
	  match.run();

    }
}
