class   Tv1 {

      static int minVolume;
	  static int maxVolume=6;
	  static int currentVolume;
	  static boolean isConnected;

   public static boolean onOrOff(){
	   System.out.println("inside onOrOff");
	   // if(false==false)
	     if(isConnected== false){
		   isConnected = true;
		   System.out.println("the tv is turned on...");
   }else if(isConnected==true){
	        isConnected= false;
			System.out.println("the tv is turned off");
        
     
	   System.out.println("end of onOrOff");
	   
   }
   return isConnected;
   }
   
	  
	   public static void increaseVolume(){
		System.out.println("start of increaseVolume");
		
		if(isConnected==true){
			if(currentVolume< maxVolume){
			
			currentVolume=currentVolume+1;
			System.out.println("the current volume is " + currentVolume);
			}
	 else{ System.out.println("max volume is reached");
	 }
		}else{
		
	   System.out.println("End of increase volume");
   }   
   
}
 
	  
	  public static void decreaseVolume(){
		System.out.println("start of decreaseVolume");
		
		if(isConnected==true){
			if(currentVolume> minVolume){
			
			currentVolume=currentVolume-1;
			System.out.println("the current volume is " + currentVolume);
			}
	 else{
		 System.out.println("minimum volume is reached");
	 }
		}
		else{
			
	   System.out.println("End of decrease volume");
   }   
   
  
}
}
		