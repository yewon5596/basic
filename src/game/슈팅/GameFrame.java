package game.슈팅;

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
		this.setVisible(true); // 공통분모 프레임워크
		// fighter = new Fighter();
		
		addWindowListener(new GameWindowListener());
		
		
	}

}
