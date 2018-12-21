import javax.swing.JFrame;

public class ServerTest {
   public static void main(String[] args) {
      Server message = new Server();
      message.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      message.startRunning();
   }
}