package CRM;


import java.io.Serializable;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


@ManagedBean
@RequestScoped
@Entity
@NamedQuery(name = "searchAllCustomers", query = "SELECT c from Customer c") 
public class Customer implements Serializable {

	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	 private long id;
	
	private Company company;
	
	private String name;
	private String phone;
	private String address;
	private String email;
	private String country;
	private String salesperson; //vastuumyyjä
	private enum status {
		CONTACT, CUSTOMER, ONGOING, LEAD, OLD_CUSTOMER, RETIRED
	}
	
	public Customer(){
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + ", email=" + email + "]";
	}
	
	
}
