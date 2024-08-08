package com.springrest.springrest.controller;


import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Entities.Load;
import com.springrest.springrest.service.LoadService;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/loads")
public class LoadController {
     
	@Autowired
	private LoadService loadService;
   
	@PostMapping
    public ResponseEntity<String> addLoad(@Valid @RequestBody Load load) {
        loadService.addLoad(load);
        return ResponseEntity.status(HttpStatus.CREATED).body("Loads details added successfully");
    }

    @GetMapping
    public ResponseEntity<List<Load>> getLoadsByShipperId(@RequestParam UUID shipperId) {
    	List<Load> loads = loadService.getLoadsByShipperId(shipperId);
        if (loads.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(loads);
        }
        return ResponseEntity.ok(loads);
    }

    @GetMapping("/{loadId}")
    public ResponseEntity<List<Load>> getLoadById(@PathVariable UUID loadId) {
    	return loadService.getLoadById(loadId)
                .map(load -> ResponseEntity.ok(load))
                .orElseGet(() -> ResponseEntity.status(HttpStatus.NOT_FOUND).body(null));
    
    }

    @PutMapping("/{loadId}")
    public ResponseEntity<String> updateLoad(@PathVariable UUID loadId, @Valid @RequestBody Load load){
    	 if (!loadService.getLoadById(loadId).isPresent()) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Load not found");
         }
         load.setLoadId(loadId);
         loadService.updateLoad(load);
         return ResponseEntity.ok("Load details updated successfully");
    }

    @DeleteMapping("/{loadId}")
    public ResponseEntity<String> deleteLoad(@PathVariable UUID loadId) {
    	 if (!loadService.getLoadById(loadId).isPresent()) {
             return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Load not found");
         }
         loadService.deleteLoad(loadId);
         return ResponseEntity.ok("Load details deleted successfully");
     }
   

}
