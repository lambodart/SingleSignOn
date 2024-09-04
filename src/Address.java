
public class Address {

	@Override
	public String toString() {
		return "Address [city=" + city + ", zipcode=" + zipcode + "]";
	}

	String city;
	int zipcode;

	public Address() {
	}

	public Address(String city, int zipcode) {
		super();
		this.city = city;
		this.zipcode = zipcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}

	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}

}
