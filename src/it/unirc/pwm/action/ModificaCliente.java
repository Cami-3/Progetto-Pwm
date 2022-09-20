package it.unirc.pwm.action;



import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;


public class ModificaCliente extends ActionSupport {

	private static final long serialVersionUID = 1L;


	private static Logger logger = LogManager.getLogger("Modifica");

	private Cliente cliente=new Cliente(); 
	private Account account=new Account(); 
	private String confermaPassword;
	private String email;
	private String password;


	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getConfermaPassword() {
		return confermaPassword;
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

	public void setConfermaPassword(String confermaPassword) {
		this.confermaPassword = confermaPassword;
	}





	@Override
	public void validate() {
		super.validate();
		if (password.isEmpty()) {
			this.addFieldError("password", "inserire la password");
		}
		else if(!password.equals(confermaPassword)) {
			this.addFieldError("password", "la password di conferma non corrisponde a quella originale");

		}
	}

	public String execute() throws Exception{
		logger.info("Sono nell'execute");
		AccountDAO ac = AccountDAOFactory.getDAO();
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		account.setEmail(email);
		account.setPassword(password);
		account.setCliente(cliente);	
		logger.info("Account: " + account.toString());
		logger.info("Cliente: " + cliente.toString());
		ac.aggiornaAccount(account);
		logger.info("ho finito");
		
		
		return SUCCESS;



	}




}