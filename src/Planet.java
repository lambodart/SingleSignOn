
public class Planet {

	private Boolean inhabt;
	private String 	name;
	
	public Planet(String name, Boolean inhabt) {
		this.name 	= name;
		this.inhabt = inhabt;	
	}
	
	public Boolean getInhab() {
		return inhabt;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String Name) {
		this.name = Name;
	}
	
	public void setIn(Boolean Name) {
		this.inhabt = Name;
	}
}
