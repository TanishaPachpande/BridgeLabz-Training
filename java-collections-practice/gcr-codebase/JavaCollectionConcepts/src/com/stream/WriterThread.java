package com.stream;

import java.io.IOException;
import java.io.PipedOutputStream;

public class WriterThread extends Thread {

    private PipedOutputStream pos;

    public WriterThread(PipedOutputStream pos) {
        this.pos = pos;
    }

    @Override
    public void run() {
        try {
            String message = "Data sent from Writer Thread";

            pos.write(message.getBytes());
            pos.flush();
            pos.close();

        } catch (IOException e) {
            System.out.println("Error in writer thread.");
            e.printStackTrace();
        }
    }
}

