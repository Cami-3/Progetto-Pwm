package it.unirc.pwm.action;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class OfferteDelGiorno extends ActionSupport implements Action{
	private static final long serialVersionUID = 1L;
	private List<Prodotto> offerte;

	
	private static Logger logger = LogManager.getLogger("Offerte: ");
	

	

	

	public List<Prodotto> getOfferte() {
		return offerte;
	}




	public void setOfferte(List<Prodotto> offerte) {
		this.offerte = offerte;
	}




	@Override
	public String execute() throws Exception {
		ProdottoDAO po = ProdottoDAOFactory.getDAO();
		LocalDate data = LocalDate.now();
		int giorno=data.getDayOfMonth();
		offerte = po.getProdottiRandom();
		if(giorno%2==0) {
		for(Prodotto prodottoinofferta : offerte) {
			
			
			prodottoinofferta.setPrezzo((float) (prodottoinofferta.getPrezzo()*0.7));
		}
		}else {
			for(Prodotto prodottoinofferta : offerte) {
				
				
				prodottoinofferta.setPrezzo((float) (prodottoinofferta.getPrezzo()*0.8));
			}
		}
		
		logger.info("Offerte:"+offerte);
		
		
		
		return SUCCESS;
	}
	
	
	

}
