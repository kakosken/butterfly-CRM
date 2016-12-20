package CRM;

import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

/*
 * Piia Loukeinen, team 3
 */

@ManagedBean
public class AccountController {
	

	
	@EJB
	private CRMejb crmEjb;

	@ManagedProperty(value = "#{account}")
	private Account account;

	public AccountController() {
		// testidatan alustus?

	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
	public String saveNewCustomer(){
		//uuden asiakkaan lisääminen
		return null;
	}
	
	public void addUser(){
		//uuden käyttäjän lisääminen
	}
	
	public void deleteUser(){
		//poista käyttäjä
	}
	
	public String deleteCustomer(){
		//asiakkaan poistaminen
		return null;
	}
	
	public List<Order> searchOrder(){
		//Tuotteen etsiminen eri parametreilla (asiakas, asiakasyritys,
		// toimitusajankohta, toimituspaikka)
		return null;
	}
	
	public List<OrderObject> searchOrderObject(){
		return null;
		//Haluan hakea toimitusobjekteja kriteerinä (asiakas, asiakasyritys, 
		//toimitusajankohta, toimitusosoite, objektin tila, objektin nimeke)
	}
	
	public String saveNewCompany(){
		//uuden yrityksen lisääminen
		return null;
	}
	
	public String joinCustomerToCompany(){
		//asiakas liitetään yritykseen?
		return null;
	}
	
	public String saveOrder(){
		//uuden tilauksen/toimituksen tallentaminen
		return null;
	}
	
	public String setCustomerState(){
		//asiakkaan tilan asettaminen
		return null;
	}
	
	
	
}
