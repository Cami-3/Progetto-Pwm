package it.unirc.pwm.ht.prodotto;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import it.unirc.pwm.hibernate.util.HibernateUtil;
import it.unirc.pwm.ht.account.Account;





public class ProdottoDAOHibernateImpl implements ProdottoDAO{


	protected ProdottoDAOHibernateImpl(){
	}

	public Prodotto getProdotto(Prodotto c) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		try {			
			c= (Prodotto) session.get(Prodotto.class,c.getIdprodotto());
		} catch (HibernateException e) {

			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return c;
	}

	public boolean inserisciProdotto(Prodotto c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=false;
		try {
			transaction = session.beginTransaction();
			session.save(c);
			transaction.commit();
			result=true;
		} catch (Exception e) {

			transaction.rollback();

			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return result;
	}

	public boolean aggiornaProdotto(Prodotto c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		boolean result=true;
		try {
			transaction = session.beginTransaction();
			session.update(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			result=false;
		} finally {
			if (session!=null) 
				session.close();
		}
		return result;
	}

	public boolean eliminaProdotto(Prodotto c) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=null;
		try {
			transaction = session.beginTransaction();
			session.delete(c);
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
			return false;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return true;
	}

	public List<Prodotto> getProdottiDonna() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodottiDonna = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("from Prodotto where tipo_cliente=?1 group by nome").setParameter(1, "donna");
			prodottiDonna = (List<Prodotto>) q.list();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return prodottiDonna;
	}

	public List<Prodotto> getProdottiUomo() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodottiUomo = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("from Prodotto where tipo_cliente=?1 group by nome").setParameter(1, "uomo");
			prodottiUomo = (List<Prodotto>) q.list();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return prodottiUomo;
	}

	public List<Prodotto> getProdottoByNome(String tipoCliente,String nome) {
		System.out.println("nome " + nome);
		System.out.println("tipo " + tipoCliente);
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodottiUomo = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("from Prodotto where tipo_cliente=:tipo and nome=:nome").setParameter("tipo",tipoCliente).setParameter("nome", nome);
			prodottiUomo = (List<Prodotto>) q.list();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return prodottiUomo;
	}

	public List<Prodotto> getProdotti() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodotti = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("FROM Prodotto group by nome");
			prodotti = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}	
		return prodotti;
	}

	public List<Prodotto> getProdottiAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodotti = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("FROM Prodotto order by nome");
			prodotti = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}	
		return prodotti;
	}

	public List<Prodotto> getProdottiRandom() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodotti = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("FROM Prodotto group by nome order by rand()").setMaxResults(6);
			prodotti = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}	
		return prodotti;
	}


	public List<Prodotto> getProdottiBambino() {

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodottiBambino = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("from Prodotto where tipo_cliente=?1 group by nome").setParameter(1, "bambino");
			prodottiBambino = (List<Prodotto>) q.list();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}

		return prodottiBambino;
	}

	public Prodotto getLastProdotto() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Prodotto i = null; 
		try {
			i = (Prodotto) session.createQuery("from Prodotto order by id desc").setMaxResults(1).uniqueResult();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return i;
	}
	public Prodotto getProdottoByNomeTaglia(Prodotto c) {
		System.out.println(c.getNome()+c.getTaglia());
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		Prodotto i = null; 

		try {			
			i = (Prodotto) session.createQuery("select p from Prodotto p where p.nome=:nome and p.taglia=:taglia")
					.setParameter("nome", c.getNome())
					.setParameter("taglia", c.getTaglia())
					.setMaxResults(1).uniqueResult()
					;
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return i;
	}
	
	//METODI DI PROVA 

	public List<Prodotto> getProdottiRandomUomo() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodotti = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("FROM Prodotto p where p.tipoCliente=?1 group by nome order by rand() ").setParameter(1, "uomo").setMaxResults(3);
			prodotti = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}	
		return prodotti;
	}
	public List<Prodotto> getProdottiRandomDonna() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodotti = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("FROM Prodotto p where p.tipoCliente=?1 group by nome order by rand() ").setParameter(1, "donna").setMaxResults(3);
			prodotti = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}	
		return prodotti;
	}
	
	public List<Prodotto> getProdottiRandomBambino() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		List<Prodotto> prodotti = null;
		try {
			transaction = session.beginTransaction();
			Query<Prodotto> q = session.createQuery("FROM Prodotto p where p.tipoCliente=?1 group by nome order by rand() ").setParameter(1, "bambino").setMaxResults(3);
			prodotti = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}	
		return prodotti;
	}


	public List<Prodotto> getPrezzoDec() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Prodotto> prodDec = null; 
		try {
			prodDec = (List<Prodotto>) session.createQuery("from Prodotto order by prezzo desc").list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return prodDec;
	}
	
	public List<Prodotto> getPrezzoCres() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		List<Prodotto> prodCres = null; 
		try {
			
			Query<Prodotto> q = session.createQuery("from Prodotto order by prezzo asc");
			prodCres = (List<Prodotto>) q.list();
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			return null;

		} finally {
			if (session!=null) //spesso omesso
				session.close();
		}
		return prodCres;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
