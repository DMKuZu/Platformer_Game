package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener{
	
	private GamePanel gamePanel;
	
	public KeyboardInputs(GamePanel gamePanel) {
		this.gamePanel = gamePanel;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch(e.getKeyCode()) {
		
		case KeyEvent.VK_W:
		case KeyEvent.VK_UP:
		case KeyEvent.VK_KP_UP:
			gamePanel.changeYDelta(-10);
			break;
		case KeyEvent.VK_A:
		case KeyEvent.VK_LEFT:
		case KeyEvent.VK_KP_LEFT:
			gamePanel.changeXDelta(-10);
			break;
		case KeyEvent.VK_S:
		case KeyEvent.VK_DOWN:
		case KeyEvent.VK_KP_DOWN:
			gamePanel.changeYDelta(+10);
			break;
		case KeyEvent.VK_D:
		case KeyEvent.VK_RIGHT:
		case KeyEvent.VK_KP_RIGHT:
			gamePanel.changeXDelta(+10);
			break;
		
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
}
