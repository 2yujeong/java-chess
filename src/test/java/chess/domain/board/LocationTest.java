package chess.domain.board;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LocationTest {

    @DisplayName("Location 캐싱 확인")
    @Test
    void create() {
        Location expectedLocation = Location.of("c", "5");
        assertThat(expectedLocation).isEqualTo(Location.of("c","5"));
    }
}