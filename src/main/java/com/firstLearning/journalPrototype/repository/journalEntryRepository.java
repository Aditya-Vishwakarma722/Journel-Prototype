package com.firstLearning.journalPrototype.repository;

import com.firstLearning.journalPrototype.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface journalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
