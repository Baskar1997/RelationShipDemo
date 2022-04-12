package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public class adminsDao {
	@Autowired
	adminsRepository ar;
	public String bas ( adminsEntity q1) {
		ar. save(q1);
		return "save";
	}public String bal (adminsEntity q2) {
		ar.save (q2);
		return "save";
	}public String bos( int id) {
		ar.deleteById(id);
		return "delet";

	}public List<adminsEntity> getAll() {
		return ar.findAll();
	
		
		}

}

