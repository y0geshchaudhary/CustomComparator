package com.yogesh.entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ReportEntity /*implements Comparable*/{

		private Date arrivalDate;
		private Date departureDate;
		private int certi;
		public Date getArrivalDate() {
			return arrivalDate;
		}
		public void setArrivalDate(Date arrivalDate) {
			this.arrivalDate = arrivalDate;
		}
		public Date getDepartureDate() {
			return departureDate;
		}
		public void setDepartureDate(Date departureDate) {
			this.departureDate = departureDate;
		}
		public int getCerti() {
			return certi;
		}
		public void setCerti(int certi) {
			this.certi = certi;
		}
		public ReportEntity(Date arrivalDate, Date departureDate, int certi) {
			super();
			this.arrivalDate = arrivalDate;
			this.departureDate = departureDate;
			this.certi = certi;
		}
		@Override
		public String toString() {
			//SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
			return "ReportEntity [arrivalDate=" + arrivalDate
					+ ", departureDate=" + departureDate + ", certi=" + certi
					+ "]\n";
		}
		//@Override
		/*public int compareTo(Object o) {
			
			ReportEntity arg0 = this;
			ReportEntity arg1 = (ReportEntity)o;
			
			if (arg0.getArrivalDate().before(arg1.getArrivalDate())) {
				return 1;
			} else if (arg0.getArrivalDate().after(arg1.getArrivalDate())) {
				return -1;
			} else if (arg0.getArrivalDate().equals(arg1.getArrivalDate())) {
				if (arg0.getDepartureDate().before(arg1.getDepartureDate())) {
					return 1;
				} else if (arg0.getDepartureDate().after(arg1.getDepartureDate())) {
					return -1;
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
		}*/
		
		 
		
		
	
}
