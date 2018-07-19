package cloud.rehlat.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUtils {

	public static final String ENGINE_FILE_DIR = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + 
			"cloud" + File.separator + "canopy" + File.separator + "documents" + File.separator + "engine" + File.separator + "downloadedFiles" + File.separator;

	/**
	 * This method is used to check if the file is present in the specified folder and to delete it
	 * @param downloadPath
	 * @param fileName
	 * @return boolean
	 */
	public static boolean isFileDownloaded(String fileName) {
		System.out.println("path is : "+ENGINE_FILE_DIR + fileName);
		File file = new File(ENGINE_FILE_DIR + fileName);
		try {
		System.out.println("checking file:"+file.exists()+":"+file.isFile()+":"+file.isDirectory()+":"+file.getAbsoluteFile().exists());
			System.out.println("file exists");
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			System.out.println(file.canExecute());
			System.out.println(file.getAbsolutePath());
			Path path = FileSystems.getDefault().getPath(ENGINE_FILE_DIR + fileName);
			Path path1 = Files.createFile(path);
			System.out.println("is excutinga : "+Files.isExecutable(path1));
			Files.deleteIfExists(path1);
			System.out.println("deleting file:"+Files.deleteIfExists(path1));
	}catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return false;
	}
}
