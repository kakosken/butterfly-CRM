package CRM;

/* Terhi Järvenpää */

import java.awt.List;
import java.util.ArrayList;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean

public class CompanyController {
	
	
	@EJB
	private CRMejb crmEjb;

	@ManagedProperty(value = "#{company}")
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String saveCompany() {
		
		String viesti = "Uuden yrityksen lisääminen onnistui "+ company;
		
		FacesContext facesContext = FacesContext.getCurrentInstance();
		//CRMejb.addAccount(account);
		crmEjb.saveCompany(company);
		
		FacesMessage facesMessage = new FacesMessage(viesti);
		facesContext.addMessage(null, facesMessage);

		return "index";
		//return ("Company saved");
	}
	
	


	public  ArrayList<Company> listCompanies() {
		return (ArrayList<Company>) crmEjb.getCompanies();
	}
	

	public String initialize() {
		return null;
	}
}
