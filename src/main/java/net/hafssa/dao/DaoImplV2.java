package net.hafssa.dao;

import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao{
    @Override
    public double getData(){
        System.out.println("Version Capteurs ..");
        double t =12;
        return t;
    }
}
