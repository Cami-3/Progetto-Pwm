package it.unirc.pwm.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.*;



public class ActionDonna extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Prodotto> prodottiDonna;
	private static Logger logger = LogManager.getLogger("ShopDonna: ");

	
	public List<Prodotto> getProdottiDonna() {
		return prodottiDonna;
	}
	public void setProdottiDonna(List<Prodotto> prodottiDonna) {
		this.prodottiDonna = prodottiDonna;
	}
	@Override

	public String execute() throws Exception {
		logger.info("Sono nell'execute");
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		logger.info("DAO prelevato");
		
		prodottiDonna=pd.getProdottiDonna();
		logger.info("Ho prelevato l'array" + pd);
		return SUCCESS;
	}


}
