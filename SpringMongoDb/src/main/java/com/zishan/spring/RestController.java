package com.zishan.spring;

import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.zishan.mongo.document.BloodGroup;
import com.zishan.mongo.repository.BloodGroupRepository;

/**
 * @author Zishan Mohsin, Java Developer at Aspiring Wings Technologies
 * @created 8 Aug 2015
 * @modified 8 Aug 2015
 * @summary Controller of rest service
 */

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/mongo")
public class RestController {

	@Autowired
	BloodGroupRepository bloodGroupRepository;

	/**
	 * @summary Get blood group from mongo db.
	 * @return All blood group found in mongo db.
	 */
	@RequestMapping(value = "/getAllBloodGroup", method = RequestMethod.GET, produces = "application/json")
	public List<BloodGroup> getBloodGroup() {
		
		return bloodGroupRepository.findAll();
		
	}

	/**
	 * @summary Insert blood group name in mongo db.
	 * @param bloodGroup
	 * @return Data inserted in mongo db.
	 */
	@RequestMapping(value = "/insertBloodGroup", method = RequestMethod.POST, produces = "application/json")
	public BloodGroup insertBloodGroup(
			@RequestParam(value = "bloodGroup", required = true) String bloodGroupName) {
		
		bloodGroupName = bloodGroupName.toUpperCase();
		BloodGroup bloodGroup = new BloodGroup(bloodGroupName);
		return bloodGroupRepository.insert(bloodGroup);
		
	}

	/**
	 * @summary Delete blood group name from mongo db.
	 * @param bloodGroup
	 * @return Blood group deletion status.
	 */
	@RequestMapping(value = "/deleteBloodGroup", method = RequestMethod.DELETE, produces = "application/json")
	public JSONObject deleteBloodGroup(
			@RequestParam(value = "bloodGroup", required = true) String bloodGroupName) {
		
		JSONObject jsonResponse=new JSONObject();
		
		BloodGroup bloodGroup = bloodGroupRepository
				.findByBloodGroupTypeIgnoreCase(bloodGroupName);
		
		//Checking null
		if (bloodGroup != null) {
			bloodGroupRepository.delete(bloodGroup);
			jsonResponse.put("response", "success");
		} else {
			jsonResponse.put("response", "failure");
		}
		
		return jsonResponse;
		
	}

}
