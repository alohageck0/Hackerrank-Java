package StateMachine;

import java.util.LinkedList;

public class Main {
   public static void main(String[] args) {

      String genome = "TCGATCGAATCGATCGAATCCAGATCGAATCGATCGAATCGATCGAA";
      String gene = "TCCA";

      LinkedList<Character> list = getListOfChars(genome);
//      list.

   }

   public static boolean checkGene(String genome, String gene) {
      LinkedList<Character> genomeList = getListOfChars(genome);
      LinkedList<Character> geneList = getListOfChars(gene);
      return false;
   }

   public static LinkedList<Character> getListOfChars(String string) {
      LinkedList<Character> list = new LinkedList<>();
      for (int i = 0; i < string.length(); i++) {
         list.add(string.charAt(i));
      }
      return list;
   }

}
