package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class adminsController {
	@Autowired
	adminsService ss;
	@PutMapping(value="/save")
	public String bas (@RequestBody adminsEntity q1) {
		return ss.bas(q1);
	}

	@PostMapping(value="/creat")
	public String bal (@RequestBody adminsEntity q2) {
		return ss.bal(q2);
	}
	@DeleteMapping(value="delet/{id}")
	public String bos(@PathVariable int id) {
		return ss.bos(id);
	}
	@GetMapping(value="/getall")
	public List<adminsEntity> getAll() {
	return ss.getAll();
	
	}
}

	
	
	


