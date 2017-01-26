package JPA_Mongo.tp3;

import org.bson.types.ObjectId;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;

@Entity("address")
public class Address {
	@Id
	private ObjectId id;
	private String street;
	private String city;
	private String postCode;
	private String country;

	public Address() {
		
	}

	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getPostCode() {
		return postCode;
	}

	public String getCountry() {
		return country;
	}

	public void setStreet(String street) {

		this.street = street;

	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;

	}

	public void setCountry(String country) {
		this.country = country;
	}

}
