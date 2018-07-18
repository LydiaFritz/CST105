// Lydia K Fritz
// CST105
// Date: Jul 17, 2018
// This is my own work.

package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class NFLPlayer_Manager {

	private ArrayList<NFLPlayer> roster;
	private static ArrayList<String> colleges = new ArrayList<String>();
	private static ArrayList<String> fNames = new ArrayList<String>();
	private static ArrayList<String> lNames = new ArrayList<String>();
	private static ArrayList<String> teams = new ArrayList<String>();
	private static String[] offensivePos = { "C", "OG", "OT", "QB", "HB", "FB", "WR", "TE" };
	private static String[] defensivePos = { "DT", "DE", "MLB", "OLB", "CB", "S" };

	private Random rnd = new Random();
	
	
	
	// make an empty roster
	public NFLPlayer_Manager() {
		roster = new ArrayList<NFLPlayer>();
		createPlayers();
		
		System.out.println("AFTER CREATE PLAYERS");
		
	}
	
	public NFLPlayer[] getPlayers(){
		NFLPlayer [] lst = new NFLPlayer[roster.size()];
		int i = 0;
		for(NFLPlayer p : roster){
			lst[i++] = p;
		}
		return lst;
	}
	
	

	public void createPlayers() {
		try {
			//build the lists
			Scanner finColl = new Scanner(new File("colleges.txt"));
			while(finColl.hasNext()){
				colleges.add(finColl.next());
			}
			Scanner finFirstName = new Scanner(new File("fName.txt"));
			while(finFirstName.hasNext()){
				fNames.add(finFirstName.next());
			}
			finColl = new Scanner(new File("teams.txt"));
			while(finColl.hasNext()){
				teams.add(finColl.next());
			}
		
			for(int i = 0; i < fNames.size(); i++){
				char ch = fNames.get(i).charAt(0);
				if(!Character.isAlphabetic(ch))
					fNames.remove(i--);				
			}
			
			
			//make the players
			
			for(int i = 0; i < 50; i++){
				NFLPlayer n = new NFL_DefPlayer();
				n.setFirstName(fNames.get(rnd.nextInt(fNames.size())));
				n.setLastName(fNames.get(rnd.nextInt(fNames.size())));
				n.setCollege(colleges.get(rnd.nextInt(colleges.size())));
				n.setPosition(defensivePos[rnd.nextInt(200) % defensivePos.length]);
				this.roster.add(n);
			}
			
			for(int i = 0; i < 20; i++){
				NFLPlayer n = new NFL_OffPlayer();
				n.setFirstName(fNames.get(rnd.nextInt(fNames.size())));
				n.setLastName(fNames.get(rnd.nextInt(fNames.size())));
				n.setCollege(colleges.get(rnd.nextInt(colleges.size())));
				n.setPosition(offensivePos[rnd.nextInt(200) % offensivePos.length]);
				this.roster.add(n);
			}
		
			Collections.shuffle(roster);
			
			finColl.close();
			finFirstName.close();
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String str = "";
		for(NFLPlayer p : roster){
			str += p + "\n";
		}
		return "NFLPlayer_Manager [roster=\n" + str;
	}

}
