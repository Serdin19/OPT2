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
        void kortingPer12Maanden(){
            Korting klant = new Korting(48,5,5);
            assertEquals(20, klant.kortingPer12Maanden());
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

        @Test
        void maandenOpties(){
        Korting klant = new Korting(7,24,24);
        Korting klant1 = new Korting(32,50,50);
        assertEquals("Minder dan 12 maanden", klant.maandenOpties());
        assertEquals("Meer dan 12 maanden", klant1.maandenOpties());
        }

        @Test
        void reviewOpties(){
        Korting klant = new Korting(7,10,24);
        Korting klant1 = new Korting(32,100,50);
        assertEquals("Laag(<25)", klant.reviewOpties());
        assertEquals("Gemiddeld(>25)", klant1.reviewOpties());
        }

        @Test
        void gekochteProductOptiesOpties(){
        Korting klant = new Korting(2,10,10);
        Korting klant1 = new Korting(10,28,28);
        assertEquals("Laag(<25)", klant.gekochteProductOpties());
        assertEquals("Gemiddeld(>25)", klant1.gekochteProductOpties());
        }

        @Test
        void decision(){
        Korting klant = new Korting(2,10,10);
        Korting klant1 = new Korting(10,28,28);
        assertEquals("Laag(<25)", klant.gekochteProductOpties());
        assertEquals("Gemiddeld(>25)", klant1.gekochteProductOpties());
    }

}

