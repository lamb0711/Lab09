package edu.handong.csee.java.lab09;//package name
import java.util.ArrayList;
import java.util.Scanner;//use scanner class
/**
 * SalesReporter class is save people name and sales to use keyboard. 
 * And print highest people and average.
 * @author magic
 *
 */
public class SalesReporter {//class name
	private double highestSales=0;//save highest of sales
	private double averageSales=0;//save average of sales
	private ArrayList<String> team;//this array save people data. type is salesAssociate 
	private ArrayList<Double> team2;
	private int numberOfAssociates;//number of people
	/**
	 * getData method is save input data to team array.
	 */
	public void getData() {//getData method
		Scanner Keyboard = new Scanner(System.in);//declare keyboard to use scanner 
		String name;//save name
		double sales;//save sales

		System.out.println("Enter number of sales associates");//print message for input number of people
		this.numberOfAssociates = Keyboard.nextInt();//save number of people

		team = new ArrayList<String>();//allocate team array to use SalesAssociate
		team2 = new ArrayList<Double>();

		for (int i=0; i<this.numberOfAssociates; i++) {//loop for input data
			System.out.println("Enter data for associate number"+(i+1));//it show number of people
			System.out.print("Enter name of sales associate : ");//print message for input name
			Keyboard.nextLine();//for eat space
			name =Keyboard.nextLine();//save input data to String name

			System.out.print("Enter associate's sales: ");//print message
			sales = Keyboard.nextDouble();//save input data to sales

			//team[i] = new SalesAssociate();//allocate memory to team array

			team.add(name);//save input data to team array name //debug
			team2.add(sales);//save input data to team array sales
		}

	}
	/**
	 * computeAverage is method that compute average of sales and print it
	 */
	public void computeAverage() {//computeAverage method
		//double sum=0;//declare sum local variable to save sum of sales
		double total=0;
		for(Double sum : team2) {//loop for add sales to sum
			total = total + sum;//add sales to sum
	
		}
		total = total/numberOfAssociates;//sum is divided number of array

		System.out.println("\nAverage Sales per associate is $"+total);//print Sales average
		this.averageSales= total;//save average to averageSales
	}
	/**
	 * computehighest method is save highest sales
	 */
	public void computehighest() {//computehighest method
		for(int i=0; i<this.numberOfAssociates; i++) {//loop for save highest sales
			if(this.highestSales < team2.get(i))//if sales is greater than highestSales
				this.highestSales = team2.get(i);//save highest sales to highestSales
		}
		System.out.println("The highest sales figure is $"+this.highestSales);//print highest sales
	}
	/**
	 * displayResults is print team array
	 */
	public void displayResults() {//displayResults method
		System.out.println("The following had the hightest sales:");//print highest sales people data
		for(int i=0; i<this.numberOfAssociates; i++) {//add loop for print data
			if(this.highestSales == team2.get(i)) {//condition for print highest people
				System.out.println("Name: "+team.get(i));//print highest people name
				System.out.println("Sales: $"+team2.get(i));//print highest people sales
				System.out.println(team2.get(i)-this.averageSales+" above the average.");//print over sales
			}
		}
		System.out.println("\nThe rest performed as follows: ");//print message
		for(int i=0; i<this.numberOfAssociates; i++) {//print rest of people
			if(this.highestSales != team2.get(i)) {//if people is not highest people
				System.out.println("Name: "+team.get(i));//print people name
				System.out.println("Sales: $"+team2.get(i));//print people sales
				if(team2.get(i)>this.averageSales)//if people sales is greater than average
					System.out.println(team2.get(i)-this.averageSales+" above the average.");//print sales
				else//if people sales is smaller than average
					System.out.println(this.averageSales-team2.get(i)+" below the average.");//print sales

			}
		}
	}
	/**
	 * main method.
	 * @param args
	 */
	public static void main(String[] args) {//main method
		SalesReporter p = new SalesReporter();//declare instance variable
		p.getData();//debug //call getData method
		p.computeAverage();//call computeAverage method
		p.computehighest();//call computehighest method
		p.displayResults();//call displayResults method
	}

}