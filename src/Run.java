//The run class will fetch information from a text file and feed it to the
//PanelView class. It will also take changes from the panel and edit the file.

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

public class Run {

	public static void main(String[] args) {

		ArrayList<Integer> percent = new ArrayList<>();
		ArrayList<String> names = new ArrayList<>();


		//Link to the file
		try {
			String filename = "GradesDemo1.txt";
			File file = new File(filename);
			Scanner inputFile = new Scanner(file);

			//put file contents into arraylists
			while(inputFile.hasNext()){

				StringTokenizer st = new StringTokenizer(inputFile.nextLine());
				names.add(st.nextToken());
				percent.add(Integer.parseInt(st.nextToken()));

			}
			System.out.println(percent.toString());
			System.out.println(names.toString());

		} catch (FileNotFoundException e) {
			System.out.println("Grades file not linked properly.");
		}


	}
}
