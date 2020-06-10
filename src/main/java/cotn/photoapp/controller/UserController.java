package cotn.photoapp.controller;

import cotn.photoapp.model.UserDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

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
    public ResponseEntity<UserDetails>  getUserDetails()
    {
        UserDetails userDetails=new UserDetails();
        userDetails.setUid(1);
        userDetails.setFirstname("Kaustav");
        userDetails.setLastname("Basu");
        userDetails.setDateOfBirth(new Date());

        return  new ResponseEntity<UserDetails>(userDetails, HttpStatus.FOUND) ;
    }

    @PostMapping(value="/createUsers")
    public ResponseEntity<UserDetails> createUsers(@RequestBody UserDetails userDetails)
    {

        userDetails.setUid(userDetails.getUid());
        userDetails.setFirstname(userDetails.getFirstname());
        userDetails.setLastname(userDetails.getLastname());
        userDetails.setDateOfBirth(userDetails.getDateOfBirth());

        return  new ResponseEntity<UserDetails>(userDetails, HttpStatus.CREATED) ;

    }
}
