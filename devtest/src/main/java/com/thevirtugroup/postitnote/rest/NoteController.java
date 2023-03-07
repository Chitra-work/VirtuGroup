
package com.thevirtugroup.postitnote.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 */
@RestController
public class NoteController {

    @PostMapping("/save-data")
    public <MyDataObject> ResponseEntity<String> saveData(@RequestBody MyDataObject data) {

        return new ResponseEntity<>("Data saved successfully", HttpStatus.OK);
    }

}
