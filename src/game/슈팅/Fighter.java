package game.½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	private int x;
	private int y;
	private Image img;
	
	public void Fighter() {
		x = 300;
		y = 300;
	
		Toolkit tk = Toolkit.getDefaultToolkit();
		 img = tk.getImage("res/fighter.png");
		 
	}
	
	public void draw(Graphics g, ShuttingCanvas canvas) {
		g.drawImage(img,x,y, canvas);
	}
	

}
