package xyz.lidaning.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public static int calculateMonthsIn2Dates(Date date1, Date date2) {
        if(date1==null || date2==null)
            return 1;
        if(date2.before(date1))
            return 1;
        SimpleDateFormat sdfYYYY = new SimpleDateFormat("yyyy");
        SimpleDateFormat sdfMM = new SimpleDateFormat("MM");
        int year1=Integer.valueOf(sdfYYYY.format(date1));
        int year2=Integer.valueOf(sdfYYYY.format(date2));
        int month1=Integer.valueOf(sdfMM.format(date1));
        int month2=Integer.valueOf(sdfMM.format(date2));
        int result = (year2-year1)*12+month2-month1+1;
        return result;
    }

    public static float getDaysFromDate1ToDate2OrToToday(Date date1, Date date2) throws Exception {
        if(date1==null)
            throw new Exception("数据异常");
        if(date2==null)
            date2 = new Date();
        Calendar calendar1=Calendar.getInstance();
        calendar1.setTime(date1);
        Calendar calendar2=Calendar.getInstance();
        calendar2.setTime(date2);
        return (calendar2.getTimeInMillis()-calendar1.getTimeInMillis())/(1000*3600*24);
    }
}
