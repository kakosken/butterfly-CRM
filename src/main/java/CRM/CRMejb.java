package CRM;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
public class CRMejb {
	
	@PersistenceContext(unitName = "jpa_CRM") // Check persistence.xml
	private EntityManager em;
	
	public CRMejb(){
		
	}
	
	public void init(){
		//Tähän testidataa tietokantaan
	}
	

	
	//Tallentaa uuden tilin tietokantaan
	public void addAccount(Account account){
		try{
			em.persist(account);
			System.out.println("Save new account "+ account);
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("Uuden käyttäjätilin tallentaminen ei onnistunut");
		}
		
	}

}
