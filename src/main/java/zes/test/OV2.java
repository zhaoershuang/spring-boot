package zes.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class OV2 extends Ov {
	public static void syH() {
		System.out.println(222);
	}
	public static void main(String[] args) {
		Ov v = new Ov();
		v.syH();
		OV2 v2 = new OV2();
		v2.syH();
		v2.syH("hello");
		
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(cal.HOUR, 1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String dateStr = sdf.format(cal.getTime());
		System.err.println(dateStr);
	}
	public static void syH(String Str) {
		System.out.println(Str);
	}
}
