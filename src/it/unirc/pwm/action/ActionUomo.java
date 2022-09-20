package it.unirc.pwm.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.*;



public class ActionUomo extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Prodotto> prodottiUomo;
	private static Logger logger = LogManager.getLogger("ShopUomo: ");

	
	public List<Prodotto> getProdottiUomo() {
		return prodottiUomo;
	}
	public void setProdottiUomo(List<Prodotto> prodottiUomo) {
		this.prodottiUomo = prodottiUomo;
	}
	@Override
	
	public String execute() throws Exception {
		logger.info("Sono nell'execute");
		ProdottoDAO pu = ProdottoDAOFactory.getDAO();
		logger.info("DAO prelevato");
	
		prodottiUomo=pu.getProdottiUomo();
		logger.info("Ho prelevato l'array" + pu);
		return SUCCESS;
	}


}
