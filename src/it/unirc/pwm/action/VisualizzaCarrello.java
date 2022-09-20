package it.unirc.pwm.action;

import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;



public class VisualizzaCarrello extends ActionSupport implements ServletResponseAware,SessionAware{
	private static final long serialVersionUID = 1L;
	private Map <String,Object> session;
	private static Logger logger = LogManager.getLogger("Visualizza carrello: ");
	Vector<ProdottoPerCarrello> carrello;
	private float tot;





	public float getTot() {
		return tot;
	}


	public void setTot(float tot) {
		this.tot = tot;
	}


	public Map<String, Object> getSession() {
		return session;
	}


	public void setSession(Map<String, Object> session) {
		this.session = session;
	}


	public Vector<ProdottoPerCarrello> getCarrello() {
		return carrello;
	}


	public void setCarrello(Vector<ProdottoPerCarrello> carrello) {
		this.carrello = carrello;
	}



	@Override
	public void validate() {
		// TODO Auto-generated method stub
		super.validate();

	}


	@Override
	public String execute() throws Exception {
		if( session.get("TipologiaUtente")==null){
		
			throw new Exception("Non puoi riempire il carrello!");
		}
		String tu = (String) session.get("TipologiaUtente");
		if( !tu.equals("cli")){
			
			throw new Exception("Non puoi riempire il carrello!");
		}
		System.out.println(tu);
		if(tu!=null) {
			if(tu.equals("cli")){
				carrello = (Vector<ProdottoPerCarrello>) session.get("carrello");
					if( session.get("carrello")==null){
					throw new Exception("il carrello non è inizializzato, inserisci un prodotto per inizializzarlo");
				}


				if(carrello!=null) {
					for (ProdottoPerCarrello prodottoPerCarrello : carrello) {
						tot=(tot+(prodottoPerCarrello.getQuantRichiesta()*prodottoPerCarrello.getP().getPrezzo()));
					}
				}
				logger.info("adesso il carrello contiente: "+carrello);
				for (ProdottoPerCarrello prodottoPerCarrello : carrello) {
					System.out.println(prodottoPerCarrello.getP().getNome()+prodottoPerCarrello.getP().getTaglia());
				}
				return SUCCESS;

			}

		}
		return SUCCESS;
		}


	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub

	}



}
