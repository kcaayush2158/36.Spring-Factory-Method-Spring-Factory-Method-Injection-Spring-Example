package com.application.main;

import com.application.model.ATM;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MaIN {
    public static void main(String[] args){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ATM atm =  context.getBean("atm", ATM.class);
        atm.printBalanceInformation("D9DF6Y");
        context.close();
    }
}
