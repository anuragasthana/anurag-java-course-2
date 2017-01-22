package unit5;

public class Assignment5 {

	public static void main(String[] args) {
		SongTextFileProcesser songProcessor = null;
		String filename = Input
				.getString("What file would you like to use for viewing your songs");
		songProcessor = new SongTextFileProcesser(filename);

		while (true) {
			// what do u want to do
			String input = null; // writeSong, displayAllSong
			input = Input
					.getString("Would you like to add a song, display all songs, or quit?");
			if (input.equals("add a song")) {
				String title = Input.getString("What is the title of the song");
				String artist = Input.getString("Who is the song's artist?");
				String genre = Input
						.getString("What is the genre of this song?");
				Song inputSong = new Song(title, artist, genre);
				songProcessor.writeSong(inputSong);
				songProcessor.enterSong(inputSong);
			} else if (input.equals("display all songs")) {
				songProcessor.readAllSongs();
			} else if (input.equals("quit")) {
				break;
			} else {
				System.out.println("Invalid Input");
			}
		}

	}

}
