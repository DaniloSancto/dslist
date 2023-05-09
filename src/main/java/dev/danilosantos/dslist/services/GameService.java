package dev.danilosantos.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.danilosantos.dslist.dto.GameMinDTO;
import dev.danilosantos.dslist.entities.Game;
import dev.danilosantos.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository repository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = repository.findAll();		
		return result.stream().map(game -> new GameMinDTO(game)).toList();
	}
}
