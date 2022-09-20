package it.unirc.pwm.ht.account;

import java.util.List;

public interface AccountDAO {
	public Account getAccount(Account c);
	public boolean inserisciAccount(Account c);
	public boolean aggiornaAccount(Account c);
	public boolean eliminaAccount(Account c);
	public Account autentica(Account c);
	public Account getLastAccount();
	public List<Account> getAccountclienti();

}
