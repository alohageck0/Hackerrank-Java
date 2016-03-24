package ComparableTest;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;


class Checker {
   public Comparator<Player> desc;

   public Checker() {
      this.desc = new Comparator<Player>() {
         @Override
         public int compare(Player o1, Player o2) {
            if (o1.score == o2.score) {
               return o2.name.compareTo(o1.name);
            } else {
               if (o1.score > o2.score) {
                  return -1;
               } else {
                  return 1;
               }
            }
         }

      };
   }
}

class Player {
   String name;
   int score;
}

public class Solution {

   public static void main(String[] args) throws NumberFormatException, IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int N = Integer.parseInt(br.readLine().trim());
      String s;
      StringTokenizer st;
      Player Player[] = new Player[N];
      Checker check = new Checker();
      for (int i = 0; i < N; i++) {
         s = br.readLine().trim();
         st = new StringTokenizer(s);
         Player[i] = new Player();
         Player[i].name = st.nextToken();
         Player[i].score = Integer.parseInt(st.nextToken());
      }

      Arrays.sort(Player, check.desc);
      for (int i = 0; i < Player.length; i++) {
         System.out.printf("%s %s\n", Player[i].name, Player[i].score);
      }


   }
}
