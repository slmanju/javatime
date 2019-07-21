/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.slmanju.ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author manjula
 */
@Stateful
@LocalBean
public class NewSessionBean {

    private final List<String> artists;
    
    public NewSessionBean() {
        this.artists = new ArrayList<>();
    }
    
    public void addArtist(String name) {
        artists.add(name);
    }
    
    public List<String> getArtists() {
        return this.artists;
    }
    
}
