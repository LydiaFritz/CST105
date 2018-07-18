// Lydia K Fritz
// CST105
// Date: Jul 17, 2018
// This is my own work.

package application;

public class NFL_OffPlayer extends NFLPlayer {

	private int touchDowns;

	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param jerseyNum
	 * @param team
	 * @param position
	 * @param inches
	 * @param weightInPounds
	 * @param college
	 * @param touchDowns
	 */
	public NFL_OffPlayer(String firstName, String lastName, int age, String jerseyNum, String team, String position,
			int inches, int weightInPounds, String college, int touchDowns) {
		super(firstName, lastName, age, jerseyNum, team, position, inches, weightInPounds, college);
		this.touchDowns = touchDowns;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param touchDowns
	 */
	public NFL_OffPlayer(String firstName, String lastName, int touchDowns) {
		super(firstName, lastName);
		this.touchDowns = touchDowns;
	}

	/**
	 * 
	 */
	public NFL_OffPlayer() {
		super();
	}

	/**
	 * @return the touchDowns
	 */
	public int getTouchDowns() {
		return touchDowns;
	}

	/**
	 * @param touchDowns the touchDowns to set
	 */
	public void setTouchDowns(int touchDowns) {
		this.touchDowns = touchDowns;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NFL_OffPlayer [" + getFullName() +
				"; " + getPosition() +
				"; " + getCollege() + "]";
	}
	
	
}
