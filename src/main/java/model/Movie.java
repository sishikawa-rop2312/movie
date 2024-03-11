package model;

import java.io.Serializable;

public class Movie implements Serializable {
	private String name;
	private String title;
	private String comment;

	public Movie () {}
	public Movie (String name, String title, String comment) {
		this.name = name;
		this.title = title;
		this.comment = comment;
	}

	public String getName() {
		return this.name;
	}

	public String getTitle() {
		return this.title;
	}

	public String getComment() {
		return this.comment;
	}
}
