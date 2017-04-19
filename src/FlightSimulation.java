
public class FlightSimulation {

	public static void main(String[] args) {
		Coordinates c1= new Coordinates(70,80);//create object c1 of class Coordinates with 70 and 80 x,y coordinates
		Coordinates c2= new Coordinates(20,40);//create object c2 of class Coordinates with 20 and 40 x,y coordinates
		Coordinates c3= new Coordinates(10,30);//create object c2 of class Coordinates with 10 and 30 x,y coordinates
		
		Coordinates c4 = new Coordinates(70,80); //create object c4 of class Coordinates with 70 and 80 x,y coordinates
		
		Destination destination1 = new Destination("Ottawa",c1); //create object destination1 with town Ottawa and coordinates c1
		Destination destination2 = new Destination("Marrakesh",c2);//create object destination2 with town Marrakesh and coordinates c2
		Destination destination3 = new Destination("York",c3);//create object destination3 with town York and coordinates c3
		
		Aeroplane aeroplane = new Aeroplane("Spitfire",c4,23,0,4900);//create object aeroplane with name Spitfire, coordinates of c4, speed=23 and repairDistance=4900
		
		System.out.println(aeroplane.getName()+" flies from "+destination1.getTown()+" and will land at "+destination2.getTown());//print name of aeroplane, the start and end of journey
		
		aeroplane.singleFlight(destination2);//make aeroplane take a single flight to destination2
		System.out.println("single journey's distance "+aeroplane.singleFlight(destination2)); //print single journey distance
	    System.out.println("total distance: "+aeroplane.getJourneyDistance());//print total travelled distance
	    System.out.println(aeroplane.getName()+" current location coordinates: "+aeroplane.getLocationX()+" " + aeroplane.getLocationY());//print aeroplane current location
	    
	    System.out.println(aeroplane.getName()+" flies from "+destination2.getTown()+" and will land at "+destination3.getTown());//print name of aeroplane, the start and end of journey
	    
	    aeroplane.singleFlight(destination3);//make aeroplane take a single flight to destination3
	    System.out.println("single journey's distance "+aeroplane.singleFlight(destination3));//print single journey distance
	    System.out.println("total distance: "+aeroplane.getJourneyDistance());//print total travelled distance
	    System.out.println(aeroplane.getName()+" current location coordinates: "+aeroplane.getLocationX()+" " + aeroplane.getLocationY());		//print aeroplane current location

        System.out.println(aeroplane.getName()+" flies from "+destination3.getTown()+" and will land at "+destination2.getTown());//print name of aeroplane, the start and end of journey
       
	    aeroplane.singleFlight(destination2);//make aeroplane take a single flight to destination2
	    System.out.println("single journey's distance "+aeroplane.singleFlight(destination2));//print single journey distance

		
	    System.out.println("total distance: "+aeroplane.getJourneyDistance());//print total travelled distance
	    System.out.println(aeroplane.getName()+" current location coordinates: "+aeroplane.getLocationX()+" " + aeroplane.getLocationY());		//print aeroplane current location

        System.out.println(aeroplane.getName()+" flies from "+destination2.getTown()+" and will land at "+destination1.getTown());//print name of aeroplane, the start and end of journey
      
	    aeroplane.singleFlight(destination1);//make aeroplane take a single flight to destination1
	    System.out.println("single journey's distance "+aeroplane.singleFlight(destination1));//print single journey distance
		
	    System.out.println("total distance: "+aeroplane.getJourneyDistance());//print total travelled distance
	    System.out.println(aeroplane.getName()+" current location coordinates: "+aeroplane.getLocationX()+" " + aeroplane.getLocationY());		//print aeroplane current location
       
	     int k = 0;//initialize local variable k to zero
	    for(int i = 1, j=0; i<=120;++i){	//repeat daily schedule 120 days
	    	System.out.println("Day: " +i);
			System.out.println("Total travelled distance "+aeroplane.getJourneyDistance());
    		if(aeroplane.getJourneyDistance()<aeroplane.getReapairDistance()){//when total travelled distance is less than repair distance then
    			
    	    	aeroplane.singleFlight(destination2);//make aeroplane take a single flight to destination2
    	    	
        		aeroplane.singleFlight(destination3);//make aeroplane take a single flight to destination3
        	
        		aeroplane.singleFlight(destination2);//make aeroplane take a single flight to destination2
        	
        		aeroplane.singleFlight(destination1);//make aeroplane take a single flight to destination1

    		}
    	    if (aeroplane.getJourneyDistance()>=aeroplane.getReapairDistance()){ //when total travelled distance exceeds or equals to repair distance then
    	    	aeroplane.resetTotalDistance();//reset totalDistance to zero
			    	i+=6;//skip 7 days on repairing
			    	j++;//if aeroplane on repair increasing times of it by one
			    	System.out.println("aeroplane " +aeroplane.getName()+" is not available next 7 days due to repairs");//print aeroplane and its name is not available during 7 days
			    }
    	    k=j; //initialize k to j value
    		}
	    System.out.println(aeroplane.getName()+" was on repairs "+k + " times"); //print name of aeroplane  how many times it was on repair
           
	  
	}
	
	
	
	
	
	
	
	
	
	
}
