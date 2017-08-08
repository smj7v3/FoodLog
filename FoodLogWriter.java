package smj7v3.FoodLog;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FoodLogWriter {

	private static final String COMMA_DELIMITER = ",";
	private static final String NEW_LINE_SEPARATOR = "\n";
	private static final String FILE_HEADER = "Date,Food Time,Food Item,Calories,Carbohydrates,Sugar,Protein,Fiber,Total Fat";
	private static Scanner kb;

	public static void writeFoodLog(String fileName, File file) throws IOException {

		List<FoodLog> list = new ArrayList<FoodLog>();
		FoodLogApp app = new FoodLogApp();

		kb = new Scanner(System.in);
		String Dinput;
		String FTinput;
		String FIinput;
		double CALinput;
		double CARBinput;
		double Sinput;
		double Pinput;
		double TFinput;
		double Finput;

		int i = 0;

		while (i < 1000) {

			System.out.print("Enter the date: ");
			Dinput = kb.next();

			System.out.print("Enter the food time: ");
			FTinput = kb.next();

			System.out.print("Enter the food item: ");
			FIinput = kb.next();

			System.out.print("Enter the calories: ");
			CALinput = kb.nextDouble();

			System.out.print("Enter the carbohydrates: ");
			CARBinput = kb.nextDouble();

			System.out.print("Enter the sugar: ");
			Sinput = kb.nextDouble();

			System.out.print("Enter the protein: ");
			Pinput = kb.nextDouble();

			System.out.print("Enter the fiber: ");
			Finput = kb.nextDouble();

			System.out.print("Enter the total fat: ");
			TFinput = kb.nextDouble();

			list.add(app.createFoodLog(Dinput, FTinput, FIinput, CALinput, CARBinput, Sinput, Pinput, Finput, TFinput));

			System.out.println("");
			System.out.print("Do you have another item to input? ");
			String response = kb.next();
			System.out.println("");

			if (response.equalsIgnoreCase("no")) {

				app.printFoodLog(list);
				break;

			} else {
				i++;
			}

			kb.nextLine();

		}

		FileWriter fileWriter = null;

		try {

			fileWriter = new FileWriter(fileName, true);

			if (file.exists() == true) {
				fileWriter.write(FILE_HEADER.toString());
			}
			fileWriter.append(NEW_LINE_SEPARATOR);

			for (FoodLog FL : list) {
				fileWriter.append(String.valueOf(FL.getDate()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getFoodTime()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getFoodItem()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getCalories()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getCarbohydrates()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getSugar()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getProtein()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getFiber()));
				fileWriter.append(COMMA_DELIMITER);
				fileWriter.append(String.valueOf(FL.getTotalFat()));
				fileWriter.append(NEW_LINE_SEPARATOR);
			}

			System.out.println("CSV file was created successfully.");

		} catch (Exception e) {
			System.out.println("Error in FoodLogWriter.");
			e.printStackTrace();
		} finally {

			try {
				fileWriter.flush();
				fileWriter.close();
			} catch (IOException e) {
				System.out.println("Error while flushing/closing file writer.");
				e.printStackTrace();
			}
		}

	}

}
