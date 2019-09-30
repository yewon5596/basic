package 슈팅;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
//test
public class Background {
	private int x;
	private int y;
	private Image img;
	
	
	
	public Background() {
		x=0;
		y=0;
		
		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/2.jpg");
	
		
	}


	public void draw(Graphics g, RoleCanvas roleCanvas) {
           g.drawImage(img, x, y,roleCanvas);//전체화면
           g.drawImage(img, x, y-600,roleCanvas);//전체화면
           
		   
	}



	public void update() {
		y++;
		
	}
	

}
