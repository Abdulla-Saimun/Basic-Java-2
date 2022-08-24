package str.problem.solution;
import java.io.BufferedReader;
import java.io.FileReader;

public class NumberOFWordInTextFile {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		FileReader f  =new FileReader("./src/str/problem/solution/data.txt");
        BufferedReader b = new BufferedReader(f);
        int count = 0;
        String line;
        while((line = b.readLine() ) != null) {
        	String words[] = line.split(" ");
        	count = count + words.length;
        }
        
        System.out.println(count);
		

	}

}
