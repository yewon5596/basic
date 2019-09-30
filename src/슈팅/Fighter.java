package ½´ÆÃ;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Fighter {
	private int x;
	private int y;
	private int vx;
	private int vy;
	private int dx;
	private int dy;
	private Image img;
	
	public Fighter() {
		x = 100;
		y = 100;
		
	
		Toolkit tk = Toolkit.getDefaultToolkit();
		 img = tk.getImage("res/fighter.png");
		 
	}
	
	public void draw(Graphics g, ShuttingCanvas canvas) {
		g.drawImage(img,x,y,canvas);
		System.out.println(x+","+y);
	}

	public void move(int x,int y) {
		dx = x;
		dy = y;
		//vx =(dx-this.x)/15;
		//vy=(dy-this.y)/15;
		float w = dx-this.x;
		float h = dy-this.y;
		float d =(float)Math.sqrt(w*w+h*h);
		vx =(int)(w/d*2);
		vy = (int)(h/d*2);
		
		
	    
	}
	public void updata() {
		x += vx;
		y += vy;
		
		
	
		
	}
}
