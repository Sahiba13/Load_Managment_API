package com.springrest.springrest.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.Entities.Load;

@Repository
public interface LoadRepository extends JpaRepository<Load, UUID>{
	List<Load> findByShipperId(UUID shipperId);
}
