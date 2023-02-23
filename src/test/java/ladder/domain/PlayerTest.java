package ladder.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class PlayerTest {
    @ParameterizedTest(name = "이름이 길이가 안맞아 {0}이면 예외 던지기")
    @ValueSource(strings = {"aaaaaa", "", "1234567"})
    public void 생성_fail_길이(String name) {
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("플레이어 이름 길이는 1이상 5이하여야합니다.");
    }

    @ParameterizedTest(name = "이름이 공백이 들어가 {0}이면 예외 던지기")
    @ValueSource(strings = {"abc ", "  ", "a b", " abc"})
    public void 생성_fail_공백(String name) {
        assertThatThrownBy(() -> new Player(name))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("플레이어 이름에는 공백이 포함될 수 없습니다.");
    }

    @ParameterizedTest(name = "이름이 {0}이면 정상 생성")
    @ValueSource(strings = {"abc", "에밀과홍고", "에"})
    public void 생성_success(String name) {
        assertThatNoException().isThrownBy(() -> new Player(name));
    }

    @ParameterizedTest
    @CsvSource({"0,2", "1,0", "2,1", "3,3", "4,4"})
    void should_사다리를이동_when_사다리를받았을때(int initialPosition, int destination) {
        // given
        Ladder ladder = new Ladder(LadderTest.generateRowList());
        Name name = new Name("abc");
        Position position = new Position(initialPosition);
        Player player = new Player(name, position);
        Position expected = new Position(destination);

        // when
        Position result = player.climbDownLadder(ladder);

        //then
        assertThat(result).isEqualTo(expected);
    }
}
