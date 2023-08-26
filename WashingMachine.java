class WashingMachine{

static boolean isConnected;

 public static boolean onOrOff(){
 System.out.println("Inside onOrOff");
 if(false==false)
 if(isConnected == false){
 isConnected = true;
 System.out.println("the WashingMachine is turned Onn....");
 } else if(isConnected == true){
 isConnected = false;
 System.out.println("the WashingMachine is turned Off");
 System.out.println("end of onOrOff");
 }
 return isConnected;
   
 }
/* public static boolean off(){
	 if(isConnected == true){
 isConnected = false;
 System.out.println("the Speaker is turned Off");
 */
 static int washTime=1;
 static int currentwashTime=0;
 static int rinsTime=1;
 static int currentrinsTime=0;
 static int spinTime=1;
 static int currentspinTime=0;
 public static void washing(){
	 
	 System.out.println("start of Washing");
	 if(isConnected == true){
		 if(washTime > currentwashTime){
			 System.out.println("Washing cloths started with time " + washTime);
		 }
		 else{
			 System.out.println("Washing cloths not started");
		 }
	 }else{
		 System.out.println("Gube...first washing machine onn mado....");
		 
		 
	 }
 }
 
 public static void rinsing(){
	 System.out.println("start of rinshing");
	 if(isConnected == true){
		 if(rinsTime> currentrinsTime){
			 System.out.println("Rinshing cloths started with time" + rinsTime);
		 }
		 else{
			 System.out.println("Rinshing cloths not started");
		 }
	 }else{
		 System.out.println("Gube...first washing machine onn mado....");
		 
		 
	 }
 }
 
 
 public static void spinning(){
	 System.out.println("start of spining");
	 if(isConnected == true){
		 if(spinTime > currentspinTime){
			 System.out.println("spinning cloths started with time" + spinTime);
		 }
		 else{
			 System.out.println("spinning cloths not started");
		 }
	 }else{
		 System.out.println("Gube...first washing machine onn mado....");
		 
		 
	 }
 }
	 }