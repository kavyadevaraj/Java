class SuperMarket{
  static String grocerries[] ={"wheat","rice","egg","oil","gee","butter","turmeric powder",
  "rasam powder","magi","onion","ginger","garlic","jeera","chilli powder"};
  static String snacks[] ={"pizza","burger","chips","moondal","panipuri","french frice","samosa",
  "pasta","pakoda","gobi","noodles","pav bajji","sev puri","egg roll","veg roll"};

  public static void main(String SuperMarket[]){
   /* System.out.println("the supermarket grocerries are " +grocerries[0]+
	" "+grocerries[1]+ " "+grocerries[2]);  
	System.out.println("the supermarket snacks are " +snacks[0]+ " "+snacks[1]);  */
	  System.out.println("main started");
		  System.out.println("the grocerries available are:");
		  System.out.println("the lengthof grocerries is "+ grocerries.length);
		   
		   for(int index=0; index<grocerries.length;index++){
			   System.out.println(grocerries[index]);
		   }
		   System.out.println("___________________");
		   for(int index=grocerries.length-1;index>=0;index--){
			   System.out.println(grocerries[index]);
		   }
		   System.out.println("main ended");
		  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}