package part3;

public class NewsChannel implements Observer {
    private String name;
    private String currentHeadline;

    public NewsChannel(String name) {
        this.name = name;
    }

    @Override
    public void update(String headline) {
        this.currentHeadline = headline;
        display();
    }

    public void display() {
        System.out.println(name + " broadcasting: " + currentHeadline);
    }
}
