package com.firstLearning.journalPrototype.service;

import com.firstLearning.journalPrototype.repository.journalEntryRepository;
import com.firstLearning.journalPrototype.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class journalEntryService {

    @Autowired
    private journalEntryRepository journalEntryRepository;

    public void saveEntry(JournalEntry journalEntry){
        journalEntryRepository.save(journalEntry);
    }

    public List<JournalEntry> getAll(){
        return journalEntryRepository.findAll();
    }

    public Optional<JournalEntry> findById(ObjectId id){
        return journalEntryRepository.findById(id);
    }

    public String deleteById(ObjectId myId){
        journalEntryRepository.deleteById(myId);
        return "ID Deleted Successfully!";
    }

}
