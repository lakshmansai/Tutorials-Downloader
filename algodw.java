import java.net.*;
import java.io.*;
import java.nio.file.*;
class Algodw{
	public static void main(String []args){
		String baseUrl="https://www.zzz.edu/~ccc/algorithms/";
		String format=".pdf";
		for(int i=1;i<40;i++)
		{
			try{

					String fileName="chap"+i+format;
					String targetDirectory="E:\\algos\\";
				    Path targetPath = new File(targetDirectory + fileName ).toPath();
				    URL url=new URL(baseUrl+"chap"+i+format);
				    System.out.println(targetPath+"\n"+url);
				    Files.copy(url.openStream(), targetPath, StandardCopyOption.REPLACE_EXISTING);
			}
			catch(IOException e){
				System.out.println("no more files");
				// break;
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}