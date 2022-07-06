package com.triquetrx.phoneGallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triquetrx.phoneGallery.bean.ContactDetails;

@Repository
public interface CustomerRepository extends JpaRepository<ContactDetails, Integer> {

}
