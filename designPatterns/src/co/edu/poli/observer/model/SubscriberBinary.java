package co.edu.poli.observer.model;

public class SubscriberBinary implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberBinary :: " + Integer.toBinaryString(m.getNumber()));
    }
}
