package com.zishan.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * @author Zishan Mohsin, Java Developer at Aspiring Wings Technologies
 * @created 8 Aug 2015
 * @modified 8 Aug 2015
 * @summary Document of blood_group_collection.
 */

@Document(collection = "blood_group_collection")
public class BloodGroup {

	@Id
	private String _id;
	@Indexed(unique=true)
	@Field("blood_group_type")
	private String bloodGroupType;

	public BloodGroup(String bloodGroupType) {
		super();
		this.bloodGroupType = bloodGroupType;
	}

	public String get_id() {
		return _id;
	}

	public String getBloodGroupType() {
		return bloodGroupType;
	}

	public void setBloodGroupType(String bloodGroupType) {
		this.bloodGroupType = bloodGroupType;
	}

}
