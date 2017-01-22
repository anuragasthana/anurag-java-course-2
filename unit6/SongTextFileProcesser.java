package unit6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;


/**
 * The Class SongTextFileProcesser.
 */
public class SongTextFileProcesser implements SongReader, SongWriter {

	/** The file name. */
	private String fileName = null;

	/** The write seek. */
	private long writeSeek = 0;

	/** The read seek. */
	private long readSeek = 0;

	/** The song file. */
	private RandomAccessFile songFile = null;

	/**
	 * Instantiates a new song text file processer.
	 */
	public SongTextFileProcesser() {

	}

	/**
	 * Instantiates a new song text file processer.
	 *
	 * @param fileName
	 *            the file name
	 */
	public SongTextFileProcesser(String fileName) {
		this.fileName = fileName;
		// create this file in read write mode
		try {
			songFile = new RandomAccessFile(fileName, "rw");
			writeSeek = songFile.length();
		} catch (IOException e) {
			System.out.println("IOException Thrown 1");
		}
	}

	/**
	 * Gets the file name.
	 *
	 * @return the file name
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * Sets the file name.
	 *
	 * @param fileName
	 *            the new file name
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * Gets the write length.
	 *
	 * @return the write length
	 */
	public long getWriteLength() {
		return writeSeek;
	}

	/**
	 * Sets the write length.
	 *
	 * @param length
	 *            the new write length
	 */
	public void setWriteLength(long length) {
		this.writeSeek = length;
	}

	/**
	 * Gets the song file.
	 *
	 * @return the song file
	 */
	public RandomAccessFile getSongFile() {
		return songFile;
	}

	/**
	 * Sets the song file.
	 *
	 * @param songFile
	 *            the new song file
	 */
	public void setSongFile(RandomAccessFile songFile) {
		this.songFile = songFile;
	}

	/**
	 * Gets the read seek.
	 *
	 * @return the read seek
	 */
	public long getReadSeek() {
		return readSeek;
	}

	/**
	 * Sets the read seek.
	 *
	 * @param readSeek
	 *            the new read seek
	 */
	public void setReadSeek(long readSeek) {
		this.readSeek = readSeek;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * Writes a song into the file
	 */
	@Override
	public void writeSong(Song song) {
		try {
			songFile.seek(getWriteLength());
			songFile.writeChars(song.title + "\n");
			songFile.writeChars(song.artist + "\n");
			songFile.writeChars(song.genre + "\n");
			
			//Set writeseek pointer
			this.setWriteLength(songFile.length());

		} catch (IOException e) {
			System.out.println("IOException Thrown 2");
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * Reads a single song and sets the readseek pointer
	 * returns he song object
	 */
	public Song readSong() {
		Song result = null;
		try {
			String artist = null;
			String title = null;
			String genre = null;
			songFile.seek(this.getReadSeek());
			title = songFile.readLine();
			if (title == null) {
				return result;
			}
			long length = title.getBytes().length;
			this.setReadSeek(length + this.getReadSeek() + 1); // +1 added for "\n"
			artist = songFile.readLine();
			if (artist == null) {
				return result;
			}
			length = artist.getBytes().length;
			this.setReadSeek(length + this.getReadSeek() + 1);
			genre = songFile.readLine();
			if (genre == null) {
				return result;
			}
			length = genre.getBytes().length;
			this.setReadSeek(length + this.getReadSeek() + 1);
			if ((title != null) && (artist != null) && (genre != null)) {
				result = new Song(title, artist, genre);
			}

		} catch (FileNotFoundException e) {
			System.out.println("No file found");
		} catch (IOException e) {
			System.out.println("IOException Thrown 3");
		}
		return result;
	}
}
