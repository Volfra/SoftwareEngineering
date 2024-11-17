package co.edu.poli.observer.model;

public class Client {

    public static void main(String[] args) 
    {
        SubscriberBinary s1 = new SubscriberBinary();
        SubscriberHex s2 = new SubscriberHex();
        SubscriberOctal s3 = new SubscriberOctal();
         
        MessagePublisher p = new MessagePublisher();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Message(23));   //s1 and s2 will receive the update
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Message(67)); //s2 and s3 will receive the update
    }
}