package com.firstLearning.journalPrototype.service;

import com.firstLearning.journalPrototype.repository.journelEntryRepository;
import com.firstLearning.journalPrototype.entity.journelEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class journelEntryService {

    @Autowired
    private journelEntryRepository journelEntryRepository;

    public void saveEntry(journelEntry journelEntry){
        journelEntryRepository.save(journelEntry);
    }
}
