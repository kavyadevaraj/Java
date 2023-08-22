class University{
  static String degreeColleges[]={"gfgc college","sit college","ssit college",
  "east vest college","vit college","ignou University","presidency college","ramaiah college",
  "queens college","maharani college","oxford college","seshadripuram college",
  "christ University","global college","kit college"};
  
   public static void main(String University[]){
   /* System.out.println("the University degreeColleges are " +degreeColleges[0]+ 
	" "+degreeColleges[1]+ " "+degreeColleges[2]);*/
	System.out.println("main started");
		  System.out.println("the University available are:");
		  System.out.println("the lengthof degreeColleges is "+ degreeColleges.length);
		   
		   for(int index=0; index<degreeColleges.length;index++){
			   System.out.println(degreeColleges[index]);
		   }
		   System.out.println("___________________");
		   for(int index=degreeColleges.length-1;index>=0;index--){
			   System.out.println(degreeColleges[index]);
		   }
		   System.out.println("main ended");
		



	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}