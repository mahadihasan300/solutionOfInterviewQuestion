package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.UserInformation;

@Repository
public interface UserInformationDao extends JpaRepository<UserInformation, Long>{

}
