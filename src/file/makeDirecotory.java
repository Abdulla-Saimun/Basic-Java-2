package file;

import java.io.File;

public class makeDirecotory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File dir = new File("E:/13th semester/javaTutorial/newProject/src/file/newfilecontent");
		dir.mkdir();
		if(dir.exists()) {
			System.out.println("file created");
			String location = dir.getAbsolutePath();
			File file1 = new File(location+"/student.txt");
			File file2 = new File(location+"/teacher.txt");
			
			try {
				file1.createNewFile();
				file2.createNewFile();
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
