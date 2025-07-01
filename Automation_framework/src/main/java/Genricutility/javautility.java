package Genricutility;

import java.time.LocalDateTime;
import java.util.Random;
/**
 * @author venkat
 */
public class javautility {
	/**
	 * THis method is used to Capture system date and time
	 * @return System Date time
	 */
	public String getSystemTime() {
		
		return LocalDateTime.now().toString().replace(":", "-");
	}
	/**
	 * This method will return random number 
	 * @param bound
	 * @return int
	 */
	public int getRandomNumber(int bound) {
		Random ran=new Random();
		return ran.nextInt(bound);
		
	}
	
		
	}


