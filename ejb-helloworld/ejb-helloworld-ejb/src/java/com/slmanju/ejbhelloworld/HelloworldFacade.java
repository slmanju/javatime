/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.slmanju.ejbhelloworld;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author manjula
 */
@Stateless
@LocalBean
public class HelloworldFacade {

    public String hello() {
        return "Hellow World";
    }

}
