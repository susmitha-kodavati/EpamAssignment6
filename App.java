
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in) ;
        Collections<Object> ci = new Collections<Object>() ;
        ci.add(511) ;
        ci.add(106) ;
        ci.add(210) ;
        ci.add(188) ;
        ci.add(834) ;
        ci.add("MB");
        ci.add("JCB");
        ci.add("RAMA");
        ci.add("DHANA");
        ci.add("RAJI");
        ci.display() ;
        int x = sc.nextInt() ;
        System.out.println("Element retrived from custom array list which is at index "+x+" is : "+ci.get(x)) ;
        int y = sc.nextInt() ;
        System.out.println("Element removed from custom array list present at particular index "+y+" is :"+ci.remove(y)) ;
        System.out.println("After performing all array list operations the final array list is :") ;
        ci.display() ;
    }
}
