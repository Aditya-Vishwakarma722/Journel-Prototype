package com.firstLearning.journalPrototype.controller;

import com.firstLearning.journalPrototype.entity.journalEntry;
import com.firstLearning.journalPrototype.service.journalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/journal")
public class journalEntityController_V2 {

    @Autowired
    private journalEntryService journalEntryService;

    @GetMapping
    public List<journalEntry> getAll(){
        return journalEntryService.getAll();
    }

    @PostMapping
    public String viewdata(@RequestBody journalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return "Added Successfully!";
    }

    @GetMapping("/id/{myId}")
    public journalEntry getSpecificId(@PathVariable ObjectId myId) {
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public journalEntry deleteSpecificId(@PathVariable ObjectId myId) {
        return null;
    }

    @PutMapping("id/{myId}")
    public journalEntry deleteSpecificId(@PathVariable ObjectId myId, @RequestBody journalEntry myEntry) {
        return null;
    }

}
