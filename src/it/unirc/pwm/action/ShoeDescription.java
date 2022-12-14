package it.unirc.pwm.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import it.unirc.pwm.ht.prodotto.Prodotto;
import it.unirc.pwm.ht.prodotto.ProdottoDAO;
import it.unirc.pwm.ht.prodotto.ProdottoDAOFactory;

public class ShoeDescription extends ActionSupport implements Action {

	private static final long serialVersionUID = 1L;
	private int id;
	private Prodotto prodotto;
	private List<Prodotto> prodottostessonome;
	private List<Integer> taglie;
	private int tagliaMin;
	
	

	public int getTagliaMin() {
		return tagliaMin;
	}
	public void setTagliaMin(int tagliaMin) {
		this.tagliaMin = tagliaMin;
	}
	public Prodotto getProdotto() {
		return prodotto;
	}
	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}


	public List<Prodotto> getProdottostessonome() {
		return prodottostessonome;
	}
	public void setProdottostessonome(List<Prodotto> prodottostessonome) {
		this.prodottostessonome = prodottostessonome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public List<Integer> getTaglie() {
		return taglie;
	}
	public void setTaglie(List<Integer> taglie) {
		this.taglie = taglie;
	}
	@Override
	public String execute() throws Exception {

		ProdottoDAO pDao = ProdottoDAOFactory.getDAO();

		Prodotto p = new Prodotto();
		p.setIdprodotto(id);
		System.out.println("id : " + id);
		prodotto = pDao.getProdotto(p);

		prodottostessonome = pDao.getProdottoByNome(prodotto.getTipoCliente(), prodotto.getNome());
	
        

		List<Integer> taglie_ausiliario = new ArrayList<Integer>();
		for(Prodotto p1 :prodottostessonome) {

			System.out.println("Nome: "+p1.getNome() +" - Taglia: " + p1.getTaglia());
			if(p1.getQuantita()>=1) {
			taglie_ausiliario.add(p1.getTaglia());
			}

		}
		
		taglie = taglie_ausiliario;
		tagliaMin= Collections.min(taglie);

		return SUCCESS;
	}







}
