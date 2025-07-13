package com.cognizant.springlearn2.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn2.Country; // Updated package
import com.cognizant.springlearn2.service.CountryService; // Updated package

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/hello")
    public String sayHello() {
        LOGGER.info("START");
        LOGGER.info("END");
        return "Hello World!!";
    }

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START");
        Country country = countryService.getCountry("IN");
        LOGGER.info("END");
        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        LOGGER.info("END");
        return countries;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START");
        LOGGER.debug("Country code received: {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("END");
        return country;
    }
}