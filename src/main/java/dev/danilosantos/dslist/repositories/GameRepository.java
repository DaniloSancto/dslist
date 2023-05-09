package dev.danilosantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.danilosantos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long> {}
