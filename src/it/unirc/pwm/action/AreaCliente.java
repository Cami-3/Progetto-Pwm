package it.unirc.pwm.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.account.AccountDAO;
import it.unirc.pwm.ht.account.AccountDAOFactory;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteAware;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.ordine.Ordine;
import it.unirc.pwm.ht.ordine.OrdineDAO;
import it.unirc.pwm.ht.ordine.OrdineDAOFactory;
import it.unirc.pwm.ht.titolare.Titolare;
import it.unirc.pwm.ht.titolare.TitolareDAO;
import it.unirc.pwm.ht.titolare.TitolareDAOFactory;

public class AreaCliente extends ActionSupport implements SessionAware,ClienteAware {

	private static Logger logger = LogManager.getLogger("AreaCliente");
	private Map<String,Object> session; 
	private Cliente cliente;
	private Account account;
	private List<Ordine> ordiniDelCliente;
	public List<Ordine> getOrdiniDelCliente() {
		return ordiniDelCliente;
	}



	public void setOrdiniDelCliente(List<Ordine> ordiniDelCliente) {
		this.ordiniDelCliente = ordiniDelCliente;
	}



	public Account getAccount() {
		return account;
	}



	public void setAccount(Account account) {
		this.account = account;
	}



	public static Logger getLogger() {
		return logger;
	}



	public static void setLogger(Logger logger) {
		AreaCliente.logger = logger;
	}



	public Map<String, Object> getSession() {
		return session;
	}



	public void setSession(Map<String, Object> session) {
		this.session = session;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	@Override
	public String execute() throws Exception {
		cliente=(Cliente) session.get("utente");
		account=(Account) session.get("account");
		OrdineDAO cd=OrdineDAOFactory.getDAO();
		ordiniDelCliente = cd.getOrdiniByCliente(cliente);

		return SUCCESS;


	}



}
