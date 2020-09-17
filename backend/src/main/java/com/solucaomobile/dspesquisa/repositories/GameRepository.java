package com.solucaomobile.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.solucaomobile.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
