package com.firstLearning.journalPrototype.repository;

import com.firstLearning.journalPrototype.entity.journelEntry;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface journelEntryRepository extends MongoRepository<journelEntry, String> {

}
