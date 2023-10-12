package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.dto.BikeSpecs;


@Service
public class DataService {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public DataService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public BikeSpecs getAllData(String brand, int id) {
		String query = "select * from bikes where id = ? and brand = ?";
		try {
			return jdbcTemplate.queryForObject(query, new BeanPropertyRowMapper<BikeSpecs>(BikeSpecs.class), id, brand);
	    } catch (EmptyResultDataAccessException e) {
	    	return new BikeSpecs();
	    }
	}
}
