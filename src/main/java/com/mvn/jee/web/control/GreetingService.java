/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvn.jee.web.control;

import javax.ejb.Stateless;

/**
 *
 * @author ATouset
 */
@Stateless
public class GreetingService {

    public String getGreetingMessage(String name) {
        return "Welcome to JEE8 " + name;
    }
    
}
