package SwiftFood;

public class Food {
    
    public String foodName;
    public String cuisine;
    public String foodType;
    public int quantityAvailabel;
    public double unitPrice;

    public void displayFoodDetails() {
		System.out.println("Displaying Food details \n***********");
		System.out.println("Food Name : " + foodName);
		System.out.println("Cuisine : " + cuisine);
		System.out.println("Food Type : " + foodType);
		System.out.println("Quantity : " + quantityAvailabel);
        System.out.println("Price : " + unitPrice);
		System.out.println();
}
}
