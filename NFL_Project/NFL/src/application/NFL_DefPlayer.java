// Lydia K Fritz
// CST105
// Date: Jul 17, 2018
// This is my own work.

package application;

public class NFL_DefPlayer extends NFLPlayer {

	private int tackles;

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
	 * @param tackles
	 */
	public NFL_DefPlayer(String firstName, String lastName, int age, String jerseyNum, String team, String position,
			int inches, int weightInPounds, String college, int tackles) {
		super(firstName, lastName, age, jerseyNum, team, position, inches, weightInPounds, college);
		this.tackles = tackles;
	}

	/**
	 * @param firstName
	 * @param lastName
	 * @param tackles
	 */
	public NFL_DefPlayer(String firstName, String lastName, int tackles) {
		super(firstName, lastName);
		this.tackles = tackles;
	}

	/**
	 * @param tackles
	 */
	public NFL_DefPlayer() {
		super();
		this.tackles = 0;
	}

	/**
	 * @return the tackles
	 */
	public int getTackles() {
		return tackles;
	}

	/**
	 * @param tackles the tackles to set
	 */
	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NFL_DefPlayer [" + getFullName() +
				"; " + getPosition() +
				"; " + getCollege() + "]";
	}
	
	
	
	
}
