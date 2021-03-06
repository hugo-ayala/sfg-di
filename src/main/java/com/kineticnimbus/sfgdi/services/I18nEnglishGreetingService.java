package com.kineticnimbus.sfgdi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by Hugo on 03/21/2021
 */
@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Hello World - EN";
    }
}
