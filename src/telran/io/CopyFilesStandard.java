package telran.io;

import java.io.File;
import java.io.IOException;
import java.nio.*;

/**
 * Application for copying files based on static method copy of class Files
 * files may be very big (several Gbytes ) 
 * args[0] - source file path
 * args[1] - destination file path
 * args[2] - if exists "overwritten" then destination may be overwritten otherwise may not be
 * Output one of the following:
 * Files have been copied (<amount of bytes> <time of copying>)
 * Source file doesn't exist
 * Destination can not be overwritten
 *
 */
public class CopyFilesStandard {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		
		File dir=new File("/Users/artemkoroliuk/Documents");
		System.out.println(dir.length()); 
		System.out.println(dir.getAbsolutePath());
		System.out.println(dir.getParent());
		System.out.println(dir.canWrite());
		System.out.println(dir.getCanonicalPath());
		System.out.println(dir.getName());
		System.out.println(dir.getFreeSpace());
		System.out.println(dir.getTotalSpace());
		System.out.println(dir.getUsableSpace());
		System.out.println(dir.hashCode());
	System.out.println(dir.isAbsolute());
	System.out.println(dir.isDirectory());
		System.out.println(dir.isHidden());
		System.out.println(dir.toString());
		System.out.println(dir.separatorChar);
		System.out.println(dir.pathSeparatorChar);
		System.out.println(dir.pathSeparator);
		System.out.println(dir.toURL());
		System.out.println(dir.getParentFile());
		System.out.println(dir.list());
		

		}

	}


