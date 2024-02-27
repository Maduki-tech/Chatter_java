package de.schlueter.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Server
 */
public class Server implements ServerInterface {
    private ServerSocket serverSocket;
    private Socket clientSocket;

    public Server() {
    }

    @Override
    public void serve() throws IOException {
        serverSocket = new ServerSocket(8080);
        clientSocket = serverSocket.accept();

        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in =
            new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String inputLine, outputLine;

        while ((inputLine = in.readLine()) != null) {
            outputLine = inputLine;
            out.println(outputLine);
            if (outputLine.equals("Bye.")) {
                out.println("Chat closed.");
                break;
            }
        }
    }

    @Override
    public void handleClient() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'handleClient'");
    }

    @Override
    public void close() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'close'");
    }

    @Override
    public void broadcast(String message) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'broadcast'");
    }
}
