package it.unirc.pwm.action;

import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class ModificaProdotto extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private static Logger logger = LogManager.getLogger("Modifica Prodotti: ");
	private Prodotto p2;



	public Prodotto getP2() {
		return p2;
	}



	public void setP2(Prodotto p2) {
		this.p2 = p2;
	}



	@Override


	public String execute(){

			ProdottoDAO pd = ProdottoDAOFactory.getDAO();
			pd.aggiornaProdotto(p2);

			return SUCCESS;

	}

}
