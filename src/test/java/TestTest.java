import com.gamesgo.Korting;
import com.gamesgo.Pc;
import com.gamesgo.Ps4;
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
    void korting60Maanden() {
        Korting klant = new Korting(60, 46, 46);
        assertEquals(25, klant.korting60Maanden());
    }

    @Test
    void allKorting() {
        Korting klant = new Korting(60, 46, 46);
        assertEquals(48, klant.allDiscounts());
    }

        @Test
        void geefKortingControle() {
            Korting klant = new Korting(16, 0,  3);
            Korting klant1 = new Korting(10, 1, 1);
            Korting klant2 = new Korting(24,1,2);
            Korting klant3 = new Korting(30,5,5);

            assertFalse(klant.geefKortingControle());
            assertFalse(klant1.geefKortingControle());
            assertTrue(klant2.geefKortingControle());
            assertTrue(klant3.geefKortingControle());
        }

        @Test
        void reviewsGegeven(){
            Korting klant = new Korting(60,0,1);
            Korting klant1 = new Korting(40,1,1);
            Korting klant2 = new Korting(38,20,20);
            assertEquals(0, klant.reviewsGegeven());
            assertEquals(10, klant1.reviewsGegeven());
            assertEquals(10, klant2.reviewsGegeven());
        }

        @Test
        void geldPerAangeschafteProduct(){
            Korting klant = new Korting(60,100,100);
            Korting klant1= new Korting(87,200,200);
            assertEquals(50, klant.geldPerAangeschafteProduct());
            assertEquals(100, klant1.geldPerAangeschafteProduct());
        }
}

