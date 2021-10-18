/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package catalog;



import org.hibernate.Session;
import beans.Materii;
import java.util.List;
/**
 *
 * @author Dominic
 */
public class Catalog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Session sessionFactory=MyHibernateUtils.getSessionFactory().getCurrentSession();
        sessionFactory.beginTransaction();
        
        List<Materii> listaNote=sessionFactory.createCriteria(Materii.class).list();
        sessionFactory.getTransaction().commit();
        System.out.println(listaNote.size());
    }

}
