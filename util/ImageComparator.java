package util;
	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;

	public class ImageComparator {
		int result = 0;
		public int compareTwo(String sourceFile, String modifiedFile) throws IOException {
				
			BufferedReader br = new BufferedReader( new FileReader(sourceFile));
			BufferedReader brModified = new BufferedReader( new FileReader(modifiedFile));

	        int c;
	        int cModified;
	        
	        while ((c = br.read())!=-1) {
                   cModified = brModified.read();
                   if (c != cModified) result++;
	               }
	          return result;
		}
	    public boolean compare(String sourceFile, String modifiedFile) throws IOException {
	        ImageComparator comparator = new ImageComparator();
	        if (comparator.compareTwo(sourceFile,modifiedFile) == 0) {
	            return true;
	        } else
	            return false;
	    }
	}

