package codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import codeclan.com.rockpaperscissors.models.Game;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 15/11/2017.
 */

public class GameTest {

    private Game game;
    private Game mockgame;

    @Before
    public void before() {
        game = new Game();
        mockgame = Mockito.spy(game);
        Mockito.when(mockgame.computerMove()).thenReturn("ROCK");
    }

    @Test
    public void getRandomComputerMove(){
        assertEquals("ROCK", mockgame.computerMove());
    }
}
