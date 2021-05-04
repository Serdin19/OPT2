import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestTest {

    @Test
    void getPs4Controller() {
        Ps4 ps4 = new Ps4("Ps4", "Controller");
        assertEquals("Controller", ps4.getPs4Controller());
    }

    @Test
    void combineSet() {
        Pc pc = new Pc("Yasuo", "Corsair IronClaw", "Gembird Slimline");
        String expected = "Corsair IronClaw & Gembird Slimline";
        String result = pc.combineSet();
        assertEquals(expected, result);
    }

    @Test
    void korting() {
        Pc pc = new Pc("PC", "Corsair", "Corsair");
        Game game = new Game("League of legends", 10, "Open world", "Action", pc);
        assertEquals(5, game.korting());
    }
}