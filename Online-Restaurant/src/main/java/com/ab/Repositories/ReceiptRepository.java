package com.ab.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ab.Entities.Receipt;

@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Integer> {

}
