package com.yogesh.util;

import java.util.Comparator;

import com.yogesh.entity.ReportEntity;

public class ReportEntityComparator implements Comparator<ReportEntity> {

	@Override
	public int compare(ReportEntity arg0, ReportEntity arg1) {
		// TODO Auto-generated method stub

		if (arg0.getArrivalDate().before(arg1.getArrivalDate())) {
			return -1;
		} else if (arg0.getArrivalDate().after(arg1.getArrivalDate())) {
			return 1;
		} else if (arg0.getArrivalDate().equals(arg1.getArrivalDate())) {
			if (arg0.getDepartureDate().before(arg1.getDepartureDate())) {
				return -1;
			} else if (arg0.getDepartureDate().after(arg1.getDepartureDate())) {
				return 1;
			} else if (arg0.getDepartureDate().equals(arg1.getDepartureDate())) {
				if (arg0.getCerti() > arg1.getCerti()) {
					return 1;
				} else if (arg0.getCerti() < arg1.getCerti()) {
					return -1;
				} else if (arg0.getCerti() == arg1.getCerti())
					return 0;
			}
		}
		return 0;
	}

	public static Comparator<ReportEntity> getReportEntityComparator(){
		return new Comparator<ReportEntity>() {

			@Override
			public int compare(ReportEntity arg0, ReportEntity arg1) {
				// TODO Auto-generated method stub
				if(arg0.getArrivalDate()==null || arg0.getDepartureDate() == null || arg0.getCerti()==0){
					return 1;
				}
				if(arg1.getArrivalDate()==null || arg1.getDepartureDate() == null || arg1.getCerti()==0)
					return -1;
				if (arg0.getArrivalDate().before(arg1.getArrivalDate())) {
					return -1;
				} else if (arg0.getArrivalDate().after(arg1.getArrivalDate())) {
					return 1;
				} else if (arg0.getArrivalDate().equals(arg1.getArrivalDate())) {
					if (arg0.getDepartureDate().before(arg1.getDepartureDate())) {
						return -1;
					} else if (arg0.getDepartureDate().after(arg1.getDepartureDate())) {
						return 1;
					} else if (arg0.getDepartureDate().equals(arg1.getDepartureDate())) {
						if (arg0.getCerti() > arg1.getCerti()) {
							return 1;
						} else if (arg0.getCerti() < arg1.getCerti()) {
							return -1;
						} else if (arg0.getCerti() == arg1.getCerti())
							return 0;
					}
				}
				return 0;
			}
		};
	}
	
}
