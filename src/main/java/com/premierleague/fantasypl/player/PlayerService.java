package com.premierleague.fantasypl.player;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class PlayerService {
    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {
        return playerRepository.findAll();
    }

    public List<Player> getPlayersFromTeam(String teamName) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getTeam_name().equalsIgnoreCase(teamName))
                .collect(Collectors.toList()); //Esto permite modificar la lista despues. toList no permite modificarla.
    }

    public List<Player> getPlayersByName(String searchText){
        return playerRepository.findAll().stream()
                .filter(player -> player.getPlayerName().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());

    }

    public List<Player> getPlayersByPosition(String position){
        return playerRepository.findAll().stream()
                .filter(player -> player.getPosition().toLowerCase().contains(position.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByNation(String searchText){
        return playerRepository.findAll().stream()
                .filter(player -> player.getNation().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Player> getPlayersByTeamAndPosition(String team, String position){
        return playerRepository.findAll().stream()
                .filter(player -> player.getTeam_name().toLowerCase().contains(team.toLowerCase()) && player.getPosition().toLowerCase().contains(position.toLowerCase()))
                .collect(Collectors.toList());

    }

    public Player addPlayer(Player player) {
        return playerRepository.save(player);
    }

    public Player updatePlayer(Player player){
        Optional<Player> existingPlayer = playerRepository.findByPlayerName(player.getPlayerName());
        if (existingPlayer.isPresent()) {
            Player updatedPlayer = existingPlayer.get();
            updatedPlayer.setPlayerName(player.getPlayerName());
            updatedPlayer.setNation(player.getNation());
            updatedPlayer.setPosition(player.getPosition());
            updatedPlayer.setTeam_name(player.getTeam_name());

            return playerRepository.save(updatedPlayer);
        } else {
            return null; // or throw an exception
        }

    }

    @Transactional
    public void deletePlayer(String playerName) {
        playerRepository.deleteByPlayerName(playerName);
    }
}
