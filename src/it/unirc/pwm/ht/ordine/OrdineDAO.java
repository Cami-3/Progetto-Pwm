package it.unirc.pwm.ht.ordine;

import java.util.List;

import it.unirc.pwm.ht.cliente.Cliente;

public interface OrdineDAO {
	public Ordine getOrdine(Ordine c);
	public boolean inserisciOrdine(Ordine c);
	public boolean aggiornaOrdine(Ordine c);
	public boolean eliminaOrdine(Ordine c);
	public Ordine getLastOrdine();
	public List<Ordine> getOrdiniByCliente(Cliente c);
	public List<Ordine> getAllOrdini();
}
