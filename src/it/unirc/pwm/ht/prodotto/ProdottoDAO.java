package it.unirc.pwm.ht.prodotto;

import java.util.List;



public interface ProdottoDAO {
	public Prodotto getProdotto(Prodotto c);
	public boolean inserisciProdotto(Prodotto c);
	public boolean aggiornaProdotto(Prodotto c);
	public boolean eliminaProdotto(Prodotto c);
	public List<Prodotto> getProdottiDonna();
	public List<Prodotto> getProdottiUomo();
	public List<Prodotto> getProdottiBambino();
	public List<Prodotto> getProdotti();
	public List<Prodotto> getProdottiRandom();
	public List<Prodotto> getProdottoByNome(String tipoCliente,String nome);
	public Prodotto getLastProdotto();
	public List<Prodotto> getProdottiAll();
	public Prodotto getProdottoByNomeTaglia(Prodotto c);
	
	//METODI DI PROVA
	public List<Prodotto> getProdottiRandomDonna();
	public List<Prodotto> getProdottiRandomUomo();
	public List<Prodotto> getProdottiRandomBambino();
	public List<Prodotto> getPrezzoDec();
	public List<Prodotto> getPrezzoCres();

}
