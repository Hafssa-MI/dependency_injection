package net.hafssa.dao;

public class DaoImpl implements IDao{
    @Override
    public double getData(){
        System.out.println("Version base de donnée");
        double t=34;
        return t;
    }
}
