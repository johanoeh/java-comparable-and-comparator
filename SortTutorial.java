
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *  @author Johan oeh
 *  Program displays how to specify the sorting order of a List of user defined objects
 *  by implementing the interfaces Comparable and Comparator
 *  It also displays the use of lamda expressions wich is new from java 8
 */

public class SortTutorial {
  
  public static void main(String [] args) throws Exception{

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
 
    int year = Integer.parseInt(sdf.format(new Date()));
 
    List<Royalty> royales = new ArrayList<>();

    royales.add(new Royalty("Carl Gustav", year - 1946 ));
    royales.add(new Royalty("Silvia", year - 1943 ));
    royales.add(new Royalty("Victoria", year - 1977 ));
    royales.add(new Royalty("Carl Philip", year - 1979 ));
    royales.add(new Royalty("Madeleine", year - 1982 ));


  System.out.println("\nPrinting the unsorted royales\n");

   Collections.shuffle(royales);
   System.out.println(royales);

   // sorts using Comparable implementation in class Royales
   Collections.sort(royales);

   System.out.println("\nPrinting the sorted royales\n");

   System.out.println(royales);
    

  // Old school anonymous inner class Comparator implementation
  Collections.sort(royales, new Comparator<Royalty>(){
    
   @Override
   public int compare(Royalty r1, Royalty r2){ 
     return r1.getName().compareTo(r2.getName());
   }
  
  });


  System.out.println("\nPrinting the royales sorted by name\n");
  System.out.println(royales);
  Collections.shuffle(royales);

  //Java 8 style comparator implementation
  Collections.sort(royales,(Royalty r1, Royalty r2)-> r1.getName().compareTo(r2.getName())); 
  System.out.println("\nPrinting the royales sorted by name using java 8 lamda expression for the Comparator\n");
  System.out.println(royales);

  }

}
