package it.unirc.pwm.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;


import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;


public class AggiungiCliente extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Aggiungi cliente: ");

	private Account account;
	private Cliente cliente;
	


	



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public String execute(){
		
		ClienteDAO cd= ClienteDAOFactory.getDAO();
		AccountDAO ad= AccountDAOFactory.getDAO();
		int idN=ad.getLastAccount().getId()+1;
		account= new Account();
		account.setId(idN);
		account.setCliente(cliente);
		cliente = new Cliente();
		cliente.setAccount(account);
		cd.inserisciCliente(cliente);
		ad.inserisciAccount(account);
		logger.info("ho finito");

		
	
		return SUCCESS;
	}



}