import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import Calculatrice;

public class CalculatriceTest {

    @Test
    public void testAddition() {
        // Arrange
        Calculatrice calculatrice = new Calculatrice();
        // Act
        int resultat = calculatrice.addition(4, 6);
        // Assert
        assertEquals(10, resultat);
    }
}