package net.hafssa.metier;

import net.hafssa.dao.IDao;

public class MetierImpl implements IMetier{
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
}
