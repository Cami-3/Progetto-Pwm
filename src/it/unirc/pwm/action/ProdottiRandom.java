package it.unirc.pwm.action;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.*;



public class ProdottiRandom extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private List<Prodotto> prodottiRandomBambino;
	private List<Prodotto> prodottiRandomUomo;
	private List<Prodotto> prodottiRandomDonna;
	private static Logger logger = LogManager.getLogger("RandomBambino: ");

	
	

	public List<Prodotto> getProdottiRandomUomo() {
		return prodottiRandomUomo;
	}




	public void setProdottiRandomUomo(List<Prodotto> prodottiRandomUomo) {
		this.prodottiRandomUomo = prodottiRandomUomo;
	}




	public List<Prodotto> getProdottiRandomDonna() {
		return prodottiRandomDonna;
	}




	public void setProdottiRandomDonna(List<Prodotto> prodottiRandomDonna) {
		this.prodottiRandomDonna = prodottiRandomDonna;
	}




	public List<Prodotto> getProdottiRandomBambino() {
		return prodottiRandomBambino;
	}




	public void setProdottiRandomBambino(List<Prodotto> prodottiRandomBambino) {
		this.prodottiRandomBambino = prodottiRandomBambino;
	}




	@Override
	
	public String execute() throws Exception {
		logger.info("Sono nell'execute");
		ProdottoDAO pb = ProdottoDAOFactory.getDAO();
		logger.info("DAO prelevato");

		prodottiRandomBambino=pb.getProdottiRandomBambino();
		prodottiRandomUomo=pb.getProdottiRandomUomo();
		prodottiRandomDonna=pb.getProdottiRandomDonna();
		
		logger.info("Ho prelevato l'array" + pb);
		return SUCCESS;
	}


}
