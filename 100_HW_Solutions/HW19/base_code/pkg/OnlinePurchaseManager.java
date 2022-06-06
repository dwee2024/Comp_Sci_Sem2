package pkg;
import java.util.ArrayList;


public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   

   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
   	
   }
   public countElectronicsByMaker(String maker) {
      int counter;
      String maker;
      this.maker = maker;
      if(isElectronic == true) {
         counter++;
         System.out.println("This product is electronic and its maker is " + maker);
         return counter;
      } else {
         return (maker + " is not electronic");
      }
   }
   public hasAdjacentEqualPair() {
      for(int i = 1; i < purchases.size() - 1; i++) {
         if(purchases.get(i -1) = purchases.get(i) && purchases.get(i) = purchases.get(i + 1)) {
            return true;
            }
         }
         if(purchases.size() < 2) {
            return false;
         }
         return false;
   }
   
   
   public String toString()
   {
   	return "" + purchases;
   }
}
