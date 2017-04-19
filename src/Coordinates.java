
public class Coordinates {
	private int x;//private fields of class Coordinates
	private int y;
	
	public Coordinates(int x, int y){//constructor of class Coordinates with parameters of x and y coordinates 
		this.x = x;//clarify that I am talking about a field, when there's also constructor's parameter with the same name as a field
		this.y = y;
	}
	
	public void setValueX(int x){//this method sets the value of x coordinate
		this.x=x;//clarify that I am talking about a field, when there's also method's parameter with the same name as a field
	}
	public void setValueY(int y){//this method sets the value of y coordinate
		this.y=y;//clarify that I am talking about a field, when there's also method's parameter with the same name as a field
	}
	
	public int getX(){//this method returns the value of x coordinate
		return x;
	}

	public int getY(){//this method returns the value of x coordinate
		return y;
	}
}
