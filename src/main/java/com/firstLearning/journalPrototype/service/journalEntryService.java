package com.firstLearning.journalPrototype.service;

import com.firstLearning.journalPrototype.repository.journalEntryRepository;
import com.firstLearning.journalPrototype.entity.journalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class journalEntryService {

    @Autowired
    private journalEntryRepository journalEntryRepository;

    public void saveEntry(journalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<journalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public journalEntry findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }

}
