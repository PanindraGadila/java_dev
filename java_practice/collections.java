import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;


public class collections {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(12);
        al1.add(3243);
        al1.add(0,44);
        Collections.sort(al1);
        for(int a: al1){
            System.out.println(a);
        }


        LinkedList<Object> ls= new LinkedList<Object>();
        ls.add(12);
        ls.add(true);
        ls.add("test");

        // Collections.sort(ls, Collections.reverseOrder());
        for(Object b: ls){
            System.out.println(b.toString());
        }


// // common methods
// .get();
// .remove();
// .add();
// .clear();
// .size();

        


// hashmap and hashset
        HashMap<String, Integer> hs = new HashMap<String, Integer>();
        hs.put("first", 123123);
        hs.put("sewc", 123123);
        hs.put("lst",984573987);


        // iteration
        for(String a: hs.keySet()){
            System.out.println(a);
            System.out.println(hs.get(a));
        }
        for(Integer a: hs.values()){
            System.out.println(a);
        }


//===========**iterator**=============

// Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing
// size at the same time that the code is trying to loop.
class Iter {
    public static void main(String[] args) {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(12);
      numbers.add(8);
      numbers.add(2);
      numbers.add(23);
      Iterator<Integer> it = numbers.iterator();
      while(it.hasNext()) {
        Integer i = it.next();
        if(i < 10) {
          it.remove();
        }
      }
      System.out.println(numbers);
    }
  }
  































    }


}
