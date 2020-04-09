package me.puredouble;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AnimalRunner implements ApplicationRunner {

    @Autowired
    private Animal animal;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(animal);
    }

}
