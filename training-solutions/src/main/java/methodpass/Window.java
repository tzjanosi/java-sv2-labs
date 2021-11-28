package methodpass;

public class Window {
    private String roomName;
    private int width;
    private int height;

    public Window(String roomName, int width, int height) {
        this.roomName = roomName;
        this.width = width;
        this.height = height;
    }

    public void increaseheight(int plusHeight){
        height+=plusHeight;
    }

    public int getHeight() {
        return height;
    }
}
