package it.unirc.pwm.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.*;



public class ActionBambino extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Prodotto> prodottiBambino;
	private static Logger logger = LogManager.getLogger("ShopBambino: ");

	
	
	public List<Prodotto> getProdottiBambino() {
		return prodottiBambino;
	}
	public void setProdottiBambino(List<Prodotto> prodottiBambino) {
		this.prodottiBambino = prodottiBambino;
	}
	@Override
	
	public String execute() throws Exception {
		logger.info("Sono nell'execute");
		ProdottoDAO pb = ProdottoDAOFactory.getDAO();
		logger.info("DAO prelevato");

		prodottiBambino=pb.getProdottiBambino();
		logger.info("Ho prelevato l'array" + pb);
		return SUCCESS;
	}


}
