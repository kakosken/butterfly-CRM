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
	
	
	
	public void addAccount(){
		//uuden käyttäjätili lisääminen
	}
	
	public void deleteAccount(){
		//poista käyttäjätili
	}
	
	
	
	
} 
