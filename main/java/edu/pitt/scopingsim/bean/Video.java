package java.edu.pitt.scopingsim.bean;

import java.util.ArrayList;
import java.util.UUID;

public class Video {
	
	private UUID videoId;
	private String path;
	private ArrayList<Note> noteList;
	private ArrayList<Quiz> quizList;
	
	public Video() {
		// TODO Auto-generated constructor stub
		noteList = new ArrayList<Note>();
		quizList = new ArrayList<Quiz>();
	}
	
	/**
	 * @return the videoId
	 */
	public UUID getVideoId() {
		return videoId;
	}
	/**
	 * @param videoId the videoId to set
	 */
	public void setVideoId(UUID videoId) {
		this.videoId = videoId;
	}
	/**
	 * @return the path
	 */
	public String getPath() {
		return path;
	}
	/**
	 * @param path the path to set
	 */
	public void setPath(String path) {
		this.path = path;
	}
	
	/**
	 * @return the noteList
	 */
	public ArrayList<Note> getNoteList() {
		return noteList;
	}
	/**
	 * @param noteList the noteList to set
	 */
	public void addNote(Note note) {
		this.noteList.add(note);
	}
	
	/**
	 * @return the quizList
	 */
	public ArrayList<Quiz> getQuizList() {
		return quizList;
	}
	/**
	 * @param quizList the quizList to set
	 */
	public void addQuiz(Quiz quiz) {
		this.quizList.add(quiz);
	}
	
}
