//import java.util.Scanner;

public class InfoProduct {

	public String productName;
	public String productType;
	public int productAmount;
	public int productPlantingAmount; // How many base will plant in the field?
	public int productWaterAmount;
		
	
	public String inputProductInfo(String Name,String Type, int Amount, int PlantingAmount, int WaterAmount) {
		
		productName=Name;
		productType=Type;
		productAmount=Amount;
		productPlantingAmount=PlantingAmount;
		productWaterAmount=WaterAmount;
		
		
		return inputProductInfo(Name, Type, Amount, PlantingAmount, WaterAmount);
		
		
	}

	
		
}

