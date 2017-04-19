
public class Destination {
	private String town;//private fields of class Destination
	private Coordinates coordinates;
	
	public Destination(String town, Coordinates coordinates){// this
		this.town = town;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.coordinates=coordinates;
		
	}
	
	public String getTown(){//this method returns town
		return town;
	}
	
	
	public int getCoordinateX(){//this method return x coordinate
		return coordinates.getX();
	}
	public int getCoordinateY(){//this method returns y coordinate
		return coordinates.getY();
	}
	public Coordinates getCoordinates(){//this method returns coordinates of its destination
		return coordinates;
	}
	
}
