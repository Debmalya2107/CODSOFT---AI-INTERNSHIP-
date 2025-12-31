 import java.util.Scanner;
import java.util.ArrayList;
public class RestaurantBillingSystem 
{
  private static Scanner sc = new Scanner(System.in);
  private static double totalAmount = 0;
  private static ArrayList<String> orderedItems = new ArrayList<>();
  public static void main(String[] args)

  {
    while (true) 
    {
      System.out.println("Welcome to Multi Cuisine Restaurant");
      System.out.println("1. Starters");
      System.out.println("2. Main Course");
      System.out.println("3. Deserts");
      System.out.println("4. Exit");

      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();

      if (choice == 4) 
      {
        break;
      }

      if (choice < 1 || choice > 3)
      {
        System.out.println("Invalid choice. Please try again.");
        continue;
      }
      char vegNonVeg = ' ';
      if (choice == 1 || choice == 2)
      {
        System.out.print(
            "Do you prefer Veg or Non-Veg? (V/v for Veg, N/n for Non-Veg): ");
        vegNonVeg = sc.next().charAt(0);
        if (vegNonVeg != 'V' && vegNonVeg != 'v' && vegNonVeg != 'N'
            && vegNonVeg != 'n') {
          System.out.println("Invalid choice. Please try again.");
          continue;
        }
      }

      switch (choice)
      {
        case 1:
          if (vegNonVeg == 'V' || vegNonVeg == 'v') 
          {
            displayItems("Starters", "Veg Starters",
                new String[] 
                {
                    "FOOD NAME: Veg Spring Roll \n FOOD DESCRIPTION : popular "
                        + "Chinese snack of crispy rolls filled with a savory "
                        + "mixed vegetables stuffing.\n Hot handheld pockets "
                          + "of "
                        + "spiced veggies are wrapped and deep fried for an "
                        + "endlessly adaptable and delightfully dippable snack "
                          + "\n "
                        + "FOOD PRICE(excluding GST)",
                    "FOOD NAME:- Paneer Tikka \n FOOD DESCRIPTION:-  a popular "
                        + "and delicious tandoori starter and snack where "
                          + "Paneer "
                        + "(Indian cottage cheese cubes) \n are marinated in a "
                        + "spiced yogurt-based marinade, arranged on skewers "
                          + "and "
                        + "grilled in the oven. \n FOOD PRICE(excluding GST):",
                    "FOOD NAME:- Stuffed Mushrooms \n FOOD DESCRIPTION:- a "
                        + "plate of bite-sized treasures that are irresistibly "
                        + "savory, creamy, and brimming with flavor. \n FOOD "
                        + "PRICE(excluding GST):-"
                    },
            new double[] {90.0, 70.0, 60.0});
          } 
          else 
          {
            displayItems("Starters", "Non-Veg Starters",
                new String[]
                {
                    "FOOD NAME:-Chicken Wings \n FOOD DESCRIPTION irresistible "
                        + "flavor, versatility,\n and social appeal have made "
                          + "them "
                        + "a staple in many cuisines and gatherings.\n FOOD "
                        + "PRICE(excluding GST)",
                    "FOOD NAME :- Fish Fry \n FOOD DESCRIPTION:- Sink your "
                        + "teeth into our perfectly seasoned fish fry,\n where "
                        + "each flaky fillet is hand-dipped in a secret blend "
                          + "of "
                        + "spices and batter, then fried to a deep golden "
                          + "brown. "
                        + "\n FOOD PRICE (excluding GST):- ",
                    "FOOD NAME :-Prawn Cocktail \n FOOD DESCRIPTION :- Plump, "
                        + "juicy prawns served chilled atop a crisp bed of "
                        + "shredded iceberg lettuce,\n generously drizzled "
                          + "with a "
                        + "creamy, tangy Marie Rose sauce—our prawn cocktail "
                          + "is a "
                        + "retro favorite that never goes out of style. FOOD "
                        + "PRICE(excluding GST):- "
                    },
                new double[] {89.0, 99.0, 100.0});
          }
          break;
        case 2:
          if (vegNonVeg == 'V' || vegNonVeg == 'v')
          {
            displayItems("Main Course", "Veg Main Course",
                new String[] {
                    "FOOD NAME:- Paneer Butter Masala \n FOOD DESCRIPTION :- "
                        + "Soft, melt-in-the-mouth cubes of paneer gently "
                          + "simmered "
                        + "in a luscious, buttery tomato gravy \n infused with "
                        + "aromatic spices—Paneer Butter Masala is North "
                          + "Indian "
                        + "comfort food at its finest \n FOOD PRICE(excluding "
                        + "GST):- ",
                    "FOOD NAME:- Dal Makhani \n FOOD DESCRIPTION:- A rich and "
                        + "hearty Punjabi delicacy, Dal Makhani is the "
                          + "ultimate "
                        + "celebration of comfort and flavor. \n Made with "
                          + "whole "
                        + "black lentils (urad dal) and kidney beans (rajma), "
                          + "this "
                        + "dish is slow-cooked for hours to bring out deep, "
                          + "earthy "
                        + "flavors. \n FOOD PRICE(excluding GST):-  ",
                    "FOOD NAME :- Vegetable Biryani\n FOOD DESCRIPTION:- A "
                        + "vibrant medley of garden-fresh vegetables layered "
                          + "with "
                        + "long-grain basmati rice, \n Vegetable Biryani is a "
                        + "masterpiece of flavor, aroma, and tradition. \n "
                          + "FOOD "
                        + "PRICE(excluding GST):- "
                    },
                new double[] {199.0, 299.0, 234.0});
          }
          else
          {
            displayItems("Main Course", "Non-Veg Main Course",
                new String[] 
                {
                    "FOOD NAME:- Chicken Biryani \n FOOD DESCRIPTION:-  Every "
                        + "bite bursts with flavor—from the warm notes of "
                          + "cloves, "
                        + "cinnamon, \n and cardamom to the subtle heat of "
                          + "green "
                        + "chilies and the freshness of mint and coriander. \n "
                        + "FOOD PRICE(excluding GST):- ",
                    "FOOD NAME :- Fish Curry \n FOOD DESCRIPTION:- Fresh, "
                        + "tender fish simmered in a vibrant, spiced "
                          + "gravy—Fish "
                        + "Curry is a coastal treasure that brings the sea to "
                          + "your "
                        + "plate. \n The curry base is a flavorful blend of "
                        + "onions, tomatoes, garlic, ginger, and a medley of "
                        + "regional spices, slow-cooked until the oil rises "
                          + "and "
                        + "the aroma fills the air. \n FOOD PRICE(excluding "
                        + "GST):- ",
                    "FOOD NAME- Mutton Rogan Josh \n FOOD DESCRIPTION-  A dish "
                        + "born in the snow-capped valleys of Kashmir, \n "
                          + "Mutton "
                        + "Rogan Josh is a true culinary gem—rich, bold, and "
                        + "deeply satisfying.\n FOOD PRICE(excluding GST):- "
                    },
                new double[] {499.0, 329.0, 564.0});
          }
          break;

        case 3:

          displayItems("Deserts", "Deserts",
              new String[]
              {
                  "DESERT NAME :- Gulab Jamun \n DESERT DESCRIPTION:- Warm, "
                      + "soft, and soaked in rose-scented sugar syrup, Gulab "
                        + "Jamun "
                      + "is the heart and soul of Indian desserts. \n "
                      + "PRICE(excluding GST):-",
                  "DESERT NAME Ice Cream \n DESERT DESCRIPTION:-  Smooth, "
                      + "creamy, and irresistibly cold—ice cream is the "
                        + "classic "
                      + "dessert that brings instant joy in every scoop. \n "
                      + "PRICE(excluding GST):-",
                  "DESERT NAME :- Cheesecake \n DESERT DESCRIPTION:-  Velvety "
                      + "smooth and luxuriously rich, cheesecake is the "
                        + "perfect "
                      + "marriage of creamy cheese filling and a buttery, "
                        + "crumbly "
                      + "crust. \n PRICE(excluding GST):-"
                    },
              new double[] {40.0, 80.0, 320.0});
          break;
      }

      System.out.print("Do you want to order more? (Yes/No): ");
      String more = sc.next();

      if (!more.equalsIgnoreCase("Yes")) {
        break;
      }
    }
    double gst = totalAmount * 0.145;
    double finalAmount = totalAmount + gst;

    System.out.println("\n MULTI CUISINE RESTAURANT \n ");
    System.out.println("7677 STATE LOS ANGELOS");
    System.out.println("1800 000000");
    System.out.println(
        "--------------------------------------------------------------------");
    System.out.println("\n--- Bill Details ---");
    System.out.println("\n Receipt no : 3574 ");
    System.out.println(" Table no : 45 ");
    System.out.println(" Date : JULY 5, 2025 ");
    System.out.println(" Customer Name : DEBMALYA BHATTACHARYYA ");
    System.out.println(
        "--------------------------------------------------------------------");
    System.out.println("\n Ordered Items:");
    for (String item : orderedItems) {
      System.out.println("- " + item);
    }
    System.out.println("\n-----------------------------------------------------"
        + "---------------");
    System.out.println("Total Amount: \u20B9" + totalAmount);
    System.out.println("GST (14.5%): \u20B9" + gst);
    System.out.println("Final Amount: \u20B9" + finalAmount);
    System.out.println(
        "--------------------------------------------------------------------");
    System.out.println("\n Payment Mode : Online \n");
    System.out.println("\n Thank you visit us again \n");

    sc.close();
  }

  private static void displayItems(
      String category, String subCategory, String[] items, double[] prices) {
    System.out.println("\n" + category + " - " + subCategory);

    for (int i = 0; i < items.length; i++) {
      System.out.println((i + 1) + ". " + items[i] + " - \u20B9" + prices[i]);
    }

    while (true) {
      System.out.print("Enter item number to order (0 to finish): ");
      int itemNumber = sc.nextInt();

      if (itemNumber == 0) {
        break;
      }

      if (itemNumber < 1 || itemNumber > items.length) {
        System.out.println("Invalid item number. Please try again.");
        continue;
      }

      System.out.print("Number Of Plates: ");
      int quantity = sc.nextInt();

      double itemTotal = prices[itemNumber - 1] * quantity;
      totalAmount += itemTotal;

      String food =
          items[itemNumber - 1].split("\n")[0].replace("FOOD NAME:", "").trim();
      orderedItems.add(food + " (Qty: " + quantity + ")");

      System.out.println("Added " + quantity + " " + food + " to your order.");
    }
  }
}
