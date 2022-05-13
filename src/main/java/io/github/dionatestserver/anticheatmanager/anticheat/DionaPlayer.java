package io.github.dionatestserver.anticheatmanager.anticheat;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.entity.Player;

import java.util.HashSet;
import java.util.Set;

@Getter
public class DionaPlayer {

    private Player player;

    @Setter
    private Set<Anticheat> enabledAnticheats;

    public DionaPlayer(Player player) {
        this.player = player;
        this.enabledAnticheats = new HashSet<>();
    }
}
