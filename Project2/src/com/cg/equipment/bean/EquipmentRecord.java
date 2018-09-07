package com.cg.equipment.bean;

import java.util.Date;


public class EquipmentRecord {
	
	private UserBean user;
	private Location location;
	private String purchaseMethod;
	private String useStatus;
	private boolean auditIndicator;
	private Date auditDate;
	private String comments;
	private String stockLocation;
	
	public UserBean getUser() {
		return user;
	}
	public void setUser(UserBean user) {
		this.user = user;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public String getPurchaseMethod() {
		return purchaseMethod;
	}
	public void setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}
	public String getUseStatus() {
		return useStatus;
	}
	public void setUseStatus(String useStatus) {
		this.useStatus = useStatus;
	}
	public boolean isAuditIndicator() {
		return auditIndicator;
	}
	public void setAuditIndicator(boolean auditIndicator) {
		this.auditIndicator = auditIndicator;
	}
	public Date getAuditDate() {
		return auditDate;
	}
	public void setAuditDate(Date auditDate) {
		this.auditDate = auditDate;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String getStockLocation() {
		return stockLocation;
	}
	public void setStockLocation(String stockLocation) {
		this.stockLocation = stockLocation;
	}
	
	

}
