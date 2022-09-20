package it.unirc.pwm.action;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.cliente.Cliente;
import it.unirc.pwm.ht.cliente.ClienteDAO;
import it.unirc.pwm.ht.cliente.ClienteDAOFactory;
import it.unirc.pwm.ht.ordine.Ordine;
import it.unirc.pwm.ht.ordine.OrdineDAO;
import it.unirc.pwm.ht.ordine.OrdineDAOFactory;


public class VisualizzaClienti  extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Visualizza clienti: ");
	List<Cliente> clienti;
	
	

	public List<Cliente> getClienti() {
		return clienti;
	}



	public void setClienti(List<Cliente> clienti) {
		this.clienti = clienti;
	}



	@Override
	public String execute() throws Exception {
		ClienteDAO cd= ClienteDAOFactory.getDAO();
		
		clienti = cd.getClienti();

		return SUCCESS;
	}



}
