package net.hafssa.metier;

import net.hafssa.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier{
    @Autowired @Qualifier("d2")
    private IDao dao;
    @Override
    public double calcul() {
        double t =dao.getData();
        double res = t*12*Math.PI/2 * Math.cos(t);
        return res;
    }
    /**
     *Injection par constructeur avec paramètres au moment de l'instantiation
     */
    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    /**
     *Injection dans l'attribut dao un objet de type IDao
     * avec un setter dont on aurra besoin d'un constructeur sans paramètres
     */
    public MetierImpl() {

    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
    /** Si on supprimer le @Autowired en haut donc on utilisera le constructeur.
     * Mais si on a deux bean on doit dans le constructeur ajouter la notation
     * @Qualifier et on ajoute dans le fichier config.xml un constructor argument :
     * <constructor-arg ref="d"></constructor-arg>
     * */
}
