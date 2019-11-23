package com.ynov;

import org.springframework.data.repository.CrudRepository;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Repository;

@Repository
public interface ShowsRepository extends CrudRepository<Shows, String> {
    Shows findBy_id(ObjectId _id);
}
