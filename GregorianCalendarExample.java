import java.util.GregorianCalendar;

public class GregorianCalendarExample {
    public static void main(String[] args) {
        // 任務 1: 顯示目前的年份、月份及日期
        GregorianCalendar currentCalendar = new GregorianCalendar();
        int currentYear = currentCalendar.get(GregorianCalendar.YEAR);
        int currentMonth = currentCalendar.get(GregorianCalendar.MONTH) + 1; // 月份從0開始
        int currentDay = currentCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("目前日期: " + currentYear + "-" + currentMonth + "-" + currentDay);

        // 任務 2: 設定時間為 1234567898765L，顯示對應的年份、月份及日期
        GregorianCalendar specifiedCalendar = new GregorianCalendar();
        specifiedCalendar.setTimeInMillis(1234567898765L);

        int specifiedYear = specifiedCalendar.get(GregorianCalendar.YEAR);
        int specifiedMonth = specifiedCalendar.get(GregorianCalendar.MONTH) + 1; // 月份從0開始
        int specifiedDay = specifiedCalendar.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("指定時間 (1234567898765L) 對應的日期: " + specifiedYear + "-" + specifiedMonth + "-" + specifiedDay);
    }
}