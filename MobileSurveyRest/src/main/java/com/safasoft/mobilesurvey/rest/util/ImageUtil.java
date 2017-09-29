package com.safasoft.mobilesurvey.rest.util;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

/**
 * Image customize utility
 * @author awal
 * @created Mar 18, 2017
 */
public class ImageUtil {

	/**
	 * Add given text to the given image
	 * @param image
	 * @param textArr array of text to add
	 * @param initXPos left position of the text
	 * @param initYPos top position of the text
	 * @return image in byte array
	 * @throws IOException
	 */
    public static byte[] mergeImageAndText(byte[] image, String[] textArr, int initXPos, int initYPos) throws IOException {
        //BufferedImage im = ImageIO.read(new URL(imageFilePath));
    	InputStream in = new ByteArrayInputStream(image);
    	BufferedImage im = ImageIO.read(in);
        Graphics2D g2 = im.createGraphics();
        //g2.setFont(g2.getFont().deriveFont(30f));
        for(String text : textArr) {
        	g2.drawString(text, initXPos, initYPos);
        	initYPos += 20;
        }
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(im, "png", baos);
        return baos.toByteArray();
    }
}
