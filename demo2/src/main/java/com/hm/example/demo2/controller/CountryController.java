/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.example.demo2.controller;

import com.hm.example.demo2.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hm.example.demo2.model.repository.CountryRepository;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author humartinez
 */
@RestController
public class CountryController {

    @Autowired
    private CountryRepository countryRepository;

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @RequestMapping("/getAll")
    public List<Country> getAll() {
        return (List<Country>) countryRepository.findAll();
    }

    @RequestMapping("/findById/{id}")
    public Country getById(@PathVariable Long id) {
        return countryRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/add")
    public void add(@RequestBody Country country) {
        countryRepository.save(country);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, path = "/delete/{id}")
    public void update(@PathVariable Long id) {
        
        if (countryRepository.exists(id)) {
            countryRepository.delete(id);
        } else {
            System.out.println("El Id no existe"); 
        }
            
        
    }

}
