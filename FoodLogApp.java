package smj7v3.FoodLog;


import java.io.File;
import java.io.IOException;
import java.util.List;

public class FoodLogApp {

	public static void main(String[] args) throws IOException {
		
		File file = new File("FoodLog.csv");
		String fileName = System.getProperty("user.home") + "/FoodLog.csv";
		FoodLogWriter.writeFoodLog(fileName, file);

	}

	public FoodLog createFoodLog(String Date, String FoodTime, String FoodItem, double Calories, double Carbohydrates,
			double Sugar, double Fiber, double Protein, double TotalFat) {

		return new FoodLog(Date, FoodTime, FoodItem, Calories, Carbohydrates, Sugar, Fiber, Protein, TotalFat);
	}

	public void printFoodLog(List<FoodLog> list) {

		for (FoodLog FL : list) {

			System.out.println("===========================================");
			System.out.println("Food Time : " + FL.getFoodTime());
			System.out.println("Food Item : " + FL.getFoodItem());
			System.out.println("Calories : " + FL.getCalories());
			System.out.println("Carbohydrates : " + FL.getCarbohydrates());
			System.out.println("Sugar : " + FL.getSugar());
			System.out.println("Protein : " + FL.getProtein());
			System.out.println("Fiber : " + FL.getFiber());
			System.out.println("Total Fat : " + FL.getTotalFat());
			System.out.println("===========================================");
			System.out.println("");			
		}

	}

}
