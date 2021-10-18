/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import beans.Materii;
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
public class MateriiDAO {

    private SessionFactory sessionFactory;
    private List<Materii> listaMaterii = new ArrayList<Materii>();

    public MateriiDAO() {
        sessionFactory = MyHibernateUtils.getSessionFactory();
    }

    public List<Materii> getListaMaterii() {
        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        listaMaterii = sessionFactory.getCurrentSession().createCriteria(Materii.class).list();
        s.getTransaction().commit();
        return listaMaterii;
    }

    public boolean isMaterieExists(String denumire) {
        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        Criteria c = s.createCriteria(Materii.class);
        Criterion crit = Restrictions.eq("denumire", denumire);
        c.add(crit);
        Materii m = (Materii) c.uniqueResult();
        s.getTransaction().commit();
        return m != null ? true : false;
    }

    public void saveMaterie(Materii m) {
        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        if (m.getId() > 0) {
            s.update(m);
            int index = getMaterieIndexById(m.getId());
            if (index != -1) {
                listaMaterii.set(index, m);
            }
        } else {
            listaMaterii.add(m);
            s.save(m);
        }
        s.getTransaction().commit();
    }

    public void saveMaterie(String denumire) {
        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        Materii m = new Materii();
        m.setDenumire(denumire);
        s.save(m);
        s.getTransaction().commit();
    }

    public Materii getMateriById(int id) {
        Session s = sessionFactory.getCurrentSession();
        s.beginTransaction();
        Criteria c = s.createCriteria(Materii.class);
        Criterion crti = Restrictions.eq("id", id);
        c.add(crti);
        Materii m = (Materii) c.uniqueResult();
        s.getTransaction().commit();
        return m;
    }

    public int getMaterieIndexById(int idMaterie) {
        return listaMaterii.indexOf(new Materii(idMaterie));
    }

    public void removeMaterie(Materii m) {
        try {
            Session s = sessionFactory.getCurrentSession();
            s.beginTransaction();
            s.delete(m);
            s.getTransaction().commit();
            listaMaterii.remove(m);
        } catch (StaleStateException ex) {
            System.out.println("Nu avem ce sterge");
        }
    }

    public void removeMaterieById(int id) {
        removeMaterie(new Materii(id));
    }

    public void removeMaterie(int index) {
        Materii m = listaMaterii.get(index);
        removeMaterie(m);
    }

}
