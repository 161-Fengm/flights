package pers.flights.model;

import java.util.Date;

public class Order {
	
	private Integer id;//编号
	  
	private String orderNo;//订单号
	  
	private Integer flightId;//航班编号
	  
	private Integer ticketPriceId;//票价编号
	  
	private Date orderTime;//预定时间
	  
	private String person;//联系人
	  
	private String phone;//联系电话
	  
	private String orderStatus;//订单状态
	  
	private Integer customerId;//客户编号
	  
	private Date createTime;//创建时间
	  
	public Integer getId() {
		 return id;
	}
	
	public void setId(Integer id) {
		 this.id = id;
	}
	
	public String getOrderNo() {
		 return orderNo;
	}
	
	public void setOrderNo(String orderNo) {
		 this.orderNo = orderNo;
	}
	
	public Integer getFlightId() {
		 return flightId;
	}
	
	public void setFlightId(Integer flightId) {
		 this.flightId = flightId;
	}
	
	public Integer getTicketPriceId() {
		 return ticketPriceId;
	}
	
	public void setTicketPriceId(Integer ticketPriceId) {
		 this.ticketPriceId = ticketPriceId;
	}
	
	public Date getOrderTime() {
		 return orderTime;
	}
	
	public void setOrderTime(Date orderTime) {
		 this.orderTime = orderTime;
	}
	
	public String getPerson() {
		 return person;
	}
	
	public void setPerson(String person) {
		 this.person = person;
	}
	
	public String getPhone() {
		 return phone;
	}
	
	public void setPhone(String phone) {
		 this.phone = phone;
	}
	
	public String getOrderStatus() {
		 return orderStatus;
	}
	
	public void setOrderStatus(String orderStatus) {
		 this.orderStatus = orderStatus;
	}
	
	public Integer getCustomerId() {
		 return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		 this.customerId = customerId;
	}
	
	public Date getCreateTime() {
		 return createTime;
	}
	
	public void setCreateTime(Date createTime) {
		 this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", orderNo=" + orderNo + ", flightId="
				+ flightId + ", ticketPriceId=" + ticketPriceId
				+ ", orderTime=" + orderTime + ", person=" + person
				+ ", phone=" + phone + ", orderStatus=" + orderStatus
				+ ", customerId=" + customerId + ", createTime=" + createTime
				+ "]";
	}
	
}