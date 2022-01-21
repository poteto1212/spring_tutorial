package com.example.demo.responsetypes;

public class Greeting {

	private final long id;
	private final String content;
	private final String environTest;

	public Greeting(long id, String content, String environTest) {
		this.id = id;
		this.content = content;
		this.environTest = environTest;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}

	public String getEnvironTest(){
		return environTest;
	}
}
