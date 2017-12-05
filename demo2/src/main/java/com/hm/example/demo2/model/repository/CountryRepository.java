/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.example.demo2.model.repository;

import com.hm.example.demo2.model.Country;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

/**
 *
 * @author humartinez
 */
public interface CountryRepository extends CrudRepository<Country, Long>{
    
    
}
