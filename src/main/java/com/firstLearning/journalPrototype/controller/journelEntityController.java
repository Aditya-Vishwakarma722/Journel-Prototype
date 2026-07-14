package com.firstLearning.journalPrototype.controller;

import com.firstLearning.journalPrototype.entity.journelEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journel")
public class journelEntityController {

    private Map<Long, journelEntry> journelEntryMap = new HashMap<>();

    @GetMapping
    public List<journelEntry> getAll(){
        return new ArrayList<>(journelEntryMap.values());
    }

    @PostMapping
    public String viewdata(@RequestBody journelEntry myEntry){
        journelEntryMap.put(myEntry.getId(), myEntry);
        return "Data Added Successfully!";
    }

    @GetMapping("/id/{myId}")
    public journelEntry getSpecificId(@PathVariable Long myId) {
        return journelEntryMap.get(myId);
    }

    @DeleteMapping("/id/{myId}")
    public journelEntry deleteSpecificId(@PathVariable Long myId) {
        return journelEntryMap.remove(myId);
    }

    @PutMapping("id/{myId}")
    public journelEntry deleteSpecificId(@PathVariable Long myId, @RequestBody journelEntry myEntry) {
        return journelEntryMap.put(myId, myEntry);
    }

}
