package com.firstLearning.journalPrototype.controller;

import com.firstLearning.journalPrototype.entity.journelEntry;
import com.firstLearning.journalPrototype.service.journelEntryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journel")
public class journelEntityController_V2 {

    @Autowired
    private journelEntryService journelEntryService;

    @GetMapping
    public List<journelEntry> getAll(){
        return null;
    }

    @PostMapping
    public String viewdata(@RequestBody journelEntry myEntry){
        journelEntryService.saveEntry(myEntry);
        return null;
    }

    @GetMapping("/id/{myId}")
    public journelEntry getSpecificId(@PathVariable Long myId) {
        return null;
    }

    @DeleteMapping("/id/{myId}")
    public journelEntry deleteSpecificId(@PathVariable Long myId) {
        return null;
    }

    @PutMapping("id/{myId}")
    public journelEntry deleteSpecificId(@PathVariable Long myId, @RequestBody journelEntry myEntry) {
        return null;
    }

}
