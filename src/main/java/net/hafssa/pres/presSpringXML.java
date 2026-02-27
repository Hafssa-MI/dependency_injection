package net.hafssa.pres;

import net.hafssa.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class presSpringXML {
    public static void main(String[] args) {
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        //IMetier metier = (IMetier) springContext.getBean("metier");
        IMetier metier =springContext.getBean(IMetier.class);
        System.out.println("RES= "+metier.calcul());
    }
}
