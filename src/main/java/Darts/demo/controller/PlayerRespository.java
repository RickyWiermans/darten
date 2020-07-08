package Darts.demo.controller;

import Darts.demo.domein.Player;
import org.springframework.data.repository.CrudRepository;

public interface PlayerRespository extends CrudRepository<Player, Long> {
}
