import java.awt.*;

public class Aviary{

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		//create a drawing panel
		DrawingPanel panel = new DrawingPanel(AviaryConstants.SIZE* AviaryConstants.PIXELS,
				AviaryConstants.SIZE * AviaryConstants.PIXELS);
		Graphics g = panel.getGraphics();

		//create several birds
		Bird[] birds = {
				new Cardinal(7,4), new Cardinal(3, 8),
				new Hummingbird(2, 9), new Hummingbird(16, 11),
				new Bluebird(4, 15), new Bluebird(8, 1),
				new Vulture(3, 2), new Vulture(18, 14)
		};

        
		while (true) {
			// clear screen
			g.setColor(Color.WHITE);
			g.fillRect(0, 0, AviaryConstants.SIZE* AviaryConstants.PIXELS,
					AviaryConstants.SIZE* AviaryConstants.PIXELS);

			// tell each bird to fly and redraw the bird
			for (Bird bird: birds) {
				bird.fly();
				g.setColor(bird.getColor());
				Point pos = bird.getPosition();
				g.fillOval((int)pos.getX()* AviaryConstants.PIXELS, (int) pos.getY()* AviaryConstants.PIXELS,
						AviaryConstants.PIXELS, AviaryConstants.PIXELS);

			}
			panel.sleep(500);
		}
	}
}

