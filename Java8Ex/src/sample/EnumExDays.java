package sample;

/**
 * Enum in java is a data type that contains fixed set of constants.

It can be used for days of the week 
(SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY and SATURDAY) , 
directions (NORTH, SOUTH, EAST and WEST) etc.
 The java enum constants are static and final . 
 * 
 * enum improves type safety, enum can be taversed.
 * enum can have fields, constructors and methods
 * 
 * public enum Season { WINTER, SPRING, SUMMER, FALL } ;

 * @author bhaskar
 *
 */
public enum EnumExDays {
	
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;

	public static void main(String[] args) {
		EnumExDays day = EnumExDays.FRIDAY;
		
		switch (day) {
        case MONDAY:
            System.out.println("Mondays are bad.");
            break;
                
        case FRIDAY:
            System.out.println("Fridays are better.");
            break;
                     
        case SATURDAY: case SUNDAY:
            System.out.println("Weekends are best.");
            break;
                    
        default:
            System.out.println("Midweek days are so-so.");
            break;
    }
		
		EnumExDays x = EnumExDays.SUNDAY;
		
		if(x == EnumExDays.SUNDAY) {     } 
		
		// I donot compare sring 
		// i compare with enum value directly.
		
		  

	}

}
