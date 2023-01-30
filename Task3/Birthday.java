package Task3;

import java.util.GregorianCalendar;

public class Birthday {

    public static void yourBirthday(GregorianCalendar birthday){

        GregorianCalendar gregorianCalendar = new GregorianCalendar();

        long years = 0;
        long month = 0;
        long days = 0;
        long hours = gregorianCalendar.get(gregorianCalendar.HOUR_OF_DAY);
        long minutes = gregorianCalendar.get(gregorianCalendar.MINUTE);
        long seconds = gregorianCalendar.get(gregorianCalendar.SECOND);

        if((gregorianCalendar.get(gregorianCalendar.DAY_OF_YEAR)) >= (birthday.get(birthday.DAY_OF_YEAR))) {
            years = gregorianCalendar.get(gregorianCalendar.YEAR) - birthday.get(birthday.YEAR);
            month = gregorianCalendar.get(gregorianCalendar.MONTH) - birthday.get(birthday.MONTH);
        }
        else{
            years = gregorianCalendar.get(gregorianCalendar.YEAR) - birthday.get(birthday.YEAR) - 1;
            month = 12 - (birthday.get(birthday.MONTH));
        }

        if(gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH) < birthday.get(birthday.DAY_OF_MONTH)){
            days = gregorianCalendar.getActualMaximum(gregorianCalendar.DAY_OF_MONTH) - (birthday.get(birthday.DAY_OF_MONTH)
                    - gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH));
        }
        else {
            days = gregorianCalendar.get(gregorianCalendar.DAY_OF_MONTH) - birthday.get(birthday.DAY_OF_MONTH);
        }

        System.out.println("You turned:"
                                + "\n" + years + " years;" + "\n" + month + " months;"
                                + "\n" + days + " days;" + "\n" + hours + " hours;" + "\n"
                                    + minutes + " minutes;" + "\n" + seconds + " seconds.");

    }

    public static void main(String[] args) {
        int year = 1996;
        int month = 1;
        int day = 15;

        GregorianCalendar myBirthday = new GregorianCalendar(year, month-1, day);
        yourBirthday(myBirthday);
    }
}
