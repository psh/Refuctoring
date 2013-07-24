package com.refuctor.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetterGetter {

    private final ApplicationContext applicationContext;

    public GetterGetter() {
        applicationContext = new ClassPathXmlApplicationContext("/com/refuctor/example/application-context.xml");
    }

    public Getter createGetter(int i) {
        switch (i) {
            case 1:
                return applicationContext.getBean("HGetter", HGetter.class);
            case 2:
                return applicationContext.getBean("CGetter", CGetter.class);
            case 3:
                return applicationContext.getBean("SGetter", SGetter.class);
            case 4:
                return applicationContext.getBean("WGetter", WGetter.class);
            case 5:
                return applicationContext.getBean("EGetter", EGetter.class);
        }
        return null;
    }
}
