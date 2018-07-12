/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.NewHibernateUtil;
import aplicacion.datos.hibernate.dao.ClasificacionDAO;
import aplicacion.modelo.dominio.Clasificacion;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;



/**
 *
 * @author Sandra
 */
public class ClasificacionDAOImp implements ClasificacionDAO{

    @Override
    public List<Clasificacion> obtenertodos() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Clasificacion.class);
        criteria.add(Restrictions.like("claEstado", true));
        List listado = criteria.list();
        session.close();
        return listado;
    }

    @Override
    public void agregar(Clasificacion unaClasificacion) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unaClasificacion);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(Clasificacion unaClasificacion) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(unaClasificacion);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Clasificacion unaClasificacion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Clasificacion consulta(String descripcion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
