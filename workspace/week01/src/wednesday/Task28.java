package wednesday;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Task28 {
	static BufferedImage convertToGreyscale(String imgPath) throws IOException{
		
		BufferedImage img = null;
		
		img = ImageIO.read(new File(imgPath));
		int width = img.getWidth();
		int height = img.getHeight();
		int i = 0;
		int j = 0;
		int sum = 0;
		int red = 0;
		int green = 0;
		int blue = 0;
		
		for(i=0;i<height;i++){
			for(j=0;j<width;j++){
				Color c = new Color(img.getRGB(j, i));
				red = c.getRed();
				green = c.getGreen();
				blue = c.getBlue();
				sum =(red+green+blue)/3;
				Color newColor = new Color(sum,sum,sum);
				img.setRGB(j, i, newColor.getRGB());
			}
		}
		return img;
	}
	public static void main(String[] args) throws IOException {
		File output = new File("/home/vasi/Desktop/magiq.jpg");
		ImageIO.write(convertToGreyscale("/home/vasi/Desktop/greyscale.jpg"), "jpg", output);
	}

	
}
