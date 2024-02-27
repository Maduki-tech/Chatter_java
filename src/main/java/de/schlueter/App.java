package de.schlueter;

import de.schlueter.server.Server;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Server server = new Server();
        try {
            server.serve();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
