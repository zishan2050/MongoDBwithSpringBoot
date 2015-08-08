package com.zishan.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import com.zishan.mongo.document.BloodGroup;

/**
 * @author Zishan Mohsin, Java Developer at Aspiring Wings Technologies
 * @created 8 Aug 2015
 * @modified 8 Aug 2015
 * @summary Repository of BloodGroup document.
 */

@Transactional
public interface BloodGroupRepository extends MongoRepository<BloodGroup, String>{
	
	
	public BloodGroup findByBloodGroupTypeIgnoreCase(String bloodGroupType);
}
