package src;

import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;

public class CompareFileSize {


	public static void main(String[] args) {
		Path textfile = 
				Paths.get("C:\\Users\\Aliso\\OneDrive\\Desktop\\Java\\anti-hero.txt");
		Path wordfile = 
				Paths.get("C:\\Users\\Aliso\\OneDrive\\Desktop\\Java\\anti-hero.docx");
		try
		{
			BasicFileAttributes attrText = 
					Files.readAttributes(textfile, BasicFileAttributes.class);
			BasicFileAttributes attrWord = 
					Files.readAttributes(wordfile, BasicFileAttributes.class);
			long textSize = attrText.size();
			long wordSize = attrWord.size();
			double ratio = textSize * 100.00 / wordSize; 
			System.out.println(textfile.toString() + " is " + textSize + " bytes long");
			System.out.println(wordfile.toString() + " is " + wordSize + " bytes long");
			System.out.println("The text file is " + ratio + " % of the size of the word file");
		}
		catch(IOException e)
		{
			System.out.println(" IO Exception");
		}
		

	}

}
