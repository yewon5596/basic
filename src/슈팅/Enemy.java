package ½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Enemy {
	int x;
	int y;
	Image img;
	
	public Enemy() {
		x=100;
		y=100;
		
		 Toolkit ek = Toolkit.getDefaultToolkit();
		 img = ek.getImage("res/enemy.png");
	}
	
	public void draw(Graphics g,ShuttingCanvas canvas) {
		
		g.drawImage(img,x,y,canvas );
	}
	
	
	

	


	
	
	
	}
