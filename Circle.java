public class Circle {
	double radius;
	
	double getRadius(){
		return radius;
	}
	
	void setRadius(double radius){
		this.radius = radius;
	}
	
	public double sumArea() {
		return this.radius * this.radius * 22/7;
	}
}