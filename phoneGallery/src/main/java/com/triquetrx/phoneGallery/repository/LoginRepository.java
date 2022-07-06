package com.triquetrx.phoneGallery.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triquetrx.phoneGallery.bean.UserLogin;

@Repository
public interface LoginRepository extends JpaRepository<UserLogin, Integer> {

}
