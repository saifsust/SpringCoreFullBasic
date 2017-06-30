package com.springFrameWork.DatabaseUsingNamedParameter;

public class Detail {
	private int Id;
	private String FirstName, LastName, Text;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	@Override
	public String toString() {
		return "Detail [Id=" + Id + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Text=" + Text + "]";
	}

}
