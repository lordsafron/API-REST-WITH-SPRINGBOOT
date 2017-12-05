/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hm.example.demo2.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author humartinez
 */
@Entity
@Table(name = "country")
public class Country implements Serializable {
    
    @Id
    @SequenceGenerator(name = "country_id_country_seq",
                       sequenceName = "country_id_country_seq",
                       allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
                    generator = "country_id_country_seq")
    @Column(name = "id_country")
    private Long idCountry;
    @Column(name = "name_country")
    private String nameCountry;

    protected Country() {
    }

    public Country(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    public Long getIdCountry() {
        return idCountry;
    }

    public void setIdCountry(Long idCountry) {
        this.idCountry = idCountry;
    }

    public String getNameCountry() {
        return nameCountry;
    }

    public void setNameCountry(String nameCountry) {
        this.nameCountry = nameCountry;
    }

    
    
    
}
