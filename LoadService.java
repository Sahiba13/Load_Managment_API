package com.springrest.springrest.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Entities.Load;
import com.springrest.springrest.repository.LoadRepository;

@Service
public class LoadService {
	  
	    @Autowired
	    private LoadRepository loadRepository;

	    public Load addLoad(Load load) {
	    	load.setLoadId(UUID.randomUUID());
	        return loadRepository.save(load);
	    }

	    public List<Load> getLoadsByShipperId(UUID shipperId) {
	        return loadRepository.findByShipperId(shipperId);
	    }

	    public Optional<List<Load>> getLoadById(UUID loadId) {
	        return Optional.ofNullable(loadRepository.findAll());
	    }

	    public Load updateLoad(Load load) {
	        return loadRepository.save(load);
	    }

	    public void deleteLoad(UUID loadId) {
	        loadRepository.deleteById(loadId);
	        
	    }

		public List<Load> getAllLoads() {
			// TODO Auto-generated method stub
			return null;
		}
}
