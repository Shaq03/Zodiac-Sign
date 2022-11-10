import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		ZodiacSigns zodiac = new ZodiacSigns();
		
		System.out.println("Welcome to the zodiac sign program!");
		
		
		
		
		System.out.println("Enter month(1-12) and day when you were born:");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Month(1-12): ");
		int month;
		month = scan.nextInt();
		
		while(month > 12) {
			
			System.err.println("There are only 12 months in the year!");
			month = scan.nextInt();
			
		}
		
		System.out.println("Day: ");
		int day;
		day = scan.nextInt();
	
		if(month == 1) {
			
			while(day > 31) {
				
				System.err.println("There are only 31 days in January!");
				day = scan.nextInt();
				
			}
			
			while(day <= 19) {
				zodiac.capricorn();
				break;
			}
			while(day > 19 && day <= 31) {
				zodiac.aquarius();
				break;
			}
			
		}
		else if(month == 2) {
			
             while(day > 29) {
				
				System.err.println("There are only 29 days in February!");
				day = scan.nextInt();
				
			}
			
			while(day <= 18) {
				zodiac.aquarius();
				break;
			}
			while(day > 18 && day <= 29) {
				zodiac.pisces();
				break;
			
		}
			
	}
		

		else if(month == 3) {
			
            while(day > 31) {
				
				System.err.println("There are only 31 days in March!");
				day = scan.nextInt();
				
			}
			
			while(day <= 20) {
				zodiac.pisces();
				break;
			}
			while(day > 20 && day <= 31) {
				zodiac.aries();
				break;
			
		}
			
	}
				

		else if(month == 4) {
			
			 while(day > 30) {
					
					System.err.println("There are only 30 days in April!");
					day = scan.nextInt();
					
				}
			
			while(day <= 19) {
				zodiac.aries();
				break;
			}
			while(day > 19 && day <= 30) {
				zodiac.taurus();
				break;
			
		}
	
}

		else if(month == 5) {
			
			 while(day > 31) {
					
					System.err.println("There are only 31 days in May!");
					day = scan.nextInt();
					
				}
			
			while(day <= 20) {
				zodiac.taurus();
				break;
			}
			while(day > 20 && day <= 31) {
				zodiac.gemini();
				break;
			
		}
	
}

		else if(month == 6) {
			
			while(day > 30) {
				
				System.err.println("There are only 30 days in June!");
				day = scan.nextInt();
				
			}
			
			while(day <= 20) {
				zodiac.gemini();
				break;
			}
			while(day > 20 && day <= 30) {
				zodiac.cancer();
				break;
			
		}
	
}

		else if(month == 7) {
			
            while(day > 31) {
				
				System.err.println("There are only 31 days in July!");
				day = scan.nextInt();
				
			}
			
			while(day <= 22) {
				zodiac.cancer();
				break;
			}
			while(day > 22 && day <= 31) {
				zodiac.leo();
				break;
			
		}
	
}

		else if(month == 8) {
			
			 while(day > 31) {
					
					System.err.println("There are only 31 days in August!");
					day = scan.nextInt();
					
				}
			
			while(day <= 22) {
				zodiac.leo();
				break;
			}
			while(day > 22 && day <= 31) {
				zodiac.virgo();
				break;
			
		}
	
}

		else if(month == 9) {
			
			while(day > 30) {
				
				System.err.println("There are only 30 days in September!");
				day = scan.nextInt();
				
			}
		
			
			while(day <= 23) {
				zodiac.virgo();
				break;
			}
			while(day > 23 && day <= 30) {
				zodiac.libra();
				break;
			
		}
	
}

		
        else if(month == 10) {
        	
                while(day > 31) {
				
				System.err.println("There are only 31 days in Octomber!");
				day = scan.nextInt();
				
			}
        	
        	while(day <= 22) {
				zodiac.libra();
				break;
			}
			while(day > 22 && day <= 31) {
				zodiac.scorpio();
				break;
			
		}
	
}
		

        else if(month == 11) {
        	
            while(day > 30) {
				
				System.err.println("There are only 30 days in November!");
				day = scan.nextInt();
				
			}
        	
        	while(day <= 21) {
				zodiac.scorpio();
				break;
			}
			while(day > 21 && day <= 30) {
				zodiac.sagittarius();
				break;
			
		}
	
}

        else if(month == 12) {
        	
             while(day > 30) {
				
				System.err.println("There are only 31 days in December!");
				day = scan.nextInt();
				
			}
        	
        	while(day <= 21) {
				zodiac.sagittarius();
				break;
			}
			while(day > 21 && day <= 31) {
				zodiac.capricorn();
				break;
			
		}
	
}
		
}
}