package com.premierleague.fantasypl.player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "player_data")
public class Player {
    @Id
    @Column(name = "player_name", unique = true)
    private String playerName;
    private String nation;
    private String position;
    private Integer age;
    private Integer matches_played;
    private Integer starts;
    private Double minutes_played;
    private Double goals;
    private Double assists;
    private Double penalties_scored;
    private Double yellow_cards;
    private Double red_cards;
    private Double expected_goals;
    private Double expected_assists;
    private String team_name;

    public Player() {
    }

    public Player(String player_name) {
        this.playerName = player_name;
    }

    public Player(String playerName, String nation, String position, Integer age, Integer matches_played, Integer starts, Double minutes_played, Double goals, Double assists, Double penalties_scored, Double yellow_cards, Double red_cards, Double expected_goals, Double expected_assists, String team_name) {
        this.playerName = playerName;
        this.nation = nation;
        this.position = position;
        this.age = age;
        this.matches_played = matches_played;
        this.starts = starts;
        this.minutes_played = minutes_played;
        this.goals = goals;
        this.assists = assists;
        this.penalties_scored = penalties_scored;
        this.yellow_cards = yellow_cards;
        this.red_cards = red_cards;
        this.expected_goals = expected_goals;
        this.expected_assists = expected_assists;
        this.team_name = team_name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getNation() {
        return nation;
    }

    public String getPosition() {
        return position;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getMatches_played() {
        return matches_played;
    }

    public Integer getStarts() {
        return starts;
    }

    public Double getMinutes_played() {
        return minutes_played;
    }

    public Double getGoals() {
        return goals;
    }

    public Double getAssists() {
        return assists;
    }

    public Double getPenalties_scored() {
        return penalties_scored;
    }

    public Double getYellow_cards() {
        return yellow_cards;
    }

    public Double getRed_cards() {
        return red_cards;
    }

    public Double getExpected_goals() {
        return expected_goals;
    }

    public Double getExpected_assists() {
        return expected_assists;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setPlayerName(String player_name) {
        this.playerName = player_name;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setMatches_played(Integer matches_played) {
        this.matches_played = matches_played;
    }

    public void setStarts(Integer starts) {
        this.starts = starts;
    }

    public void setMinutes_played(Double minutes_played) {
        this.minutes_played = minutes_played;
    }

    public void setGoals(Double goals) {
        this.goals = goals;
    }

    public void setAssists(Double assists) {
        this.assists = assists;
    }

    public void setPenalties_scored(Double penalties_scored) {
        this.penalties_scored = penalties_scored;
    }

    public void setYellow_cards(Double yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public void setRed_cards(Double red_cards) {
        this.red_cards = red_cards;
    }

    public void setExpected_goals(Double expected_goals) {
        this.expected_goals = expected_goals;
    }

    public void setExpected_assists(Double expected_assists) {
        this.expected_assists = expected_assists;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", nation='" + nation + '\'' +
                ", position='" + position + '\'' +
                ", age=" + age +
                ", matches_played=" + matches_played +
                ", starts=" + starts +
                ", minutes_played=" + minutes_played +
                ", goals=" + goals +
                ", assists=" + assists +
                ", penalties_scored=" + penalties_scored +
                ", yellow_cards=" + yellow_cards +
                ", red_cards=" + red_cards +
                ", expected_goals=" + expected_goals +
                ", expected_assists=" + expected_assists +
                ", team_name='" + team_name + '\'' +
                '}';
    }
}
