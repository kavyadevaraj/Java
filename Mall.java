class Mall{
  static String shops[]={"Majesta mall","Max wonderland","Millenic plaza","metrica center",
  "mantri mall","orion mall","lulu mall","starcity mall","royal meenakshi mall",
  "garuda mall","park sqare mall","elements mall","vega city mall",
  "max","commercial street mall"};
    
    public static void main(String Mall[]){
	  /*System.out.println("the shops name are " +shops[0]+ " "+shops[1]+ " "+shops[2]+
	  " "+shops[3]);*/
	System.out.println("main started");
		  System.out.println("the Mall available are:");
		  System.out.println("the lengthof shops is "+ shops.length);
		   
		   for(int index=0; index<shops.length;index++){
			   System.out.println(shops[index]);
		   }
		   System.out.println("___________________");
		   for(int index=shops.length-1;index>=0;index--){
			   System.out.println(shops[index]);
		   }
		   System.out.println("main ended");
		














 }
	  }
  