/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.datos.hibernate.dao.imp;

import aplicacion.datos.hibernate.configuracion.NewHibernateUtil;
import aplicacion.datos.hibernate.dao.ButacaDAO;
import aplicacion.modelo.dominio.Butaca;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Sandra
 */
public class ButacaDAOImp implements ButacaDAO {
    
    @Override
    public List<Butaca> obtenertodos() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        Criteria criteria=session.createCriteria(Butaca.class);
        criteria.add(Restrictions.like("butEstado", true));
        List listado = criteria.list();
        session.close();
        return listado;
    }

    @Override
    public void agregar(Butaca unaButaca) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unaButaca);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void modificar(Butaca unaButaca) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(unaButaca);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public void eliminar(Butaca unaButaca) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Butaca consulta(String descripcion, String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
