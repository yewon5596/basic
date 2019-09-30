package game.슈팅;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ShuttingCanvas extends Canvas implements MouseListener, KeyListener {
	// 아군기

	private Fighter fighter;

	private Enemy enemy;

	public ShuttingCanvas() {
		fighter = new Fighter();
		enemy = new Enemy();
		addMouseListener(this);
		addKeyListener(this);

	}

	@Override
	public void paint(Graphics g) {
		fighter.draw(g, this);
		enemy.draw(g, this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		repaint();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case 37: // 왼쪽
			x -= 3;
			break;
		case 38: // 위쪽
			y -= 3;
			break;
		case 39:// 오른쪽
			x += 3;
			break;
		case 40:// 아래
			y += 3;
			break;
		}
		x += 3;
		repaint();

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
