package ladder.domain;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PrizesTest {
    Prizes prizes = Prizes.from(List.of(
            "0",
            "1",
            "2"
    ));

    @Test
    void should_상품을반환한다_when_위치를넣으면() {
        // given
        Position position = new Position(0);

        // when
        String prize = prizes.getPrizeName(position);


        //then
        assertThat(prize).isEqualTo("0");
    }

}