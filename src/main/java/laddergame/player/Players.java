package laddergame.player;

import laddergame.ladder.Ladder;
import laddergame.vo.Name;
import laddergame.vo.Position;

import java.util.*;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toUnmodifiableList;

public class Players {
    private static final int PLAYERS_SIZE_LOWER_BOUND_INCLUSIVE = 2;

    private final List<Player> players;

    private Players(List<Player> players) {
        validate(players);
        this.players = new ArrayList<>(players);
    }

    public static Players from(List<String> names) {
        List<Player> players = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            Name name = new Name(names.get(i));
            Position position = new Position(i);
            Player nextPlayer = new Player(name, position);

            players.add(nextPlayer);
        }
        return new Players(players);
    }

    private void validate(List<Player> players) {
        validateCountInRange(players);
        validateNoDuplicate(players);
    }

    private void validateCountInRange(List<Player> players) {
        if (players.size() < PLAYERS_SIZE_LOWER_BOUND_INCLUSIVE) {
            throw new IllegalArgumentException("플레이어는 2명 이상이어야 합니다.");
        }
    }

    private void validateNoDuplicate(List<Player> players) {
        Set<Player> distinctPlayers = new HashSet<>(players);
        if (distinctPlayers.size() != players.size()) {
            throw new IllegalArgumentException("이름에 중복이 존재합니다");
        }
    }

    public Map<Player, Position> climbDownLadder(Ladder ladder) {
        return players.stream()
                      .collect(toMap(identity(), player -> player.climbDownLadder(ladder)));
    }

    public int getCount() {
        return players.size();
    }

    public Player get(int index) {
        return players.get(index);
    }

    public List<String> getNames() {
        return players.stream()
                      .map(Player::getName)
                      .collect(toUnmodifiableList());
    }
}
