//Michael Roy

public class EnhancedTime extends Time {
    // copy constructor
    public EnhancedTime(Time o) {
        super(o.m_hour, o.m_minute, o.m_second, o.m_am);
    }

    // constructor
    public EnhancedTime(int hour, int minute, int second, boolean am) {
        super(hour, minute, second, am);
    }

    // This method adds a particular number of seconds to the current time. The
    // changes should
    // be left on the current time object. Be sure to take care of the switch
    // between morning
    // and afternoon.
    
    // hours in a day = 24
    // minutes in an hour = 60
    // seconds in a minute = 60 
    // interval of AM/PM every 12 hours
    // when m_am is true its AM 
    // when m_am is false is PM  
    /* 
       My Code Logic
            1. Adding 24hr won't change the time, so i removed all the 24hour multiples from seconds
            2. Now number of seconds is less than 24 hours
            3. Adding 12 hours to time will change am-pm. So i removed 12 hours from number of seconds and changed am-pm
            4. Now number of seconds is less than 12 hours
            5. I added the number of hours, and if it crosses 12, i changed number of hours and am-pm accordingly
            6. Now number of seconds is less than 60 minutes
            7. I added the minutes and if they cross 60 i added 1 hour 
            8. Now number of seconds is less than 60
            9. I added the seconds, and if they cross 60, added 1 minute and if minutes become 60, i added one hour
    */
    public void addSeconds(int numSeconds) {
        numSeconds = numSeconds % (24 * 60 * 60);

        if (numSeconds >= 12 * 60 * 60) {
            super.m_am = !super.m_am;
            numSeconds -= 12 * 60 * 60;
        }

        int numHours = numSeconds / (60 * 60);
        if (numHours > 0) {
            if (super.m_hour == 12) {
                super.m_hour = numHours;
            } else {
                super.m_hour += numHours;
                if (super.m_hour >= 12) {
                    super.m_am = !super.m_am;
                    if (super.m_hour > 12) {
                        super.m_hour -= 12;
                    }
                }
            }
        }
        numSeconds = numSeconds % (60 * 60);

        int numMinutes = numSeconds / 60;
        super.m_minute += numMinutes;
        if (super.m_minute >= 60) {
            super.m_minute -= 60;
            if (super.m_hour == 12) {
                super.m_hour = 1;
            } else {
                super.m_hour += 1;
                if (super.m_hour >= 12) {
                    super.m_am = !super.m_am;
                    if (super.m_hour > 12) {
                        super.m_hour -= 12;
                    }
                }
            }
        }
        numSeconds = numSeconds % 60;

        super.m_second += numSeconds;
        if (super.m_second >= 60) {
            super.m_second -= 60;
            super.m_minute += 1;
            if (super.m_minute >= 60) {
                super.m_minute -= 60;
                if (super.m_hour == 12) {
                    super.m_hour = 1;
                } else {
                    super.m_hour += 1;
                    if (super.m_hour >= 12) {
                        super.m_am = !super.m_am;
                        if (super.m_hour > 12) {
                            super.m_hour -= 12;
                        }
                    }
                }
            }
        }

    }
}
