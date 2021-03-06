package cotn.photoapp.controller;

import cotn.photoapp.exception.UserServiceException;
import cotn.photoapp.model.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;


import javax.validation.Valid;
import java.util.Date;

/**
 * @author kaustavbasu
 * @Date 6/4/20
 * @Time 10:55 PM
 */
@RestController
@RequestMapping(value = "/photoapp")
public class UserController {

    @GetMapping(value = "/userDetails", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<UserDetails> getUserDetails() {

        if (true) throw new UserServiceException("This is a user service exception");


        UserDetails userDetails = new UserDetails();
        userDetails.setUid(1);
        userDetails.setFirstname("Kaustav");
        userDetails.setLastname("Basu");
        userDetails.setDateOfBirth(new Date());

        return new ResponseEntity<UserDetails>(userDetails, HttpStatus.FOUND);
    }

    @PostMapping(value = "/createUsers")
    public ResponseEntity<UserDetails> createUsers(@Valid @RequestBody UserDetails userDetails) {


        UserDetails userDetailsResponse = new UserDetails();
        userDetailsResponse.setUid(userDetails.getUid());
        userDetailsResponse.setFirstname(userDetails.getFirstname());
        userDetailsResponse.setLastname(userDetails.getLastname());
        userDetailsResponse.setDateOfBirth(userDetails.getDateOfBirth());
        userDetailsResponse.setEmail(userDetails.getEmail());

        return new ResponseEntity<UserDetails>(userDetailsResponse, HttpStatus.OK);

    }
}
