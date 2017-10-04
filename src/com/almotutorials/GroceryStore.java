package com.almotutorials;

import com.almotutorials.drinks.*;
import com.almotutorials.exception.ApplicationException;
import com.almotutorials.fruits.Apple;
import com.almotutorials.fruits.Fruit;
import com.almotutorials.fruits.Orange;
import com.almotutorials.vegetables.Potato;
import com.almotutorials.vegetables.Vegetable;

import java.util.Arrays;
import java.util.Scanner;

public class GroceryStore {

    public void run() {
        System.out.println("Hello and welcome to the ALMO Grocery Store. We have fruits, vegetables and drinks. What can we serve you with?");
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        while (true) {
            try {
                if (inputLine.equalsIgnoreCase("fruits")) {
                    String[] fruitTypesArray = Fruit.getFruitTypes();
                    System.out.println(String.format("We have the following fruits: %s. What would you like?", Arrays.toString(fruitTypesArray)));
                    String fruitType = scanner.nextLine();
                    if (fruitType.equalsIgnoreCase("apples")) {
                        String[] appleTypesArray = Fruit.getAppleTypes();
                        System.out.println(String.format("We have the following apples: %s. What would you like?" , Arrays.toString(appleTypesArray)));
                        String appleType = scanner.nextLine();
                        double[] amounts = Fruit.getAmounts();
                        System.out.println(String.format("How many kg do you want? %s", Arrays.toString(amounts)));
                        double kgAmount = scanner.nextDouble();
                        Apple apple = new Apple("apples", 5, kgAmount, appleType);
                        System.out.println(String.format("That will be %d monetary units", apple.getPrice()));

                        // wait for next input, since reading anything else other than Strings does not move to the next line
                        scanner.nextLine();
                    } else if (fruitType.equalsIgnoreCase("oranges")) {
                        String[] countries = Fruit.getCountries();
                        System.out.println(String.format("We have oranges from the following countries: %s. Which would you like?", Arrays.toString(countries)));
                        String country = scanner.nextLine();

                        double[] amounts = Fruit.getAmounts();
                        System.out.println(String.format("How many kg do you want? %s", Arrays.toString(amounts)));
                        double kgAmount = scanner.nextDouble();
                        Orange orange = new Orange("oranges", 3, kgAmount, country);
                        System.out.println(String.format("That will be %d monetary units", orange.getPrice()));

                        // wait for next input, since reading anything else other than Strings does not move to the next line
                        scanner.nextLine();
                    } else {
                        throw new ApplicationException();
                    }

                } else if (inputLine.equalsIgnoreCase("vegetables")) {
                    double[] amounts = Vegetable.getAmounts();
                    System.out.println(String.format("At the moment we only have potatoes in the following amounts: %s. What would you like?", Arrays.toString(amounts)));
                    double kgAmount = scanner.nextDouble();
                    Potato potato = new Potato("potatoes", 4, kgAmount, false, true);
                    System.out.println(String.format("That will be %d monetary units", potato.getPrice()));

                    // wait for next input, since reading anything else other than Strings does not move to the next line
                    scanner.nextLine();
                } else if (inputLine.equalsIgnoreCase("drinks")) {
                    String[] drinkTypes = Drink.getDrinkTypes();
                    System.out.println(String.format("We have the following drinks: %s. What would you like?" , Arrays.toString(drinkTypes)));
                    String drinkType = scanner.nextLine();

                    int[] drinkSizes = Drink.getDrinkSizes();
                    System.out.println(String.format("We have the following bottle sizes (in ml): %s", Arrays.toString(drinkSizes)));
                    int drinkSize = scanner.nextInt();

                    Drink drink;
                    switch (drinkType) {
                        case "still":
                            drink = new StillWater("still", false, drinkSize, 1, "AwesomeWaterCompany");
                            break;
                        case "sparkling":
                            drink = new SparklingWater("sparkling", true, drinkSize, 1, "AwesomeWaterCompany");
                            break;
                        case "cola":
                            drink = new ColaDrink("cola", false, drinkSize, 1, "ColaCompany");
                            break;
                        case "lemonade":
                            drink = new NaturalJuice("lemonade", false, drinkSize, 1, "lemon");
                            break;
                        default:
                            throw new ApplicationException();
                    }

                    System.out.println(String.format("That will be %d monetary units", drink.getPrice()));

                    // wait for next input, since reading anything else other than Strings does not move to the next line
                    scanner.nextLine();
                } else if (inputLine.equalsIgnoreCase("nothing")) {
                    System.out.println("Ok. Thank you for visiting us!");
                    break;
                } else {
                    throw new ApplicationException();
                }
                System.out.println("Anything else?");
                inputLine = scanner.nextLine();
                if (inputLine.equalsIgnoreCase("no")) {
                    System.out.println("Thank you for shopping at us!");
                    break;
                } else if (inputLine.equalsIgnoreCase("yes")) {
                    System.out.println("What would you like?");
                    inputLine = scanner.nextLine();
                } else {
                    throw new ApplicationException();
                }
            } catch (ApplicationException ex) {
                System.out.println("I didn't quite understand. Let's try it again. What would you like between fruits, drinks and vegetables?");
                inputLine = scanner.nextLine();
            }
        }
    }

}
