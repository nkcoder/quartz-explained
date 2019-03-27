package org.quartz.impl.calendar;

import junit.framework.TestCase;

public class BaseCalendarTest extends TestCase {

    public void testClone() {
        BaseCalendar base = new BaseCalendar();
        BaseCalendar clone = (BaseCalendar) base.clone();

        assertEquals(base.getDescription(), clone.getDescription());
        assertEquals(base.getBaseCalendar(), clone.getBaseCalendar());
        assertEquals(base.getTimeZone(), clone.getTimeZone());
    }


}
