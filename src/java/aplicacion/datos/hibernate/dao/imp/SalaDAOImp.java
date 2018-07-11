/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.NewHibernateUtil;
import aplicacion.datos.hibernate.dao.SalaDAO;
import aplicacion.modelo.dominio.Sala;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sandra
 */
public class SalaDAOImp implements SalaDAO{

    @Override
    public List<Sala> obtenertodos() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Sala.class);
        criteria.add(Restrictions.like("salEstado", true));
        List listado = criteria.list();
        session.close();
        return listado;
    }

    @Override
    public void agregar(Sala unaSala) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unaSala);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(Sala unaSala) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unaSala);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Sala unaSala) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Sala consulta(String descripcion, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
