package net.hafssa.pres;

import net.hafssa.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class presSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("net.hafssa");
        IMetier metier = applicationContext.getBean(IMetier.class);
        System.out.println("RES= "+metier.calcul());
    }
}
