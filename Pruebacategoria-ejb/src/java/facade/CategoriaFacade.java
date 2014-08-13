/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package facade;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import modelo.Categoria;

/**
 *
 * @author juanma
 */
@Stateless
public class CategoriaFacade extends AbstractFacade<Categoria> {
   // @PersistenceContext(unitName = "jdbc/pruebaCategoria")
    @PersistenceContext(unitName = "Pruebacategoria-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoriaFacade() {
        super(Categoria.class);
    }
    
    public List<Categoria> findRaiz() {
       // javax.persistence.criteria.CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Categoria> cq = cb.createQuery(Categoria.class);
//        Root<Categoria> categoria = cq.from(Categoria.class);
//        cq.where(pet.get(Pet_.color).isNull());
//        cq.where(categoria.get(""));
//        cq.select(cq.from(Categoria.class))
//         //cq.where(pet.get(Pet_.color).isNull());       
//         cq.where(Categoria.)       ;
//        return getEntityManager().createQuery(cq).getResultList();
//    }
        // @NamedQuery(name = "Grous.findByTestId", query = "SELECT a FROM Groups a WHERE a.TestId = :TestId")}
        //@NamedQuery(name = "Categoria.findHijos", query = "SELECT c FROM Categoria c WHERE c.idPadre= :idpadre"),
        //return em.createNamedQuery("Categoria.findHijos", Categoria.class).setParameter("idPadre", "NULL").getResultList();
        return null;
    }
}
