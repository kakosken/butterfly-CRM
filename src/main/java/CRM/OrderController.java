package CRM;

import javax.faces.bean.ManagedProperty;

public class OrderController {
	
	//	@EJB
	//	private CompanyEjb companyEjb;

	@ManagedProperty(value = "#{order}")
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public String saveOrder() {
		return ("Order saved");
	}
	
	
	
	//public  List<Order> listOrders() {
	//	return null;
	//}
	

	public String initializeOrder() {
		return null;
	}

}
