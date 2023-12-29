package com.example.Theyyam.Repository;

import com.example.Theyyam.Entity.Theyyam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheyyamRepository extends JpaRepository<Theyyam,Long> {


}
