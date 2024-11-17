package co.edu.poli.observer.model;

public class Message 
{
    final Integer number;
     
    public Message (Integer n) {
        this.number = n;
    }
 
    public Integer getNumber() {
        return number;
    }
}