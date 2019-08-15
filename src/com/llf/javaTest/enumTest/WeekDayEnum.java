package com.llf.javaTest.enumTest;

public enum WeekDayEnum {
    SUN("Sunday", 0),
    MON("Monday", 1),
    TUE("Tuesday", 2),
    WED("Wednesday", 3),
    THU("Thursday", 4),
    FRI("Friday", 5),
    SAT("Saturday", 6);

    private String strWeekDay;
    private int intWeekDay;
    
    private WeekDayEnum(String str,int intValue) {
    	strWeekDay = str;
    	intWeekDay = intValue;
    }
    
    public String getStrWeekDay() {
		return strWeekDay;
	}

	public int getIntWeekDay() {
		return intWeekDay;
	}

	public static WeekDayEnum valueof(String _week) {
        if (_week == null || _week.isEmpty()) {
            return SUN;
        }
        for (WeekDayEnum week : WeekDayEnum.values()) {
            if (_week.equalsIgnoreCase(week.getStrWeekDay())) {
                return week;
            }
        }
        return SUN;
    }
}
