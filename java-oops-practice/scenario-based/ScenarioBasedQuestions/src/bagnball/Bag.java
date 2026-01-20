package bagnball;

import java.util.ArrayList;

public class Bag implements Storable {

    private String id;
    private String color;
    private int capacity;
    private ArrayList<Ball> balls;

    // Constructor
    public Bag(String id, String color, int capacity) {
        this.id = id;
        this.color = color;
        this.capacity = capacity;
        this.balls = new ArrayList<>();
    }

    @Override
    public String getId() {
        return id;
    }

    // Add ball
    public boolean addBall(Ball ball) {
        if (balls.size() < capacity) {
            balls.add(ball);
            return true;
        }
        return false;
    }

    // Remove ball
    public boolean removeBall(String ballId) {
        return balls.removeIf(ball -> ball.getId().equals(ballId));
    }

    // Display balls
    public void displayBalls() {
        if (balls.isEmpty()) {
            System.out.println("No balls in this bag.");
        } else {
            balls.forEach(System.out::println);
        }
    }

    // Ball count
    public int getBallCount() {
        return balls.size();
    }
}

