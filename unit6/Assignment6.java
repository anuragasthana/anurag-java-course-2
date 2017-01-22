package unit6;

/**
 * The Class Assignment6.
 */
public class Assignment6 {

	public static void main(String[] args) {
		SongTextFileProcesser songProcessor = null;
		String filename = Input
				.getString("What file would you like to use for viewing your songs?");
		songProcessor = new SongTextFileProcesser(filename);

		while (true) {
			// what do u want to do
			String input = Input
					.getString("Would you like to Add, Read, or Quit this application?\n Enter Add, Read or Quit");
			if (input.equalsIgnoreCase("add")) {
				String title = Input.getString("What is the title of the song");
				String artist = Input.getString("Who is the song's artist?");
				String genre = Input
						.getString("What is the genre of this song?");
				Song inputSong = new Song(title, artist, genre);
				songProcessor.writeSong(inputSong);				
			} else if (input.equalsIgnoreCase("read")) {
				Song mySong = songProcessor.readSong();
				while (mySong != null) {
					System.out.println(mySong.toString());
					mySong = songProcessor.readSong();
				}
				//Reset the read pointer back to sart of the file for new read
				songProcessor.setReadSeek(0);
			} else if (input.equalsIgnoreCase("quit")) {
				break;
			} else {
				System.out.println("Invalid Input");
			}
		}

	}

}
