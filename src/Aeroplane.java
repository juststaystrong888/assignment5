
public class Aeroplane {
	//private fields of class Aeroplane
	private String name;
	private Coordinates coordinates;
	private int speed;
	private int totalDistance;
	private int repairDistance;

	public Aeroplane(String name, Coordinates coordinates, int speed, int totalDistance, int repairDistance) {
		this.name = name;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.coordinates = coordinates;
		this.speed = speed;
		this.totalDistance = totalDistance;
		this.repairDistance = repairDistance;
	}

	public String getName() {//this method returns name of aeroplane
		return name;
	}
	
	int k; //define this local variable in order to initialize it to distance of journey from my singleFlight method;
	public int singleFlight(Destination destination) { //this method prints distance of a single journey
		int distance = 0;
		while (coordinates.getX() != destination.getCoordinateX() && coordinates.getY() != destination.getCoordinateY()) {//aeroplane keeps moving towards the destination and distance increases until aeroplane reaches destination coordinates
			
			if (coordinates.getX() - destination.getCoordinateX() < speed
					|| destination.getCoordinateX() - coordinates.getX() < speed) {//when the gap between aeroplane's and destination's coordinates is less than speed
				
				distance+=Math.abs(coordinates.getX() - destination.getCoordinateX());//distance will increase on this gap
				coordinates.setValueX(destination.getCoordinates().getX());//x coordinate of aeroplane sets to destination x coordinate
			}

			else if (coordinates.getX() < destination.getCoordinateX()) { //otherwise if x coordinate of aeroplane is less than destination x coordinate
				coordinates.setValueX(coordinates.getX() + speed); ////the x coordinate of aeroplane is increased by the speed of the aeroplane
				distance+=speed;//distance is increased by speed
			}
			
			else if (coordinates.getX() > destination.getCoordinateX()) {//otherwise if x coordinate of aeroplane is greater than destination x coordinate
				coordinates.setValueX(coordinates.getX() - speed);//the x coordinate of aeroplane is decreased by the speed of the aeroplane and sets to this value
				distance+=speed; //distance is increased by speed
			}
			
			if (coordinates.getY() - destination.getCoordinateY() < speed
					|| destination.getCoordinateY() - coordinates.getY() < speed) {//when the gap between aeroplane's and destination's coordinates is less than speed
				distance+= Math.abs(coordinates.getY() - destination.getCoordinateY());//distance will increase on this gap
				coordinates.setValueY(destination.getCoordinates().getY());//y coordinate of aeroplane sets to destination y coordinate
			}
			
			else if (coordinates.getY() < destination.getCoordinateY()) {// //otherwise if y coordinate of aeroplane is less than destination y coordinate
				coordinates.setValueY(coordinates.getY() + speed);//the y coordinate of aeroplane is increased by the speed of the aeroplane and sets to this value
				distance+=speed;//distance is increased by speed
			}
			
			else if (coordinates.getY() > destination.getCoordinateY()) {
				coordinates.setValueY(coordinates.getY() - speed);//the x coordinate of aeroplane is decreased by the speed of the aeroplane and sets to this value
				distance+=speed;//distance is increased by speed
			}
			//System.out.println("single journey's distance "+distance);
		     k=distance;
		} totalDistance+=distance;
		return k;
	}

	public int getJourneyDistance() {//this method returns traveled total distance
		return totalDistance;

	}

	public int getLocationX() {//method returns x coordinate of aeroplane
		return coordinates.getX();
	}

	public int getLocationY() {//method returns y coordinate of aeroplane
		return coordinates.getY();
	}

	public int getReapairDistance(){//method returns repairDistance value
		return repairDistance;
	}
	public void resetTotalDistance(){ // method sets totalDistance to zero
		totalDistance=0;
	}
}