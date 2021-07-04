/*Developer: Jodayne Byfield
 *Project: Unit Converter Application
 * 
 *This is a unit converter application that can convert between different units of measure (approximate).
 *You can perform volume conversions, distance conversions, and numerical data type conversions.
 *Please select a specific menu by choosing between 1-3 for each specific menu.
 *Entering "4" will either exit the program or return to a previous menu.
 *Enjoy!*/

package main; // The package the class is in

import java.util.Scanner; //imported Scanner class since the application takes in input

public class Converter { // the class the application is located in
	
	public int menuSelector() { //this method helps with selecting a converter. 
		                        //First menu user is greeted with.
		 Scanner menuSelector= new Scanner(System.in); //Scanner object created
		    System.out.println("Welcome to my Unit Converter!"); //menu stuff (next 7 lines)
		    System.out.println("-----------------------------");
		    System.out.println("Please select an option:");
		    System.out.println("1. Volume Conversions");
		    System.out.println("2. Distance Conversions");
		    System.out.println("3. Type Conversions");
		    System.out.println("4. Quit");
		    
		    int menuSelection = menuSelector.nextInt(); //this will help to take in input
		    
		    while (menuSelection < 1 | menuSelection > 4) { //as long as the input is not between 1 and 4...
			System.out.println("Invalid Input. Please enter a number between 1 and 4."); //tell the user..
			menuSelection = menuSelector.nextInt(); //try again for valid input
			    }
		    
		    
		    if (menuSelection == 1) { //go to volume converter
		    	volumeConversions();
		    }
		    
		    if (menuSelection == 2) { //go to distance converter
		    	distanceConversions();
		    }
		    
		    if (menuSelection == 3) { //go to type converter
		    	typeConversions();
		    }
		    
		    if (menuSelection == 4) { //exit the program, understandably.
		    	System.out.println("Understandable. Have a nice day.");
		    	return 0;
		    }
			
		    return 0;	    
	}
 public int volumeConversions() { //volume converter method menu
	 Scanner volumeSelector= new Scanner(System.in); //new Scanner object created
	 System.out.println("Volume Converter"); //menu stuff (next 7 lines)
	    System.out.println("----------------");
	    System.out.println("Please select an option:");
	    System.out.println("1. Gallons to Pints");
	    System.out.println("2. Teaspoons to Cups");
	    System.out.println("3. Liters to Quarts");
	    System.out.println("4. Go Back");
		/*
		 * Everything else for the next two methods is pretty much a rinse and repeat of
		 * the comments stated before
		 */
	    int menuSelection = volumeSelector.nextInt();
	    

	    	
	        while (menuSelection < 1 | menuSelection > 4) {
		    	System.out.println("Invalid Input. Please enter a number between 1 and 4.");
		    	menuSelection = volumeSelector.nextInt();
		    }
	    
	    
	    if (menuSelection == 1) {
	    	gallonsToPints();
	    }
	    
	    if (menuSelection == 2) {
	    	teaspoonsToCups();
	    }
	    
	    if (menuSelection == 3) {
	    	litersToQuarts();
	    }
	    
	    if (menuSelection == 4) {
	    	menuSelector(); 
	    }
	    
	 return 0;
	 
 }
 
public int distanceConversions() {
	Scanner distanceSelector= new Scanner(System.in);
	System.out.println("Distance Converter");
    System.out.println("------------------");
    System.out.println("Please select an option:");
    System.out.println("1. Miles to Inches");
    System.out.println("2. Kilometers to Yards");
    System.out.println("3. Feet to Meters");
    System.out.println("4. Go Back");
    
    int menuSelection = distanceSelector.nextInt();
    

    	
        while (menuSelection < 1 | menuSelection > 4) {
	    	System.out.println("Invalid Input. Please enter a number between 1 and 4.");
	    	menuSelection = distanceSelector.nextInt();
	    }
    
    
    if (menuSelection == 1) {
    	milesToInches();
    }
    
    if (menuSelection == 2) {
    	kilometersToYards();
    }
    
    if (menuSelection == 3) {
    	feetToMeters();
    }
    
    if (menuSelection == 4) {
    	menuSelector();
    }
    
	 return 0;
 }

public String typeConversions() {
	Scanner typeSelector = new Scanner (System.in);
	Scanner IntToDouble= new Scanner(System.in);
	Scanner DoubleToInt= new Scanner(System.in);
	Scanner IntToLong= new Scanner(System.in);
	
	System.out.println("What would you like to convert?");
	System.out.println("1. Int To Double");
    System.out.println("2. Double to Int");
    System.out.println("3. Int To Long");
    System.out.println("4. Go Back");
    
    int menuSelection = typeSelector.nextInt();
  
    while (menuSelection < 1 | menuSelection > 4) {
    	System.out.println("Invalid Input. Please enter a number between 1 and 4.");
    	menuSelection = typeSelector.nextInt();
    }

if (menuSelection == 1) {
	System.out.println("1. Int To Double");
	System.out.println("Enter an int: ");
	int inttoDouble = IntToDouble.nextInt();
	System.out.println(inttoDouble + " as a double is " + (double)inttoDouble);
	
	Scanner moreIntstoDoubles = new Scanner (System.in);
	System.out.println("\nWould you like to continue converting? (y/n)");
	String intstoDoublesMore = moreIntstoDoubles.nextLine();
	
	if (intstoDoublesMore.equals("n")) {
		typeConversions(); //recursion is fun!
	}
	else if (intstoDoublesMore.equals("y")) {
		System.out.println("Enter an int: ");
		inttoDouble = IntToDouble.nextInt();
		System.out.println(inttoDouble + " as a double is " + (double)inttoDouble);
		
		System.out.println("das it.");
		typeConversions();
	}
	
}

if (menuSelection == 2) {
	System.out.println("2. Double to Int");
	System.out.println("Enter a double: ");
	double doubletoInt = DoubleToInt.nextDouble();
	System.out.println(doubletoInt + " as an int is " + (int)doubletoInt);
	
	Scanner moreDoublestoInts = new Scanner (System.in);
	System.out.println("\nWould you like to continue converting? (y/n)");
	String doublestoIntsMore = moreDoublestoInts.nextLine();
	
	if (doublestoIntsMore.equals("n")) {
		typeConversions();
	}
	else if (doublestoIntsMore.equals("y")) {
		System.out.println("Enter a double: ");
		doubletoInt = DoubleToInt.nextDouble();
		System.out.println(doubletoInt + " as an int is " + (int)doubletoInt);
		
		System.out.println("das it.");
		typeConversions();
	}
}

if (menuSelection == 3) {
	System.out.println("3. Int To Long");
	System.out.println("Enter an int: ");
	int inttoLong = IntToLong.nextInt();
	System.out.println(inttoLong + " as a long is " + (long)inttoLong);
	
	Scanner moreIntstoLongs = new Scanner (System.in);
	System.out.println("\nWould you like to continue converting? (y/n)");
	String intstoLongsMore = moreIntstoLongs.nextLine();
	
	if (intstoLongsMore.equals("n")) {
		typeConversions();
	}
	else if (intstoLongsMore.equals("y")) {
		System.out.println("Enter an int: ");
		inttoLong = IntToLong.nextInt();
		System.out.println(inttoLong + " as a long is " + (long)inttoLong);
		
		System.out.println("das it.");
		typeConversions();
	}
}

if (menuSelection == 4) {
	menuSelector();
}

	return null;
	 
}
	public double gallonsToPints() {
		
		Scanner Gal2Pint= new Scanner(System.in);
		System.out.println("Enter a number of gallons: ");
		int galstoPints = Gal2Pint.nextInt();
		System.out.println(galstoPints + " gallons are " + galstoPints*8 + " pints"); //1 gallon is 8 pints
		
		Scanner moreGalstoPints = new Scanner (System.in);
		System.out.println("\nWould you like to continue converting? (y/n)");
		String galstoPintsMore = moreGalstoPints.nextLine();
		
		if (galstoPintsMore.equals("n")) {
			volumeConversions();
		}
		else if (galstoPintsMore.equals("y")) {
			gallonsToPints();
		}
		return 0;
		
	}
	
