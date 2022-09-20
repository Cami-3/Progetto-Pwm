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


public class VisualizzaOrdini  extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Visualizza ordini: ");
	List<Ordine> ordini;
	
	public List<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(List<Ordine> ordini) {
		this.ordini = ordini;
	}

	@Override
	public String execute() throws Exception {
		OrdineDAO o = OrdineDAOFactory.getDAO();
		
		ordini = o.getAllOrdini();

		logger.info("Nel DB ci sono: "+ordini.size()+" ordini");
		return SUCCESS;
	}



}
