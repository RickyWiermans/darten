package Darts.demo.api;

import Darts.demo.controller.PlayerService;
import Darts.demo.domein.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerEndpoint {

    @Autowired
    PlayerService ps;

    @PostMapping("/newplayer")
    public void addNewPlayer(@RequestBody String playerName){
        System.out.println("A new player is added to the database: " + playerName);
        ps.addNewPlayer(playerName);
    }

    @GetMapping("/getplayers")
    public Iterable<Player> getPlayers(){
        return ps.getAllPlayers();
    }

    @GetMapping("/getplayername")
    public String getPlayerName(){
        return ps.getPlayerName();
    }
}
