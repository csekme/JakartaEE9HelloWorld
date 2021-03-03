/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.csekme.JakartaEE9HelloWorld.faces;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

/**
 * Hello World bean
 * @author csekme
 */
@Named(value = "home")
@RequestScoped
public class HelloWorld {
    
    String message;

    @PostConstruct
    public void init() {
        message = "Hello JakartaEE 9";
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
