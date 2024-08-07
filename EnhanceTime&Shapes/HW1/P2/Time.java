// The Time class that represents times
// Do not make any changes to this file!

import java.io.*;

public class Time implements Serializable
{
    // instance variables
    protected int m_hour;
    protected int m_minute;
    protected int m_second;
    protected boolean m_am; // if true, it represents am, otherwise it means pm
    
    // copy constructor
    public Time(Time o)
    {
        m_hour = o.m_hour;
        m_minute = o.m_minute;
        m_second = o.m_second;
        m_am = o.m_am;
    }
    
    // constructor
    public Time(int hour, int minute, int second, boolean am)
    {
        m_hour = hour;
        m_minute = minute;
        m_second = second;
        m_am = am;
    }
    
    // observers
    public int getHour()
    {
        return m_hour;
    }
    
    public int getMinute()
    {
        return m_minute;
    }
    
    public int getSecond()
    {
        return m_second;
    }

    public boolean isAm()
    {
        return m_am;
    }

    // return this time as a String
    @Override
    public String toString()
    {
        return String.format("%02d:%02d:%02d %s", m_hour, m_minute, m_second, (m_am ? "AM" : "PM"));
    }
}
