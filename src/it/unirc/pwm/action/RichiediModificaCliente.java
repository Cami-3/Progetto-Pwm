package it.unirc.pwm.action;

import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.account.Account;
import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;

public class RichiediModificaCliente extends ActionSupport implements ServletResponseAware,SessionAware{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Richiedi modifica: ");
	private Map <String,Object> session;
	private Cliente old;
	private Account oldAcc;
	private int id;
	
	



	public Cliente getOld() {
		return old;
	}


	public void setOld(Cliente old) {
		this.old = old;
	}


	public Account getOldAcc() {
		return oldAcc;
	}


	public void setOldAcc(Account oldAcc) {
		this.oldAcc = oldAcc;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public String execute() throws Exception {
		ClienteDAO cd = ClienteDAOFactory.getDAO();
		old = cd.getCliente(new Cliente(id));
		oldAcc = old.getAccount();
		
		return SUCCESS;
	}


	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		
	}
}
