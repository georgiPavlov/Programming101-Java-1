package wednesday;

public class Task16 {

	int[][] rescale(int[][] original, int newWidth, int newHeight) throws Exception{
		int height= original[0].length;
		int width  = original.length;
		double x_ratio = width/(double)newWidth;
		double y_ratio = height/(double)newHeight;
		int i=0;
		int j=0;
		double px;
		double py;
		if(newWidth == 0 || newHeight == 0 ){
			throw new Exception("IllegalArgumentException");
		}
		int [][]result = new int [newWidth][newHeight]; 
		for(i=0;i<newWidth;i++){
			for(j=0;j<newHeight;j++){
				px=Math.floor(j*x_ratio);
				py=Math.floor(i*y_ratio);
				result[i][j]=original[(int) px][(int) py];
			}
		}
		return result;
	}
}
