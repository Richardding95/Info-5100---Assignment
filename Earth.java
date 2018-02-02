
public class Earth {
	
	public static void main(String args[]){
		
		Human tom;
		Human joe;
		
		tom = new Human();
		joe = new Human();
		tom.age = 18;
		tom.eyeColor = "Blue";
		tom.heightInInches = 72;
		tom.name = "Tom Link";
		joe.age = 15;
		joe.eyeColor = "Dark";
		joe.heightInInches = 55;
		joe.name = "Joe Zelda";
  
		
		
		tom.speak();
		joe.speak();
		
	}

}
