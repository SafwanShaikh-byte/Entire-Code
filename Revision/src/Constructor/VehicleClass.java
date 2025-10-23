package Constructor;

public class VehicleClass {
	
		int year = 2020;
	
		VehicleClass(String type,String color,int year) 
		{
        
			System.out.println("From Parent Class Constructor");
			System.out.println("Vehicle type : " + type);
			System.out.println("Vehicle Colour : " + color);
			System.out.println("manufacture Year : " + year);
			System.out.println();
			
        }
		
		void displayYear() {
			System.out.println("Vehicle Year: " + year);
		}

}
