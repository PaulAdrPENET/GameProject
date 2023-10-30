package inputs;

import Main.GamePanel;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboardinputs implements KeyListener {
    private GamePanel gamePanel;

    public Keyboardinputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch (e.getKeyCode()){
            case KeyEvent.VK_Z:
                System.out.println("Z");
                gamePanel.changeYDelta(-5);
                break;
            case KeyEvent.VK_Q:
                System.out.println("Q");
                gamePanel.changeXDelta(-5);
                break;
            case KeyEvent.VK_S:
                System.out.println("S");
                gamePanel.changeYDelta(+5);
                break;
            case KeyEvent.VK_D:
                System.out.println("D");
                gamePanel.changeXDelta(+5);
                break;
        }
    }
}
