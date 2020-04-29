public class DateTime {

    // DO NOT MODIFY THE INSTANCE VARIABLES
    int year;   // 1000 - 3000
    int month;  // 01 - 12
    int day;    // 01 - 31
    int hours;  // 00 - 23
    int mins;   // 00 - 59

    /**
     * Constructor for DateTime
     *
     * @param year  the year value for DateTime
     * @param month the month value for DateTime
     * @param day   the day value for DateTime
     * @param hours the hours value for DateTime
     * @param mins  the mins value for DateTime
     */
    public DateTime(int year, int month, int day, int hours, int mins) {
        //TODO: implement this method
    }

    /**
     * Constructor that takes in the date time in a string format
     * string format: 2020-04-22@16:15
     *
     * @param dateTime the string representation of date and time
     */
    public DateTime(String dateTime) {
        //TODO: implement this method
    }

    /**
     * Method to get the year
     *
     * @return the value of year
     */
    public int getYear() {
        //TODO: implement this method
        return 0;
    }

    /**
     * Method to get the month
     *
     * @return the value of month
     */
    public int getMonth() {
        //TODO: implement this method
        return 0;
    }

    /**
     * Method to get the day
     *
     * @return the value of day
     */
    public int getDay() {
        //TODO: implement this method
        return 0;
    }

    /**
     * Method to get the hours
     *
     * @return the value of hours
     */
    public int getHours() {
        //TODO: implement this method
        return 0;
    }

    /**
     * Method to get the minutes
     *
     * @return the value of minutes
     */
    public int getMins() {
        //TODO: implement this method
        return 0;
    }

    /**
     * toString method to print the date and time
     *
     * @return A string representation of the DateTime
     */
    @Override
    public String toString() {
        //TODO: implement this method
        return null;
    }

    /**
     * Method to compare the given dateTime with this DateTime
     *
     * @param dateTime DateTime value that this
     *                 instance must be compared with
     * @return         -1 if this DateTime is earlier (smaller), 0 if
     *                 they are same, 1 if this DateTime comes later
     *                 (greater)
     */
    public int compare(DateTime dateTime) {
        //TODO: implement this method
        return 0;
    }

    /**
     * equals method to check for DateTime equality
     *
     * @param other The other object to check the equality
     *
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object other) {
        //TODO: implement this method
        return false;
    }
}
