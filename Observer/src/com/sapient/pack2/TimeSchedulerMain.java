package com.sapient.pack2;

import java.util.Timer;

public class TimeSchedulerMain {

	public static void main(String[] args) {
		ReportGenerator generator=new ReportGenerator();
		Timer timer=new Timer();
		timer.scheduleAtFixedRate(generator, 2000, 4000);

	}

}
