package com.car;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class adminsService {
	@Autowired
	adminsDao ad;
	public String bas ( adminsEntity q1) {
		return ad.bas(q1);
	}public String bal (adminsEntity q2) {
		return ad.bal(q2);
	}public String bos( int id) {
		return ad.bos(id);
	}public List<adminsEntity> getAll() {
		return ad.getAll();
}
}
