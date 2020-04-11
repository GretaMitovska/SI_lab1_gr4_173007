class Point {
	String id
	double x,y;

	//TODO add new variable
	String name

	//TODO constructor

	public Point(String id, double x, double y, String name) {
		this.id = id;
		this.x = x;
		this.y = y;
		this.name = name;
	}


	//TODO setters and getters


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move (char xDirection, char yDirection) {
		//TODO
		this.x = xDirection;
		this.y = yDirection;
	}

	public void draw () {
		//TODO
		System.out.println ("The point is at: " +x "; " +y ";");

	}



}

class Canvas {
	List<Point> points = new ArrayList<>();

	public void add(xDirection, yDirection) {
		points.add(xDirection, yDirection);
	}

}
