package CRM;

/* Terhi Järvenpää */

import java.awt.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean

public class CompanyController {
	
	
	//	@EJB
	//	private CompanyEjb companyEjb;

	@ManagedProperty(value = "#{company}")
	private Company company;
	
	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String saveCompany() {
		return ("Company saved");
	}
	
	//public  List<Company> listCompanies() {
	//	return null;
	//}
	

	public String initialize() {
		return null;
	}
}
