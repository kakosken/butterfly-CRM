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
		try{
			em.remove(account);
			System.out.println("Account deleted: "+account);
		}catch (Exception e){
			System.out.println("Käyttäjätilin poistaminen ei onnistunut");
			e.printStackTrace();
		}
	}
	
	public List<Account> search(){
		
		List<Account> accounts = null; 
		accounts = em.createNamedQuery("searchAllAccounts").getResultList();
		System.out.println("*********** search all ********** => " + accounts);
		return accounts;
	}

	//Uuden asiakkaan lisääminen
	public void addCustomer(Customer customer) {
		try{
			em.persist(customer);
			System.out.println("Uusi asiakas tallennettu: "+customer);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Uuden asiakkaan lisääminen ei onnistunut! "+customer);
		}
		
	}

}
