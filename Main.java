//import arraylist class
//frm java.util pacKAGE....
import java.util.ArrayList;

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
      toDoList.set(0, toDoList.get(1));
      toDoList.set(1, toDoList.get(2));
      toDoList.remove(2);
      System.out.println(toDoList);
   }
}
