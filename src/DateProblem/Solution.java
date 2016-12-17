package DateProblem;

public class Solution {

    public  SimpleDate getNextQuarter(SimpleDate date) {
        return new SimpleDate();

    }

    private class SimpleDate {
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
    }

}
