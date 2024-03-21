package com.qa.estates.repo;


import com.qa.estates.domain.BuyerDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuyerRepo extends JpaRepository<BuyerDomain, Integer> {
}
