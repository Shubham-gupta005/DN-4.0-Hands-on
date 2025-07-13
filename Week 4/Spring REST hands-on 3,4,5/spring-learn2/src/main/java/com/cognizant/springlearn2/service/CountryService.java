package com.cognizant.springlearn2.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn2.Country; // Updated package

@Service
public class CountryService {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryService.class);
    private static List<Country> countries;

    public CountryService() {
        LOGGER.info("START");
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        countries = (List<Country>) context.getBean("countryList");
        LOGGER.info("END");
    }

    public Country getCountry(String code) {
        LOGGER.info("START");
        for (Country country : countries) {
            if (country.getCode().equalsIgnoreCase(code)) {
                LOGGER.info("END");
                return country;
            }
        }
        LOGGER.info("END");
        return null;
    }

}