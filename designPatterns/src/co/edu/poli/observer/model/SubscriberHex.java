package co.edu.poli.observer.model;

public class SubscriberHex implements Observer 
{
    @Override
    public void update(Message m) {
        System.out.println("MessageSubscriberHex :: " + Integer.toHexString(m.getNumber()));
    }
}