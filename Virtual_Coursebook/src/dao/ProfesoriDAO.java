/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;


import beans.Profesori;
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
public class ProfesoriDAO {
    
     private SessionFactory sf;
    private List<Profesori> listaProfesori = new ArrayList<Profesori>();
    
    public ProfesoriDAO() {
        sf = MyHibernateUtils.getSessionFactory();
    }
    
    public void saveProfesor(Profesori p) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        if (p.getId() > 0) {
            s.update(p);
            int index = getProfesorIndexById(p.getId());
            if (index != -1) {
                listaProfesori.set(index, p);
            }
        } else {
            listaProfesori.add(p);
            s.save(p);
        }
        s.getTransaction().commit();
    }
    
    public void saveProfesor(String nume, String prenume, String cnp) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        Profesori p = new Profesori();
        p.setPrenume(prenume);
        p.setNume(nume);
        p.setCnp(cnp);
        s.save(p);
        s.getTransaction().commit();
    }

    
    
    public int getProfesorIndexById(int idProfesor) {
        return listaProfesori.indexOf(new Profesori(idProfesor));
    }
    
    public boolean isProfesorExists(String cnp) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        Criteria c = s.createCriteria(Profesori.class); 
        Criterion crit = Restrictions.eq("cnp", cnp);
        c.add(crit);
        Profesori p = (Profesori) c.uniqueResult(); 
        s.getTransaction().commit();
        return p != null ? true : false;
    }
    
    
    public Profesori getProfesorById(int id) {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        Criteria c = s.createCriteria(Profesori.class);
        Criterion crti = Restrictions.eq("id", id);
        c.add(crti);
        Profesori m = (Profesori) c.uniqueResult();
        s.getTransaction().commit();
        return m;
    }

    public void removeProfesor(Profesori p) {
        try {
            Session s = sf.getCurrentSession();
            s.beginTransaction();
            s.delete(p);
            s.getTransaction().commit();
            listaProfesori.remove(p);
        } catch (StaleStateException ex) {
            System.out.println("Nu avem ce sterge");
        }
    }

    
    public List<Profesori> getListaProfesori() {
        Session s = sf.getCurrentSession();
        s.beginTransaction();
        listaProfesori = sf.getCurrentSession().createCriteria(Profesori.class).list();
        s.getTransaction().commit();
        return listaProfesori;
    }
    
}
