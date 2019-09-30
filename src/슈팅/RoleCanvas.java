package ����;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import �����迭.ObjectList;


public class RoleCanvas extends Canvas implements MouseListener, KeyListener {

	private Kid kid;
	private Background bg;
	//private Missile[] missiles;
	private List<Missile> missiles;

	public RoleCanvas() {// ��ü�ʱ�ȭ

		kid = new Kid();// ��ü����
		bg = new Background();
		//missiles= new Missile[100];
        missiles = new ArrayList<>();
		addMouseListener(this);
		addKeyListener(this);

		new Thread(() -> {
			while (true) {
				try {

					bg.update();
					kid.update();//�̺�Ʈ�߻��� ��� �ٲ��
					
					//if(missiles[0]!=null)
					//	missiles[0].update();
					
					for(Missile m : missiles)//foreach
						m.update();
					//for(Object o  : missiles) {
					//Missile m =(Missile)o;
					// m.update();
					//	= ((Missile)o).update();
					//}
					    //for(int i=0; i<missiles.size();i++)
						//missiles.get(i).update();
						//((Missile)missiles.get(i)).update();
					
					Thread.sleep(17);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				repaint();//ĵ������ȣ���ϰ� ������Ʈ�Ѵ�
                          //������ ȭ���� �ٽñ׸��� 
			}
		}).start();

	}

	@Override
	public void paint(Graphics g) {//�����쿡�׸�
		
		Image buflmage= createImage(
				 this.getWidth()
				,this.getHeight());
		//buflmage.getGraphics();//�̹����� �׸��׸��� ���۴µ��� �������
		
		Graphics g2 = buflmage.getGraphics();
		bg.draw(g2, this);
		kid.draw(g2,this);
		
		//if(missiles[0]!=null)
		//	missiles[0].draw(g2,this);
		//for(Object o  : missiles) {
			//Missile m =(Missile)o;
			//((Missile)o).draw(g2,this);
		//}
		for(int i=0; i<missiles.size();i++)
			((Missile)missiles.get(i)).draw(g2,this);
		
		
		g.drawImage(buflmage, 0, 0, this);

	}
	
	@Override
	public void update(Graphics g) {
	  paint(g);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			kid.move(Direction.LEFT);
			break;
		case KeyEvent.VK_RIGHT:
			kid.move(Direction.RIGHT);
			break;
			
		case KeyEvent.VK_UP:
			kid.move(Direction.UP);
			break;
			
		case KeyEvent.VK_DOWN:
			kid.move(Direction.DOWN);
           break;			
			
		case KeyEvent.VK_SPACE:
			System.out.println(missiles.size());
			Missile m = kid.fire();
			if(m != null)
				missiles.add(m);
			
			break;
			
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub

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

}
