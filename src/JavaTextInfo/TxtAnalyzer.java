package JavaTextInfo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class TxtAnalyzer {
	 private int char_number = 0;
     private int line_count = 0;
     private int word_count = 0;
    public TxtAnalyzer() {
    	 int char_number = 0;
         int line_count = 0;
         int word_count = 0;
    }
    
    
    public int getCharCount() {
		return char_number;
	}


	public int getLineCount() {
		return line_count;
	}


	public int getWordCount() {
		return word_count;
	}


	public String info(String file) {
	    // Reset counts at the beginning of each method call
	    this.char_number = 0;
	    this.line_count = 0;
	    this.word_count = 0;

	    try (Scanner myReader = new Scanner(new File(file))) {
	        while (myReader.hasNextLine()) {
	            String line = myReader.nextLine();
	            char_number += line.length() + 1; // +1 for newline character, if needed
	            line_count++;
	            String[] words = line.split("\\s+");
	            word_count += words.length;
	            System.out.println(line);
	        }
	    } catch(IOException e) {
	        e.printStackTrace();
	        return null;
	    }

	    return char_number + " " + line_count + " " + word_count;
	}

    }

