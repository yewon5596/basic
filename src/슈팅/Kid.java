package 슈팅;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Kid {
	private int x;
	private int y;

	private int vx;
	private int vy;

	private int w;
	private int h;
	private static final int OFFSET_LEFT;
	private  final static int OFFSET_TOP;
	
	private Image img;
	private int imgIndex; // 가운데이미지를 가져오기위해 이미지를 배열로 생각하기
	
	private int timeForReady;
	
	static {
	OFFSET_LEFT=32;
	OFFSET_TOP=32;}
	
	public Kid() {
		x = 250;
		y = 300;
		w = 64;
		h = 64;

		Toolkit tk = Toolkit.getDefaultToolkit();
		img = tk.getImage("res/kkk.png");
		imgIndex = 0;

	}

	public void update() {
//			vx = x;
//			vy = y;
		
		if(timeForReady > 0)
			timeForReady--;

	}// 점진적인 업데이트

	public void draw(Graphics g, RoleCanvas roleCanvas) {
		// g.drawImage(img, imglndex, vy, observer);
		g.drawImage(img, 
				x-OFFSET_LEFT, 
				y-OFFSET_TOP, 
				x-OFFSET_LEFT + w, 
				y-OFFSET_TOP + h,
				w * imgIndex, 0, (w * imgIndex) + w, 64, roleCanvas);
		//w * imgIndex, 0, (w * imgIndex) + w, 64, roleCanvas
		
     
	}

	public void move(Direction directon) {
		
		switch (directon) {
		case LEFT:
			// 만약에 이미인덱스가 몇이상이라면
			if (imgIndex > 0)
				imgIndex--;
			
			x=x-2;
			break;
		case RIGHT:
			if (imgIndex < 6)
				imgIndex++;
			
			x=x+2;
			break;
		case UP:
			
			y=y-2;
			
			break;
			
		case DOWN:
			
			y=y+4;
			
			break;
			
			
			
		}
		System.out.println(imgIndex);
	}

	

	public void move(int x, int y) {
		// this.dx=x;

	}

	public Missile fire() {
		if(timeForReady==0) {
			Missile m = new Missile(x, y);
					timeForReady =30;
			
			return m;
		}
			
		return new Missile(x,y);
		
		
	}

}
