/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.raitins.controllers;

import java.util.Arrays;
import java.util.List;
import org.raitins.entities.Raiting;
import org.raitins.entities.UserRaiting;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Toshiba
 */

@RestController
@RequestMapping("/raitingsdata")
public class RaitingsController {
    
    @RequestMapping("/{movieId}")
    public Raiting getRaiting(@PathVariable("movieId") String movieId){
        return new Raiting(movieId, 4);
    }
    
     @RequestMapping("user/{userId}")
    public UserRaiting getUserRaiting(@PathVariable("userId") String userId){
        List<Raiting> raitings = Arrays.asList(
                new Raiting("123", 1),
                new Raiting("456", 2),
                new Raiting("789", 3)
                );
        //return raitings;
        UserRaiting userRaiting= new UserRaiting();
        userRaiting.setUserRaiting(raitings);
        return userRaiting;
        
    }
    
}
