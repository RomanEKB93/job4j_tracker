package ru.job4j.set;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
      String[] letters = s.toLowerCase().replace("\s", "").split("");
      Set<String> lettersSet = new HashSet<>();
      for (String x : letters) {
              lettersSet.add(x);
      }
      return lettersSet.size() == 26;
    }
}