package workshop6;

public class Main {
	public static void main(String[] args) {
		Zoo lion = new Lion("Simba", "Panthera");
		whereIEatAndWhereIStay(lion);
		System.out.println();
		
		
		Zoo giraffe = new Giraffe("Gigi", "Northern");
		whereIEatAndWhereIStay(giraffe);
		System.out.println();
		
		
		Zoo tyrex = new Tyrex("Cutyrex", "Dinosaur");
		whereIEatAndWhereIStay(tyrex);
	}
	public static void whereIEatAndWhereIStay(Zoo zoo) {
		zoo.whatIEat();
		zoo.whereIStay();
	}
}
