class ReligiousBuilding 
 {  
      void attributes(){
    	  String data="Temple,Church,Mosque";
    	  System.out.println("Religious Building includes :" + data);
      }
 }  
   
 class CommercialBuilding
 {
	 void attributes()
	 {
		 String commercial="Stores,Shopping Malls";
		 System.out.println("Commercial Building Contains: " + commercial );
	 }
 }
 
 class ResidentialBuilding
 {
	 void attributes()
	 {
		 String res="Duplex / Appartment";
		 System.out.println("Residential Building Can have: " + res);
	 }
 }
  public class Building_Types
 {  
      public static void main(String[] args)  
      {  
    	  ReligiousBuilding rb=new ReligiousBuilding();
    	  CommercialBuilding cb=new CommercialBuilding();
    	  ResidentialBuilding resb=new ResidentialBuilding();
    	  
    	  rb.attributes();
    	  cb.attributes();
    	  resb.attributes();
      }  
 }  