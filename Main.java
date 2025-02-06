//import arraylist class
//frm java.util pacKAGE....
import java.util.ArrayList;
import java.util.*;

public class Main {

   public static void main(String []args){
      //declare arraylist
      // <type> is requiredington
      ArrayList<String> buzzwords;
      // decall the deconstructionist
      ArrayList<String> shoppingList = new ArrayList<String>();
      var glorp = "340" + 1 + 0.5;
      System.out.println(glorp);
      //arraylist can only store objections
      //for int and dubble (primitive types),
      //you must use the method (their wrapper classes)
      ArrayList<Integer> nums = new ArrayList<Integer>();

      nums.add(1);
      nums.add(2);
      nums.add(3);
      
      System.out.println(nums);
      ArrayList<Integer> nums2 = new ArrayList<Integer>();
      nums2 = nums;

      nums.add(4);
      nums.add(5);
      nums.add(6);
      
      System.out.println(nums + " " + nums2);

      ArrayList<Double> testScores = new ArrayList<Double>();
      //java does wrapping for you
      //this is autoboxing.
      //let's actually see it in action once i'm done typing,, which i will be done with quite soon,, once i finish this sentence....

      testScores.add(40.0);
      // double gets wrappeded into Double..............
      System.out.println(testScores);

      System.out.println(nums.size());

      // arratylyist methods =)

      ArrayList<String> toBuy = new ArrayList<String>();

      toBuy.add("Glorpulus Brime");
      toBuy.add("Divvaly Doo");
      toBuy.add("Elephant");
      toBuy.add("cereal");

      System.out.println(toBuy);

      toBuy.set(0, "AGHhHH my lEG");

      System.out.println(toBuy);

      System.out.println(toBuy.size());

      toBuy.add(4, "Real");

      System.out.println(toBuy.get(4));

      toBuy.add(0, "nothing");
      System.out.println(toBuy.get(0));
      toBuy.remove(2);
      System.out.println(toBuy);

      System.err.printf("glark");

      System.out.println(System.getSecurityManager());

      String lastElement = toBuy.get(toBuy.size() - 1);
      System.out.println(lastElement);

      System.out.println(toBuy.listIterator());
      System.out.println(toBuy.spliterator());
      
      toBuy.set(2, "GRETGFOBV BHRGPFOBRETWTPDFBFTRRPEFGRPEPERPPRPE AHHHHHHHHĦ");
      System.out.println(toBuy.get(2));

      toBuy.remove(1);
      System.out.println(toBuy + " has been pickedded");

      ArrayList<String> toDoList = new ArrayList<String>();
      toDoList.add("Do homework");
      toDoList.add("Help me make dinner");
      toDoList.add("Call grandma");
      toDoList.set(1, "Order pizza");
      System.out.println(toDoList.size() + " things to do!");
      System.out.println("Here's the first thing to do: " + toDoList.get(0));
      toDoList.remove(0);
      System.out.println(toDoList);

      //7.3 bponk

      ArrayList<Integer> bnums = new ArrayList<Integer>();
      bnums.add(37);
      bnums.add(77);
      bnums.add(27);
      bnums.add(36);
      bnums.add(63);
      int total = 0;

      //enahanced faar each laaap

      for (Integer val : bnums) {
         total += val;
      }

      System.out.println(total);

      for (int i = 0; i < bnums.size(); i++) {
         total += bnums.get(i);
      }

      System.out.println(total);

      boolean found = false;
      int index = 0;
      while (found == false) {
         if (bnums.get(index) == 63) {
            found = true;
         }
         else {
            System.out.println(bnums.get(index) + " is not 63");
            index++;
         }
      }
      System.out.println(bnums.get(index) + " is gone.");

      for (int i = 0; i < bnums.size(); i++) {
         total *= bnums.get(i);
      }

      System.out.println(total + "...");

      ArrayList<String> watchList = new ArrayList<String>();
      watchList.add("Sopranos");
      watchList.add("Prison Break");
      watchList.add("Snowfall");
      watchList.add("Death Note");
      System.out.println("ehy i watched the top ofthe roof come off");
      ArrayList<ArrayList<Integer>> grid = new ArrayList<>();
        
      for (int i = 0; i < 5; i++) {
            grid.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
               grid.get(i).add(i * j);
            }
      }
        
      System.out.println(grid);
   }
}
