package part3;

public class NewsChannel implements Observer {
    private String name;
    private String currentHeadline;

    public NewsChannel(String name) {
        this.name = name;
    }

    // Update method is called when the state of the observable changes
    @Override
    public void update(String headline) {
        this.currentHeadline = headline;
        display();
    }

    // Display the current headline for the news channel
    public void display() {
        System.out.println(name + " broadcasting: " + currentHeadline);
    }
}
