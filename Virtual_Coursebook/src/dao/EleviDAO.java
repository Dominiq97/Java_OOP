/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import beans.Elevi;
import catalog.MyHibernateUtils;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.StaleStateException;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Dominic
 */
public class EleviDAO {
    
    private SessionFactory sf;
    private List<Elevi> listaElevi = new ArrayList<Elevi>();
    
    public EleviDAO() {
        sf = MyHibernateUtils.getSessionFactory();
    }
    
    public void saveElev(Elevi e) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        if (e.getId() > 0) {
            s.update(e);
            int index = getElevIndexById(e.getId());
            if (index != -1) {
                listaElevi.set(index, e);
            }
        } else {
            listaElevi.add(e);
            s.save(e);
        }
        s.getTransaction().commit();
    }
    
    public void saveElev(String nume, String prenume, String adresa, String cnp) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        Elevi e = new Elevi();
        e.setPrenume(prenume);
        e.setNume(nume);
        e.setAdresa(adresa);
        e.setCnp(cnp);
        s.save(e);
        s.getTransaction().commit();
    }

    
    
    public int getElevIndexById(int idElev) {
        return listaElevi.indexOf(new Elevi(idElev));
    }
    
    public boolean isElevExists(String cnp) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        Criteria c = s.createCriteria(Elevi.class); //criteriu
        Criterion crit = Restrictions.eq("cnp", cnp);//restrictia
        c.add(crit);//criteriului ii adauga restrictia
        Elevi e = (Elevi) c.uniqueResult(); //filstram datele din baza de date conform criteriului|intoarcem un rezultat dupa filtrare
        s.getTransaction().commit();
        return e != null ? true : false;
    }
    
    
    public Elevi getEleviById(int id) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        Criteria c = s.createCriteria(Elevi.class);
        Criterion crti = Restrictions.eq("id", id);
        c.add(crti);
        Elevi m = (Elevi) c.uniqueResult();
        s.getTransaction().commit();
        return m;
    }

    public void removeElev(Elevi e) {
        try {
            Session s = sf.getCurrentSession();
            s.beginTransaction();
            s.delete(e);
            s.getTransaction().commit();
            listaElevi.remove(e);
        } catch (StaleStateException ex) {
            System.out.println("Nu avem ce sterge");
        }
    }

    
    public List<Elevi> getListaElevi() {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        listaElevi = sf.getCurrentSession().createCriteria(Elevi.class).list();
        s.getTransaction().commit();
        return listaElevi;
    }

    
}
