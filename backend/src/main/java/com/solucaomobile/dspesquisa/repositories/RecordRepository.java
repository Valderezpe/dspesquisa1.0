package com.solucaomobile.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solucaomobile.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {

}