	public double teaspoonsToCups() {
		
		Scanner Teaspoons2Cups= new Scanner(System.in);
		System.out.println("Enter a number of teaspoons: ");
		int tspsToCups = Teaspoons2Cups.nextInt();
		System.out.println(tspsToCups + " teaspoons are approximately " + tspsToCups*0.0208 + " cups"); //1 teaspoon is 0.0208 cups
		
		Scanner moreTspstoCups = new Scanner (System.in);
		System.out.println("\nWould you like to continue converting? (y/n)");
		String TspstoCupsMore = moreTspstoCups.nextLine();
		
		if (TspstoCupsMore.equals("n")) {
			volumeConversions();
		}
		else if (TspstoCupsMore.equals("y")) {
			teaspoonsToCups();
		}
		return 0;
		
	}
	
	public double litersToQuarts() {
		
		Scanner Lit2Quart= new Scanner(System.in);
		System.out.println("Enter a number of liters: ");
		int litstoQuarts = Lit2Quart.nextInt();
		System.out.println(litstoQuarts + " liters are approximately " + litstoQuarts*1.057 + " quarts"); //1 liter is 1.057 quarts
		
		Scanner moreLitstoQuarts = new Scanner (System.in);
		System.out.println("\nWould you like to continue converting? (y/n)");
		String litstoQuartsMore = moreLitstoQuarts.nextLine();
		
		if (litstoQuartsMore.equals("n")) {
			volumeConversions();
		}
		else if (litstoQuartsMore.equals("y")) {
			litersToQuarts();
		}
		return 0;
		
	}
	
