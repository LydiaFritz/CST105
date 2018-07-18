// Lydia K Fritz
// CST105
// Date: Jul 17, 2018
// This is my own work.

package application;

public abstract class NFLPlayer {

	private String firstName;
	private String lastName;
	private int age;
	private String jerseyNum;
	private String team;
	private String position;
	private int inches;
	private int weightInPounds;
	private String college;
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
	 */
	public NFLPlayer(String firstName, String lastName, int age, String jerseyNum, String team, String position,
			int inches, int weightInPounds, String college) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.jerseyNum = jerseyNum;
		this.team = team;
		this.position = position;
		this.inches = inches;
		this.weightInPounds = weightInPounds;
		this.college = college;
	}
	/**
	 * @param firstName
	 * @param lastName
	 */
	public NFLPlayer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	
	/**
	 * 
	 */
	public NFLPlayer() {
		
	}
	
	public String getHeight(){
		int feet = this.inches/12;
		int inch = this.inches%12;
		String result = feet + "\'" + inch + "\"";
		return result;
	}
	
	public String getFullName(){
		return this.lastName + ", " + this.firstName.charAt(0) + ".";
	}
	
	
	
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the jerseyNum
	 */
	public String getJerseyNum() {
		return jerseyNum;
	}
	/**
	 * @param jerseyNum the jerseyNum to set
	 */
	public void setJerseyNum(String jerseyNum) {
		this.jerseyNum = jerseyNum;
	}
	/**
	 * @return the team
	 */
	public String getTeam() {
		return team;
	}
	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}
	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}
	/**
	 * @return the inches
	 */
	public int getInches() {
		return inches;
	}
	/**
	 * @param inches the inches to set
	 */
	public void setInches(int inches) {
		this.inches = inches;
	}
	/**
	 * @return the weightInPounds
	 */
	public int getWeightInPounds() {
		return weightInPounds;
	}
	/**
	 * @param weightInPounds the weightInPounds to set
	 */
	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}
	/**
	 * @return the college
	 */
	public String getCollege() {
		return college;
	}
	/**
	 * @param college the college to set
	 */
	public void setCollege(String college) {
		this.college = college;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "NFLPlayer [firstName=" + firstName + ", lastName=" + lastName + ", team=" + team + "]";
	}
	
	
}
