

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class CodetoCommentsRatio 
{
	public static void main (String [] args) throws IOException
	{
	
	if(args.length < 1)
		return;
	
	if (args[0].contains(".class"))
		return;
	
	BufferedReader br = new BufferedReader(new FileReader(args[0]));
	
	int numberOfLines = 0 , numberOfComments = 0;
	
    boolean inAComment = false;

    String line;
  
    while ((line = br.readLine()) != null) {
      int pre_trim_length = line.length();
      int trim_length = (new String(line)).trim().length();
      
      if ((line.indexOf("/*") != -1) && 
          (line.indexOf("*/") != -1)) {
        if (line.trim().length() > 6)
            numberOfComments ++;
      } else if (line.indexOf("//") != -1) {
        if (line.trim().length() > 3) {
          numberOfComments ++;
        }
      } else if ((line.indexOf("/*") != -1) && (line.indexOf("*/") == -1)) {
        inAComment = true;
        if (line.trim().length() > 3) {
          numberOfComments ++;
        }
      } else if ((line.indexOf("/*") == -1) && (line.indexOf("*/") != -1)) {
        inAComment = false;
        if (line.trim().length() > 3) {
          numberOfComments ++;
        }
      } else if (inAComment) {
        if (line.trim().length() > 3) {
          numberOfComments ++;
        }
      }
      
      if (line.trim().length() > 3) {
        numberOfLines ++;
      } 
    }
    
    // print out total number of lines
    System.out.println("Total number of lines of code: " + numberOfLines);
    // print out total number of comments
    System.out.println("Total number of lines of comments: " + numberOfComments);
    // print out ratio comments/lines
    System.out.println("Ratio (comments/code): " + (int)((float)numberOfComments/numberOfLines*100+0.5) + "%");
	
	if((int)((float)numberOfComments/numberOfLines*100+0.5) < 10)
		throw new IOException();
  }
}