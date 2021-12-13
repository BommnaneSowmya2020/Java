import java.io.FileInputStream;

public class SuperFastCopy {

	public static void main(String[] args) {
		FileInputStream inFile = null;
		FileOutStream outFile = null;
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			inFile = new FileInputStream();
			outFile = new FileOutputStream();
			inChannel = inFile.getChannel();
			outChannel =  OutFile.getChannel();
		}
	}

}
