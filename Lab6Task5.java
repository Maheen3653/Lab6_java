import java.util.Scanner;
public class Lab6Task5{

    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            return true;
        else
            return false;
    }


    public static int DaysInMonth(int month, int year) {
        if (month == 1 || month == 3 || month == 5 || month == 7 ||
            month == 8 || month == 10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (month == 2)
		if (isLeapYear(year))
			return 29;
		else 
			return 28;
	  else 
		return 0;}

    public static String getMonthName(int month) {

        if (month == 1)      return "January";
        else if (month == 2) return "February";
        else if (month == 3) return "March";
        else if (month == 4) return "April";
        else if (month == 5) return "May";
        else if (month == 6) return "June";
        else if (month == 7) return "July";
   	else if (month == 8) return "August";
        else if (month == 9) return "September";
        else if (month == 10) return "October";
        else if (month == 11) return "November";
        else return "December";
    }

    public static int printMonth(int year, int month, int startDay) {
        System.out.println("\n\n\t" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++)
            System.out.print("    ");

        int daysInMonth = DaysInMonth(month, year);
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0)
                System.out.println();
        }

	  //This statement is added to return day index for next month
        return (startDay + daysInMonth) % 7;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = input.nextInt();
System.out.print("Enter the first day of the year (0 for Sunday, 1 for Monday...6 for Saturday): ");
        int firstDay = input.nextInt();

        int startDay = firstDay;
        for (int month = 1; month <= 12; month++) {
            startDay = printMonth(year, month, startDay);
        }

        input.close();
  }}
