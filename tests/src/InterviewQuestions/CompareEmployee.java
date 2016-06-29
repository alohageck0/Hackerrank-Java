package InterviewQuestions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareEmployee implements Comparator<CompareEmployee>, Comparable<CompareEmployee> {
   private String name, department;
   private int age;

   public CompareEmployee(String name, String department, int age) {
      this.name = name;
      this.department = department;
      this.age = age;
   }

   public String getName() {
      return name;
   }

   public String getDepartment() {
      return department;
   }

   public int getAge() {
      return age;
   }

   @Override
   public int compare(CompareEmployee o1, CompareEmployee o2) {
      if (o1.getDepartment().equalsIgnoreCase(o2.getDepartment())) {
         if (o1.getName().equalsIgnoreCase(o2.getName())) {
            return o1.getAge() - o2.getAge();
         }
         return o1.getName().compareTo(o2.getName());
      }
      return o1.getDepartment().compareTo(o2.getDepartment());
   }

   public static void main(String[] args) {
      CompareEmployee emp1 = new CompareEmployee("Alex", "Z12", 33);
      CompareEmployee emp2 = new CompareEmployee("Alex", "A12", 44);
      CompareEmployee emp3 = new CompareEmployee("Alex", "A12", 99);
      CompareEmployee emp4 = new CompareEmployee("Bob", "A12", 99);
      List<CompareEmployee> list = new ArrayList<>();
      list.add(emp1);
      list.add(emp2);
      list.add(emp3);
      list.add(emp4);

      Collections.sort(list);

      for (CompareEmployee a : list)//printing the sorted list of ages
         System.out.print(a.getName() + ", " + a.getDepartment() + "  : " +
                 a.getAge() + ", ");

   }

   @Override
   public int compareTo(CompareEmployee o) {
      if (this.getDepartment().equalsIgnoreCase(o.getDepartment())) {
         if (this.getName().equalsIgnoreCase(o.getName())) {
            return this.getAge() - o.getAge();
         }
         return this.getName().compareTo(o.getName());
      }
      return this.getDepartment().compareTo(o.getDepartment());
   }
}
