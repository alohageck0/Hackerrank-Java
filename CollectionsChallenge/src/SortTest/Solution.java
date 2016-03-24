package SortTest;

import java.util.*;

class Student {
   private int id;
   private String fname;
   private double cgpa;

   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }

   public int getId() {
      return id;
   }

   public String getFname() {
      return fname;
   }

   public double getCgpa() {
      return cgpa;
   }


}

public class Solution {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());

      List<Student> studentList = new ArrayList<Student>();
      while (testCases > 0) {
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();

         Student st = new Student(id, fname, cgpa);
         studentList.add(st);

         testCases--;
      }

      Comparator<Student> comparator = new Comparator<Student>() {
         @Override
         public int compare(Student o1, Student o2) {
//            System.out.println("Call");
            if (o2.getCgpa() == o1.getCgpa()) {
               if (o2.getFname().equals(o1.getFname())) {
                  return o2.getId() - o1.getId();
               } else {
                  return o1.getFname().compareTo(o2.getFname());
               }
            } else {
               if (o2.getCgpa() > o1.getCgpa()) {
                  return 1;
               } else {
                  return -1;
               }
            }
         }
      };

      Collections.sort(studentList,comparator);
      for (Student st : studentList) {
         System.out.println(st.getFname());
      }
   }
}


