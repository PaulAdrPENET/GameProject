package Main;
import javax.swing.JFrame;
public class Gamewindow extends JFrame{

    public Gamewindow(GamePanel gamePanel){
        super("GameProject");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(gamePanel);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setResizable(false);
        this.setVisible(true);
    }
}
