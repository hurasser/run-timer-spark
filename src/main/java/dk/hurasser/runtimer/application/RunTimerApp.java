package dk.hurasser.runtimer.application;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import static spark.Spark.*;

public class RunTimerApp {
    public static void main(String[] argv) {

        SessionFactory sf = new Configuration().configure().buildSessionFactory();

        staticFiles.location("/public");

        get("/hello", (req, res) -> "Hello World");
    }
}
