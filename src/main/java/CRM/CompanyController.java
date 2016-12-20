package CRM;

/* Terhi Järvenpää */

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

import java.util.List;
import javax.ejb.EJB;

@ManagedBean

public class CompanyController {
	
	
	//	@EJB
	//	private CompanyEjb companyEjb;

	@ManagedProperty(value = "#{company}")
	private Company company;
}
