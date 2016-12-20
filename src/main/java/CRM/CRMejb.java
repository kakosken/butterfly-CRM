package CRM;

import java.util.List;

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
		Account testi = new Account();
		testi.setName("TestiNimi");
		testi.setPassword("testisalasana");
		testi.setUserName("TestiUserName");
		em.persist(testi);
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
	
	public void deleteAccount(Account account){
		//käyttäjätilin poistaminen
	}
	
	public List<Account> search(){
		
		List<Account> accounts = null; 
		accounts = em.createNamedQuery("searchAll").getResultList();
		System.out.println("*********** search all ********** => " + accounts);
		return accounts;
	}

}
