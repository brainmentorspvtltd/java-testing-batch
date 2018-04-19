// HOW TO DO THINGS
class Car implements ThingsToShow{
public void gears(){
System.out.println("5 Gears");
int POWER = 10;
fuelInjections(POWER);
}
public void horn(){
System.out.println("1 Horn");
}
public void breaks(){
System.out.println("Breaks on Leg");
}
public void suspensions(){
System.out.println(" Average suspensions");
}
public void fuelInjections(int POWER){
System.out.println("Fuel Injection at 50 Speed "+POWER);
}
}

// WHAT TO DO, AND EXPOSE THINGS
interface ThingsToShow{
public void gears();
public void horn();
public void breaks();
}

class Driver{
	void driving(){
	ThingsToShow alto = new Car();
	alto.gears();
	alto.horn();
	alto.breaks();
	//alto.suspensions(); // Wrong
	//alto.fuelInjections(); // Wrong
	}
}

class InterfaceSegeration{
public static void main(String args[]){
	Driver ram= new Driver();
	ram.driving();
}

}