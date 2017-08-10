import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;

import javax.swing.*;

/**
 * Created by Filippo on 22/05/2017.
 */
public interface serverInterface {

    ClientProfile login (String username);
    int showConnectedPlayers();
    boolean removePlayer(ClientProfile player);
    int getMaxPlayers();
    void addObserver(RemoteObserver o);

    Map getMap();
    void movePlayer(ClientProfile player, int newPosition);
}
