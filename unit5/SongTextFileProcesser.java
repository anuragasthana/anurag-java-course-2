package unit5;

import java.io.*;

public class SongTextFileProcesser implements SongReader, SongWriter {
	Song info = null;
	PrintWriter out = null;
	String fileName = null;
	BufferedReader in = null;
	String line = null;

	public SongTextFileProcesser(String fileName) {
		this.fileName = fileName;
		// create this file in read write mode
	}

	public SongTextFileProcesser() {

	}

	public void writeSong(Song a) {

		try {
			out = new PrintWriter(new BufferedWriter(new FileWriter(fileName,
					true)));
			out.println("\nTitle: " + a.title);
			out.println("Artist: " + a.artist);
			out.println("Genre: " + a.genre);
		} catch (IOException f) {
			System.out.println("File does not exist");
		} finally {
			out.close();
		}

	}

	public Song readSong() {
		if (info.title != "" || info.artist != "" || info.genre != "") {
			return info;
		} else {
			System.out
					.println("Sorry, there is missing information for this song");
			return null;
		}

	}

	public void enterSong(Song a) {
		info = a;
		readSong();
	}

	public void readAllSongs() {
		try {
			in = new BufferedReader(new FileReader(fileName));
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}
			in.close();
		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		} catch (IOException e) {
			System.out.println("IOException Thrown");
		}
	}

}
