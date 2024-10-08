package main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import inputs.KeyboardInputs;
import inputs.MouseInputs;

public class GamePanel extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private MouseInputs mouseInputs;
	private float xDelta = 100, yDelta = 100;
	private BufferedImage img;
	
	public GamePanel() {
		
		mouseInputs = new MouseInputs(this);
		importImg();
		setPanelSize();
		addKeyListener(new KeyboardInputs(this));
		addMouseListener(mouseInputs);
		addMouseMotionListener(mouseInputs);
		
	}
	
	private void importImg() {
		InputStream is = getClass().getResourceAsStream("/sprite_1.png");
		
		try {
			img = ImageIO.read(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void setPanelSize() {
		Dimension size = new Dimension(1280,800);
		setPreferredSize(size);
		
		
	}

	public void changeXDelta(int value) {
		this.xDelta += value;
		
	}
	
	public void changeYDelta(int value) {
		this.yDelta += value;
		
	}
	
	public void setImgPos(float x, float y) {
		this.xDelta = x;
		this.yDelta = y;
		
	}
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.drawImage(img.getSubimage(0, 0, 100, 100), (int)xDelta, (int)yDelta, 200, 200, null);
		
	}


}
