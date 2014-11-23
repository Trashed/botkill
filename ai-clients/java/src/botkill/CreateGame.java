package botkill;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Hell
 * Date: 23.11.2014
 * Time: 3:03
 */
public class CreateGame {
    private int numberOfTeams = 2;      // Only if player wants to create a game.
    private int playersPerTeam = 1;     // Only if player wants to create a game.
    private boolean indoor = false;     // Whether map is indoors or outdoors
    private float rain = 0;             // 0 - 1, 1 is total flood. Reduces hearing. 0.2 rain is 20% off from hearing.
    private float darkness = 0.4f;      // 0 - 1, 1 is total darkness. Reduces sight. 0.2 darkness is 20% off from sight.
    private int roundTime = 300;        // Round time in seconds.
    private int rounds = 3;             // How many rounds before game ends

    public float getDarkness() {
        return darkness;
    }

    public boolean isIndoor() {
        return indoor;
    }

    public int getNumberOfTeams() {
        return numberOfTeams;
    }

    public int getPlayersPerTeam() {
        return playersPerTeam;
    }

    public float getRain() {
        return rain;
    }

    public int getRounds() {
        return rounds;
    }

    public int getRoundTime() {
        return roundTime;
    }
}
