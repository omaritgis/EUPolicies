package GUI;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CustomJPanel extends JPanel{
	BufferedImage image = null;
	
	public CustomJPanel() {
		
	}
	@Override
    public void paintComponent(Graphics g) {
        // TODO Auto-generated method stub
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
	public void setImage(BufferedImage image) {
        this.image = image;
        image.getScaledInstance(this.getWidth(), this.getHeight(), java.awt.Image.SCALE_SMOOTH);
        repaint();
    }
}
