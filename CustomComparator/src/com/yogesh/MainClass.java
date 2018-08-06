package com.yogesh;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.yogesh.entity.ReportEntity;
import com.yogesh.util.ReportEntityComparator;

public class MainClass {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String[] arrival_dates = { "06/21/2011", "06/22/2011", "06/22/2011",
				"06/22/2011", "06/17/2011", "06/17/2011", "06/17/2011",
				"06/17/2011", "06/17/2011", "06/17/2011", "06/17/2011",
				"06/17/2011", "06/17/2011", "06/17/2011", "06/17/2011",
				"06/17/2011", "06/22/2011", "06/21/2011", "06/16/2011",
				"06/16/2011", "06/16/2011", "06/16/2011", "06/17/2011",
				"06/16/2011", "06/17/2011", "06/16/2011", "06/17/2011",
				"06/16/2011", "06/16/2011", "06/16/2011", "06/16/2011",
				"06/16/2011", "06/16/2011" };

		String[] departure_dates = { "06/22/2011", "06/23/2011", "06/23/2011",
				"06/23/2011", "06/19/2011", "06/20/2011", "06/20/2011",
				"06/20/2011", "06/20/2011", "06/20/2011", "06/20/2011",
				"06/20/2011", "06/20/2011", "06/20/2011", "06/20/2011",
				"06/22/2011", "06/23/2011", "06/22/2011", "06/18/2011",
				"06/19/2011", "06/17/2011", "06/18/2011", "06/18/2011",
				"06/17/2011", "06/18/2011", "06/17/2011", "06/18/2011",
				"06/17/2011", "06/18/2011", "06/18/2011", "06/17/2011",
				"06/18/2011", "06/17/2011" };

		int[] cert = { 736007389, 736007388, 736007387, 736007386, 736007382,
				736007381, 736007378, 736007372, 736007371, 736007370,
				736007369, 736007368, 736007367, 736007366, 736007365,
				736007355, 736007352, 736007350, 736006842, 736006838,
				736006834, 736006818, 736006815, 736006741, 736006740,
				736006739, 736006738, 736006737, 736006735, 736006734,
				736006732, 736006731, 736006730};
		
		ReportEntity report;
		Date arrival = null;
		Date depart = null;
		for(int i = 0; i<cert.length;i++){
			try {
				arrival = sdf.parse(arrival_dates[i]);
				depart = sdf.parse(departure_dates[i]);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			report = new ReportEntity(arrival, depart, cert[i]);
			list.add(report);
		}
		report = new ReportEntity(null, null, 0);
		list.add(report);
		System.out.println("List is : "+list);
		//Collections.sort(list, new ReportEntityComparator());
		Collections.sort(list, ReportEntityComparator.getReportEntityComparator());
		
		System.out.println("After Sorting : "+list);

	}
}
