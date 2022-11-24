import org.ManagerMovies.MoviesManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void testFindLast() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");
        manager.addMovie("Film8");
        manager.addMovie("Film9");
        manager.addMovie("Film10");
        manager.addMovie("Film11");
        manager.addMovie("Film12");
        String[] expected = {"Film12", "Film11", "Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void testFindLastLowLimit() {
        MoviesManager manager = new MoviesManager();
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");
        manager.addMovie("Film8");
        manager.addMovie("Film9");

        String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testLimit() {
        MoviesManager manager = new MoviesManager(5);
        manager.addMovie("Film1");
        manager.addMovie("Film2");
        manager.addMovie("Film3");
        manager.addMovie("Film4");
        manager.addMovie("Film5");
        manager.addMovie("Film6");
        manager.addMovie("Film7");
        manager.addMovie("Film8");
        manager.addMovie("Film9");
        manager.addMovie("Film10");
        manager.addMovie("Film11");
        manager.addMovie("Film12");
        String[] expected = {"Film1", "Film2", "Film3", "Film4", "Film5"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }


}