	public double milesToInches() {
		
		Scanner Mile2Inch= new Scanner(System.in);
		System.out.println("Enter a number of miles: ");
		int milestoInches = Mile2Inch.nextInt();
		System.out.println(milestoInches + " miles are approximately " + milestoInches*63360 + " inches"); //1 mile is 63,360 inches
		
		Scanner moreMilestoInches = new Scanner (System.in);
		System.out.println("\nWould you like to continue converting? (y/n)");
		String milestoInchesMore = moreMilestoInches.nextLine();
		
		if (milestoInchesMore.equals("n")) {
			distanceConversions();
		}
		else if (milestoInchesMore.equals("y")) {
			milesToInches();
		}
		return 0;
		
	}
	
	public double kilometersToYards() {
		
		Scanner Kil2Yards= new Scanner(System.in);
		System.out.println("Enter a number of kilometers: ");
		int kilstoYards = Kil2Yards.nextInt();
		System.out.println(kilstoYards + " kilometers are approximately " + kilstoYards*1094 + " yards"); //1 kilometer is 1094 yards
		
		Scanner moreKilsToYards = new Scanner (System.in);
		System.out.println("\nWould you like to continue converting? (y/n)");
		String kilstoYardsMore = moreKilsToYards.nextLine();
		
		if (kilstoYardsMore.equals("n")) {
			distanceConversions();
		}
		else if (kilstoYardsMore.equals("y")) {
			kilometersToYards();
		}
		return 0;
		
	}
	
	public double feetToMeters() {
		
		Scanner Feet2Meter= new Scanner(System.in);
		System.out.println("Enter a number of feet: ");
		int fttoMeters = Feet2Meter.nextInt();
		System.out.println(fttoMeters + " feet are approximately " + fttoMeters*0.3048 + " meters"); //1 foot is 0.3048 meters
		
		Scanner moreFeettoMeters = new Scanner (System.in);
		System.out.println("\nWould you like to continue converting? (y/n)");
		String feettoMetersMore = moreFeettoMeters.nextLine();
		
		if (feettoMetersMore.equals("n")) {
			distanceConversions();
		}
		else if (feettoMetersMore.equals("y")) {
			feetToMeters();
		}
		return 0;
		
	}
	
	
	public static void main(String[] args) { //main method. It runs stuff, which is pretty boss if 
		                                     //you ask me.
		
		    Converter c = new Converter(); //new class object created
		    c.menuSelector(); //invoked the menu selector method which can pretty much run the program.
		    
		    
		    
		    
			/*  
			 * The following code is just an implementation I was using before in the main
			 * method when following instructions in the project description. I commented them out
			 * so I could rely on my methods instead.
			 * */
		/*    Scanner menuSelector= new Scanner(System.in);
		    
		    System.out.println("Please select an option:\n");
		    System.out.println("1. Miles to Inches");
		    System.out.println("2. Gallons to US Pints");
		    System.out.println("3. Kilometers to Yards");
		    System.out.println("4. Quit");
		    
		    int menuSelection = menuSelector.nextInt();
		    
		    while(menuSelection != 4) {
		    	
		        while (menuSelection < 1 | menuSelection > 4) {
			    	System.out.println("Invalid Input. Please enter a number between 1 and 4.");
			    	menuSelection = menuSelector.nextInt();
			    }
		    	
		    switch (menuSelection) {	
		    
		    //default:  ---> didn't use default case
		    
			case 1:
				Scanner milestoInches = new Scanner(System.in);
				System.out.println("Enter a number of miles: ");
				int convertedInches = milestoInches.nextInt();
				System.out.println("The amount of miles in inches is: " + convertedInches*63360);
				
				Scanner continueConverting = new Scanner (System.in);
				System.out.println("\nWould you like to continue converting? (y/n)");
				String convertMore = continueConverting.nextLine();
				
				if (convertMore.equals("n")) {
					break;
				}
				else if (convertMore.equals("y")) {
					main(args);
				}
			case 2:
				System.out.println("B for Binary");
				break;
			case 3:
				System.out.println("C for Compiled");
				break;
			case 4:
				System.out.println("Program has been closed");
				break;
				
			
				
			}
		    break;
		    }
		    */
		   
	}  
	}
