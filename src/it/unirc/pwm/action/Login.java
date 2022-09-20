package it.unirc.pwm.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteAware;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.titolare.Titolare;
import it.unirc.pwm.ht.titolare.TitolareAware;
import it.unirc.pwm.ht.titolare.TitolareDAO;
import it.unirc.pwm.ht.titolare.TitolareDAOFactory;

public class Login extends ActionSupport implements SessionAware, ModelDriven<Account> {

	private static final long serialVersionUID = 1L;

	private static Logger logger = LogManager.getLogger("Login");
	private String email;
	private String password;
	private Map<String,Object> session; 
	private Cliente cliente;
	private Titolare titolare;
	private Account account;

	public Titolare getTitolare() {
		return titolare;
	}

	public void setTitolare(Titolare titolare) {
		this.titolare = titolare;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	public Cliente getCliente() {
		return cliente;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
	}

	//ABBIAMO MODIFICATO ADDFIELDERROR
	public void validate(){


		AccountDAO ad = AccountDAOFactory.getDAO();
		account=new Account();
		account.setEmail(email);
		account.setPassword(password);
		if(ad.getAccount(account)==null) {
			this.addFieldError("email","Errore Login, email o password errate");
		}
	}
	@Override
	public String execute() throws Exception {
		System.out.println(email + " " + password);

		AccountDAO ad = AccountDAOFactory.getDAO();
		account=new Account();
		account.setEmail(email);
		account.setPassword(password);
		account= ad.getAccount(account);
		logger.info("account n� " + account.getId());
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		TitolareDAO td = TitolareDAOFactory.getDAO();
		
	
		cliente=new Cliente();
		cliente.setIdcliente(account.getId());
		titolare=new Titolare();
		titolare.setIdtitolare(account.getId());

		if(cd.getCliente(cliente)!=null) {
			cliente = cd.getCliente(cliente);
			session.put("utente", cliente);
			session.put("account", account);
			session.put("TipologiaUtente", "cli");
			return "cliente";
		}
	
		else if(td.getTitolare(titolare)!=null) {
			titolare = td.getTitolare(titolare);
			session.put("utente", titolare);
			session.put("account", account);
			session.put("TipologiaUtente", "tit");
			return "titolare";
		}
		else {

			return INPUT;
		}
	}


	@Override
	public Account getModel() {
		// TODO Auto-generated method stub
		return account;
	}
}