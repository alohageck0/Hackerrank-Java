package DateProblem;

public class SimpleDate implements Comparable<SimpleDate> {
   private int year = 0;
   private int month = 0;
   private int day = 0;

   public SimpleDate(int year, int month, int day) {
      this.year = year;
      this.month = month;
      this.day = day;
   }

   public SimpleDate() {

   }

   public int getYear() {
      return year;
   }

   public void setYear(int year) {
      this.year = year;
   }

   public int getMonth() {
      return month;
   }

   public void setMonth(int month) {
      this.month = month;
   }

   public int getDay() {
      return day;
   }

   public void setDay(int day) {
      this.day = day;
   }

   @Override
   public String toString() {
      String output = this.day + "/" + this.month + "/" + this.year;
      return output;
   }

   @Override
   public int compareTo(SimpleDate o) {
      if (this.year == o.getYear()) {
         if (this.month == o.getMonth()) {
            if (this.day > o.getDay()) {
               return 1;
            } else if (this.day < o.getDay()) {
               return -1;
            } else {
               return 0;
            }
         } else if (this.month > o.getMonth()) {
            return 1;
         } else {
            return -1;
         }
      } else if (this.year > o.getYear()) {
         return 1;
      } else {
         return -1;
      }
   }
}