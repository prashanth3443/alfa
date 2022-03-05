package com.example.Gen.repository;

import com.example.Gen.module.Gf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GirlRepository extends JpaRepository<Gf,Integer>
{

}
