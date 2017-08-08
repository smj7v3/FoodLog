package smj7v3.FoodLog;

public class FoodLog {

	private String Date;
	private String FoodTime;
	private String FoodItem;
	private double Calories;
	private double Carbohydrates;
	private double Sugar;
	private double Fiber;
	private double Protein;
	private double TotalFat;

	public FoodLog(String Date, String FoodTime, String FoodItem, double Calories, double Carbohydrates, double Sugar,
			double Fiber, double Protein, double TotalFat) {

		// super();
		this.Date = Date;
		this.FoodTime = FoodTime;
		this.FoodItem = FoodItem;
		this.Calories = Calories;
		this.Carbohydrates = Carbohydrates;
		this.Sugar = Sugar;
		this.Fiber = Fiber;
		this.Protein = Protein;
		this.TotalFat = TotalFat;

	}

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}

	public String getFoodTime() {
		return FoodTime;
	}

	public void setFoodTime(String foodTime) {
		FoodTime = foodTime;
	}

	public String getFoodItem() {
		return FoodItem;
	}

	public void setFoodItem(String foodItem) {
		FoodItem = foodItem;
	}

	public double getCalories() {
		return Calories;
	}

	public void setCalories(double calories) {
		Calories = calories;
	}

	public double getCarbohydrates() {
		return Carbohydrates;
	}

	public void setCarbohydrates(double carbohydrates) {
		Carbohydrates = carbohydrates;
	}

	public double getSugar() {
		return Sugar;
	}

	public void setSugar(double sugar) {
		Sugar = sugar;
	}

	public double getFiber() {
		return Fiber;
	}

	public void setFiber(double fiber) {
		Fiber = fiber;
	}

	public double getProtein() {
		return Protein;
	}

	public void setProtein(double protein) {
		Protein = protein;
	}

	public double getTotalFat() {
		return TotalFat;
	}

	public void setTotalFat(double totalFat) {
		TotalFat = totalFat;
	}

	public String toString() {
		return "FoodLog [Date = " + Date + ", Food Time = " + FoodTime + ", Food Item = " + FoodItem + ", Calories = "
				+ Calories + ", Carbohydrates = " + Carbohydrates + ", Sugar = " + Sugar + ", Fiber = " + Fiber
				+ ", Protein = " + Protein + ", Total Fat = " + TotalFat + "]";

	}

}
