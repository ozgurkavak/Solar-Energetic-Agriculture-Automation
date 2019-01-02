import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SEEAtest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int userSelection;
		Scanner userOption = new Scanner(System.in);		
		
		System.out.println("\t\t\t WELCOME TO THE SEEA");
		System.out.println("1-Product Information");
		System.out.println("2-Weather Information");
		System.out.println("3-Soil Information");
		System.out.println("4-Water Information");
		System.out.println("5-Process Information");
			
		System.out.printf("\nPlease enter your choise:");
		userSelection = userOption.nextInt();
		
		
		switch(userSelection){
		
			case 1:
				System.out.println("---PRODUCT INFORMATION PAGE---");
				createProduct();
					
				//showProduct();
				break;
		
			case 2:
				System.out.println("---WEATHER INFORMATION PAGE---");
				createWeather();
				break;
		
			case 3:
				System.out.println("---SOIL INFORMATION PAGE---");
				createSoil();
				break;
				
			case 4:
				System.out.println("---WATER INFORMATION PAGE---");
				createWater();
				break;
			
			case 5:
				System.out.println("---PROCESS INFORMATION---");
				System.out.println("SELECT A PROCESS");
				System.out.println("1-START PLANTING");
				System.out.println("2-START IRRIGATION");
				System.out.println("3-START HARVEST");
				selectProcess();
				break;			
		}
	}

	public static void selectProcess() {
		@SuppressWarnings("resource")
		Scanner selectProcess = new Scanner(System.in);
		int chooseProcess;
		System.out.printf("\nPlease make your choise:");
		chooseProcess = selectProcess.nextInt();
			
		switch(chooseProcess) {
			case 1:
				startPlanting();
				break;
			case 2:
				startIrrigation();
				break;
			case 3:
				startHarvest();	
		}
		
	}

	private static void startHarvest() {
		System.out.println("Harvest has been starting...");

		Date harvestTime = new Date();
		System.out.println(harvestTime.toString());
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    System.out.println(df.format(harvestTime));	
	}

	private static void startIrrigation() {
		System.out.println("Irrigaiton has been starting...");
		
		Date irrigationTime = new Date();
		System.out.println(irrigationTime.toString());
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    System.out.println(df.format(irrigationTime));	
	}


	private static void startPlanting() {
		System.out.println("Planting has been starting...");
		
		Date plantingTime = new Date();
		System.out.println(plantingTime.toString());
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
	    System.out.println(df.format(plantingTime));	
	}



	public static void createProduct() {
		
		System.out.println("Product Creating...");
		
		InfoProduct PRODUCT1  = new InfoProduct();
		
		System.out.println("Input Product Name: ");
		@SuppressWarnings("resource")
		Scanner input1 = new Scanner(System.in);
		PRODUCT1.productName = input1.nextLine();
		
		System.out.println("Input Product Type: ");
		@SuppressWarnings("resource")
		Scanner input2 = new Scanner(System.in);
		PRODUCT1.productType = input2.nextLine();
		
		System.out.println("Input Product Amount: ");
		@SuppressWarnings("resource")
		Scanner input3 = new Scanner(System.in);
		PRODUCT1.productAmount = input3.nextInt();
		
		System.out.println("Input Product Planting Amount: ");
		@SuppressWarnings("resource")
		Scanner input4 = new Scanner(System.in);
		PRODUCT1.productPlantingAmount = input4.nextInt();
		
		System.out.println("Input Product Water Amount: ");
		@SuppressWarnings("resource")
		Scanner input5 = new Scanner(System.in);
		PRODUCT1.productWaterAmount = input5.nextInt();
			
		/*PRODUCT1.productName = "Tomato";
		PRODUCT1.productType = "Vegetable";
		PRODUCT1.productAmount = 1000;
		PRODUCT1.productPlantingAmount = 100;
		PRODUCT1.productWaterAmount = 3;
		*/	
		System.out.println("Product Name = "+PRODUCT1.productName
							+"\nProduct Type = "+PRODUCT1.productType
							+"\nProduct Amount = "+PRODUCT1.productAmount
							+"\nProduct Planting Amount = "+PRODUCT1.productPlantingAmount
							+"\nProduct Water Amount = "+PRODUCT1.productWaterAmount);
		System.out.println("\nProduct has been created!");
		
		//createProduct();
	}
	
	public static void createWeather() {
		System.out.println("Weather Information Creating...");
		
		InfoWeather WEATHER1 = new InfoWeather();
		WEATHER1.weatherTemperature = 30;
		WEATHER1.weatherHumidity = 65;
		WEATHER1.UV = 5;
		WEATHER1.windSpeed = 25;
		WEATHER1.windDirection = "NorthEast"; // (create an array-->> North,South,East,West,NorthEast,NorthWest,SouthEast,SouthWest )
		
		System.out.println("Weather Temperature = "+WEATHER1.weatherTemperature
							+"\nWeather Humudity = "+WEATHER1.weatherHumidity
							+"\nUV rate = "+WEATHER1.UV
							+"\nWind Speed = "+WEATHER1.windSpeed
							+"\nWind Direction = "+WEATHER1.windDirection);
							
		System.out.println("\nWeather Information has been created!");	
	}
	
	public static void createSoil() {
		System.out.println("Soil Information Creating...");
		
		InfoSoil SOIL1 = new InfoSoil();
		SOIL1.soilType = "Sandy Soil";
		SOIL1.soilTempereature = 20;
		SOIL1.soilHumidity = 40;
		
		System.out.println("Soil Type = "+SOIL1.soilType
							+"\nSoil Temperature = "+SOIL1.soilTempereature
							+"\nSoil Humudity = "+SOIL1.soilHumidity);
		System.out.println("\nSoil Information has been created!");
		
		
	}

	public static void createWater() {
		System.out.println("Water Information Creating...");
		
		InfoWater WATER1 = new InfoWater();
		WATER1.waterTankCapacity = 10000;
		WATER1.waterPerUnit = 5;
		WATER1.waterDailyConsumption = (WATER1.waterPerUnit*100); // 100-->>PRODUCT1.plantingAmount ???
		
		System.out.println("Water Tank Capacity = "+WATER1.waterTankCapacity
							+"\nWater Per Unit = "+WATER1.waterPerUnit
							+"\nWater Daily Consumption = "+WATER1.waterDailyConsumption);
		
		System.out.println("\nCurrent Water Tank Capacity = "+(WATER1.waterTankCapacity-WATER1.waterDailyConsumption));
		
		System.out.println("\nWater Information has been created!");
		
	}

	/*private static void showProduct() {
		
	}*/

}
