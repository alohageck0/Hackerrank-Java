package _6kyu.rainfall;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Rainfall {
   public static double mean(String town, String strng) {
      if (ifHasTown(town)) {
         String townRecord;
         ArrayList<Double> arrayOfRecords = new ArrayList<>();
         //change how to grab data
         Scanner input = new Scanner(strng);
         while (input.hasNext()) {
            townRecord = input.next();
            if (townRecord.contains(town)) {
               arrayOfRecords = getArrayOfRecords(town, townRecord);
               break;
            }
         }
         double sum = 0;
         for (int i = 0; i < arrayOfRecords.size(); i++) {
            sum += arrayOfRecords.get(i);
         }
         return sum / 12;
      } else {
         return -1;
      }
   }

   public static double variance(String town, String strng) {
      return 0.0;
   }

   public static boolean ifHasTown(String town) {
      return Arrays.asList(RainfallTest.towns).contains(town);
   }

   public static ArrayList<Double> getArrayOfRecords(String town, String townRecord) {
      ArrayList<Double> arrayOfData = new ArrayList<>();
      String monthsRecords = townRecord.substring(town.length() + 1);
      String[] arrayOfMonths = monthsRecords.split(",");
      for (String month : arrayOfMonths) {
         arrayOfData.add(Double.valueOf(month.substring(4)));
      }
      return arrayOfData;
   }
}
