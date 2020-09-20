package com.solucaomobile.dspesquisa.services;

import java.time.Instant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.solucaomobile.dspesquisa.dto.RecordDTO;
import com.solucaomobile.dspesquisa.dto.RecordInsertDTO;
import com.solucaomobile.dspesquisa.entities.Game;
import com.solucaomobile.dspesquisa.entities.Record;
import com.solucaomobile.dspesquisa.repositories.GameRepository;
import com.solucaomobile.dspesquisa.repositories.RecordRepository;

@Service
public class RecordService {
	
	@Autowired
	private RecordRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional
	public RecordDTO insert (RecordInsertDTO dto ) {
		
		Record entity = new Record();
		
		entity.setName(dto.getName());
		entity.setAge(dto.getAge());
		entity.setMoment(Instant.now());
		
		
		Game game = gameRepository.getOne(dto.getGameId());
		entity.setGame(game);
		
		entity = repository.save(entity);
		return new RecordDTO(entity); 
		
	}
}
