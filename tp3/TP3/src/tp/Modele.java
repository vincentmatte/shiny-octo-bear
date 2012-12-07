package tp;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Modele extends Observable{

	private int valeurX = 0;
	private int valeurY = 0;
	private int valeurZoom = 0;
	private File img = new File("image.png");
	

	//ENTOURER CETTE PARTIE PAR UN TRY CATCH IOException LORS DE L'INITIALISATION	
	/*BufferedImage in = ImageIO.read(img);
	BufferedImage newImage = new BufferedImage(in.getWidth(), in.getHeight(), BufferedImage.TYPE_INT_ARGB);*/



	
}
