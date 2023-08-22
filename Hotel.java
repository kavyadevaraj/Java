class Hotel {
  static String foodMenu[] = {"idli","vada","figerrice","pulivagre",
  "southmill","upma","tomato bath","roti","chapathi","dosa","masala dosa","puri",
  "jeerarice","friderice","lemonrice","magi","curd rice","pulav","set dosa","shavige bath",
  "bisibele bath","parota","noodles","vangi bath","egg rice","chiken fry","fish curry",
  "dal tadka","gobi","panipuri","sev puri","bhel puri","samosa","pav bhaji","veg roll",
  "egg roll","veg noodles","masala roti","corn soup","palak paneer","menthya bath","palak rice",
  "pakoda","burger","pizza","chakli","bredtost","fruit salad","onion samosa","eggmagi"};
  
     public static void main(String Hotel[]){
		  //System.out.println("The food menu is " + foodMenu[0]+ " "+foodMenu[1]+ " "+foodMenu[2]);
		  System.out.println("main started");
		  System.out.println("the foodMenu available are:");
		  System.out.println("the lengthof foodMenu is "+ foodMenu.length);
		   
		   for(int index=0; index<foodMenu.length;index++){
			   System.out.println(foodMenu[index]);
		   }
		   System.out.println("___________________");
		   for(int index=foodMenu.length-1;index>=0;index--){
			   System.out.println(foodMenu[index]);
		   }
		   System.out.println("main ended");
		  
	 }
}
  
  
  