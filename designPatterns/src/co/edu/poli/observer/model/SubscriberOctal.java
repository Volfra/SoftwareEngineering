package co.edu.poli.observer.model;

public class SubscriberOctal implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberOctal :: " + Integer.toOctalString(m.getNumber()));
    }
}