package it.unirc.pwm.action;

import java.util.Map;
import java.util.Vector;

import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;
import it.unirc.pwm.ht.prodotto.ProdottoPerCarrello;


public class AggiungiAlCarrello extends ActionSupport implements ServletResponseAware,SessionAware{
	private static final long serialVersionUID = 1L;
	private Map <String,Object> session;
	private int id;
	private int richiesta;
	private int taglia;

	private static Logger logger = LogManager.getLogger("Aggiungi al carrello: ");

	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRichiesta() {
		return richiesta;
	}
	public void setRichiesta(int richiesta) {
		this.richiesta = richiesta;
	}
	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
	}


	public int getTaglia() {
		return taglia;
	}
	public void setTaglia(int taglia) {
		this.taglia = taglia;
	}
	@Override
	public void validate() {
		// TODO Auto-generated method stub
		

		Vector<ProdottoPerCarrello> carrello = (Vector<ProdottoPerCarrello>) session.get("carrello");
	
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		Prodotto p = pd.getProdotto(new Prodotto(id));
		p.setTaglia(taglia);
		p= pd.getProdottoByNomeTaglia(p);
		if(carrello!=null) {
			for(ProdottoPerCarrello ppc : carrello) { 
				if(ppc.getP().getIdprodotto()==p.getIdprodotto()) {
					ppc.setQuantRichiesta(ppc.getQuantRichiesta()+richiesta);
					this.addFieldError("a", "a");
					}
			}
		}
		session.put("carrello", carrello);
		
	}
	@Override
	public String execute() throws Exception {
		
		if( taglia==0){
			throw new Exception("Hai dimenticato di selezionere la taglia del prodotto");
		}
		
		Prodotto p = new Prodotto();
		p.setIdprodotto(id);
		ProdottoDAO pd = ProdottoDAOFactory.getDAO();
		p=pd.getProdotto(p);
		p.setTaglia(taglia);
		p=pd.getProdottoByNomeTaglia(p);
		logger.info("Hai chiesto di aggiungere" + p.getNome() + "in quantit�: " + richiesta);
		ProdottoPerCarrello prodottoToCarrello = new ProdottoPerCarrello(p, richiesta);
		Vector<ProdottoPerCarrello> carrello = (Vector<ProdottoPerCarrello>) session.get("carrello");
		if(carrello==null) {
		
			carrello = new Vector<ProdottoPerCarrello>();
			carrello.add(prodottoToCarrello);
			logger.info("Carrello creato e prodotto aggiunto");
		}
		else {
			
			carrello.add(prodottoToCarrello);
			logger.info("prodotto aggiunto");
		}		
		session.put("carrello", carrello);
		logger.info("adesso il carrello contiente: "+carrello);
		return SUCCESS;
	}
}
