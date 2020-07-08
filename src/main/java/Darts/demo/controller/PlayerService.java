package Darts.demo.controller;

import Darts.demo.domein.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PlayerService {

    @Autowired
    PlayerRespository pr;

    public void addNewPlayer(String playerName){
        Player player = new Player();
        player.setPlayerName(playerName);
        pr.save(player);
    }

    public Iterable<Player> getAllPlayers(){
        return pr.findAll();
    }

    public String getPlayerName(){
        return pr.findById((long)1).get().getPlayerName();
    }
}
