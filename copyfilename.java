import java.util.*;
import java.io.*;
public class copyfilename {
	public static void main(String[] args) {
		try {
//InputStream fis=new FileInputStream("U:\\inputFile.docx");
//OutputStream fos=new FileOutputStream("F:\\outputFile.docx");
InputStream fis=new FileInputStream("U:\\download.jpg");
OutputStream fos=new FileOutputStream("F:\\images.jpg");
int i=0;
while((i=fis.read())!=-1)
{
	fos.write(i);
}
fis.close();
fos.close();
System.out.println("Done");
		}
catch(Exception ex)
{
    System.out.println("NotDone");
}
}
}
