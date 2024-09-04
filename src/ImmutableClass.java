import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public final class ImmutableClass {
	private final String name;
	private final List<String> hb;
	private final Date date;
	private final Address add;
	public ImmutableClass(String name, List<String> al, Date date,Address add) {
		this.name = name;
		this.hb = new ArrayList<String>();
		for (String hby : al) {
			hb.add(hby);
		}
		this.date = date;
		this.add =add;
	}
	public Date getDate() {
		Object clone = date.clone();
		return (Date) clone;
		//return date; //this is breaks the immutability
	}
	public String getName() {
		return name;
	}
	public List<String> getList() {
/*
		List<String> hb1 = new ArrayList<String>();
		for (String hby : hb) {
			hb1.add(hby);
		}
		return hb1;
*/
		return new ArrayList<String>(hb);
	}
		public Address getAddress() {
		return new Address(add.getCity(), add.getZipcode())	;		
//		return add;
	}
	@Override
	public String toString() {
		return "ImmutableClass [name=" + name + ", hb=" + hb + ", date=" + date + ", add=" + add + "]";
	}

	public static void main(String[] args) {
		Address address = new Address("NERUL",400706);
		ImmutableClass immutableClass = new ImmutableClass("raj", Arrays.asList("kohli", "sachin" ), new Date(),address);
		immutableClass.getDate().setDate(15);//this breaks immutability
		immutableClass.getList().add("dravid");
		immutableClass.getAddress().setCity("PUNE");
		System.out.println(immutableClass);
		// immutableClass.name = "cantchangethis";// The final field ImmutableClass.name
		// cannot be assigned
	}
}
