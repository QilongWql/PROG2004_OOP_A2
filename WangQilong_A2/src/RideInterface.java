public interface RideInterface {
    public void addVisitorToQueue(Visitor visitor);

    public void removeVisitorFromQueue(Visitor visitor);
 
    public void printQueue();
 
    //void runOneCycle();
 
    public void addVisitorToHistory(Visitor visitor);
 
    public boolean checkVisitorFromHistory(Visitor visitor);
 
    public int numberOfVisitors();
 
    public void printRideHistory();
}