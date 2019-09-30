package game.����;

import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class GameFrame extends Frame {

	// private Figher figher;
	private Canvas canvas;

	public GameFrame() {
		this.setSize(500, 700);
		
		//canvas = new GameCanvas();
		canvas = new ShuttingCanvas();
		add(canvas);
		
		canvas.setFocusable(true);
        canvas.requestFocus();
		this.setVisible(true); // ����и� �����ӿ�ũ
		// fighter = new Fighter();
		
		addWindowListener(new GameWindowListener());
		
		
	}

}
