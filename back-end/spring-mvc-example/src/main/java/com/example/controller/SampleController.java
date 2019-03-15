/**
 * 
 */
package com.example.controller;

import java.sql.Date;
import java.util.ArrayList;

//import org.hibernate.Session;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.example.config.HibernateUtil;
import com.example.model.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author kamalesh.murali
 * @since Mar 4, 2019
 */
@RestController
@RequestMapping(value = "/")
@CrossOrigin
public class SampleController {

    ArrayList<User> users = new ArrayList<>();

    @GetMapping
    @RequestMapping(produces = "application/json")
    public ResponseEntity<String> getUser() {

        String result = null;

        User userOne = new User();
        userOne.setId("20");
        userOne.setFirstName("kamalesh");
        userOne.setLastName("murali");
        userOne.setEmail("kamalesh.murali@object-frontier.com");
        userOne.setAddress("chennai");
//        String addressOne = new String();
//        addressOne.setFlatNo(22);
//        addressOne.setStreet("patturasappa street");
//        addressOne.setCity("chennai");
//        addressOne.setState("Tamil Nadu");
//        addressOne.setCountry("India");
//        userOne.setAddress(addressOne);
        userOne.setBirthDate(Date.valueOf("1997-05-29"));
        users.add(userOne);

        User userTwo = new User();
        userTwo.setId("20");
        userTwo.setFirstName("kamalesh");
        userTwo.setLastName("murali");
        userTwo.setEmail("kamalesh.murali@object-frontier.com");
//        String addressTwo = new String();
//        addressTwo.setFlatNo(22);
//        addressTwo.setStreet("patturasappa street");
//        addressTwo.setCity("chennai");
//        addressTwo.setState("Tamil Nadu");
//        addressTwo.setCountry("India");
//        userTwo.setAddress(addressTwo);
        userTwo.setAddress("madurai");
        userTwo.setBirthDate(Date.valueOf("1997-05-29"));
        users.add(userTwo);

//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        session.beginTransaction();
//        session.save(userOne);
//        session.getTransaction().commit();
//        HibernateUtil.getSessionFactory().close();


        ObjectMapper json = new ObjectMapper();
        try {
            result = json.writeValueAsString(users);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>(result, HttpStatus.OK);

    }

    @PostMapping
    @RequestMapping("/post")
    public ResponseEntity<String> createUser(@RequestBody User user) {

        users.add(user);
        System.out.println("hello");
        ObjectMapper json = new ObjectMapper();
        String result = null;
        try {
            result = json.writeValueAsString(users);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<String>(result, HttpStatus.OK);
    }
}
