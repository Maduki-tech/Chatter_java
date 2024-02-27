package de.schlueter.server;

import java.io.IOException;

/**
 * ServerInterface
 */
public interface ServerInterface {
    public void serve() throws IOException;
    public void handleClient();
    public void close();
    public void broadcast(String message);
}
