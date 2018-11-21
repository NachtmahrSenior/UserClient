package model;

import java.sql.Time;

public class Session {
	private int sessionID;
	private Time startTime, endTime;
	private User user;

	public Session(int sessionID, Time startTime, Time endTime, User user) {
		this.sessionID = sessionID;
		this.startTime = startTime;
		this.endTime = endTime;
		this.user = user;
	}

	public int getSessionID() {
		return sessionID;
	}

	public int getUserID() {
		return user.getUserID();
	}

	public Time getStartTime() {
		return startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

}
