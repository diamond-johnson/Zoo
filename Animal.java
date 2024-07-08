package workshop6;

abstract class Animal extends Zoo{
	private String Name;
	private String Species;
	
	Animal(String Name, String Species){
		this.Name = Name;
		this.Species = Species;
		System.out.println("Name: " + Name);
		System.out.println("Species: " + Species);
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public String getSpecies() {
		return Species;
	}
	public void setSpecies(String species) {
		this.Species = species;
	}
	
	public abstract void whatIEat();
	public abstract void whereIStay();
}
