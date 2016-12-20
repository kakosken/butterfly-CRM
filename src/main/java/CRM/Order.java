package CRM;

import java.io.Serializable;

import javax.persistence.*;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


@ManagedBean
@RequestScoped
//@Entity
public class Order {
//  private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private enum state{
    	NEW, DELIVERED
    }; 
    private String salesPerson;
	public Order(Long id, String salesPerson) {
		super();
		this.id = id;
		this.salesPerson = salesPerson;
	}
    
   /* public Order() {
		super();
	}*/
    
    

}
