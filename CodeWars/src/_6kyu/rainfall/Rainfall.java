package _6kyu.rainfall;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Rainfall {
   public static ArrayList<Double> rainfall = new ArrayList<>();

   public static double mean(String town, String strng) {
      System.out.println(town);
      ArrayList<Double> rainfall = getListOfRecords(town, strng);
      if (rainfall.size() == 0) {
         return -1;
      }
      double sum = 0;
      for (int i = 0; i < rainfall.size(); i++) {
         sum += rainfall.get(i);
      }
      return sum / 12;
   }

   public static double variance(String town, String strng) {
      System.out.println(town);
      ArrayList<Double> rainfall = getListOfRecords(town, strng);
      if (rainfall.size() == 0) {
         return -1;
      }
      double mean = mean(town, strng);
      double difference = 0;
      for (Double record : rainfall) {
         difference += Math.pow((record - mean), 2);
      }
      return difference / 12;
   }

   public static boolean ifHasTown(String town, String strng) {

      Matcher m = Pattern.compile(town).matcher(strng);

      return m.find();
   }

   public static ArrayList<Double> getListOfRecords(String town, String strng) {
      ArrayList<Double> rainfall = new ArrayList<>();
      String[] towns = strng.split("\n");
      for (String record : towns) {
         Matcher m = Pattern.compile(town).matcher(record.substring(0, record.indexOf(":")));

         System.out.println("town from record" + record.substring(0, record.indexOf(":")));
         if (record.contains(town) ) {
            rainfall = getArrayOfRecords(record);
            break;
         } else {
            return rainfall;
         }
      }
      return rainfall;
   }

   public static ArrayList<Double> getArrayOfRecords(String townRecord) {
      ArrayList<Double> arrayOfData = new ArrayList<>();
      Matcher m = Pattern.compile("\\d+\\.\\d").matcher(townRecord);
      while (m.find()) {
         arrayOfData.add(Double.valueOf(m.group()));
      }
      return arrayOfData;
   }
}
