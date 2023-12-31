package org.kosta.jeongdab.tou.model;

import java.util.Date;

public class ServiceBoardVO {
	private long serviceBoardNo;
	private String serviceBoardTitle;
	private String serviceBoardContent;
	private Date serviceBoardCreateDate;
	private long serviceBoardHits;
	private String nation;
	private String memberProfile;
	private String serviceBoardImg;
	public ServiceBoardVO() {
		super();
		
	}
	public ServiceBoardVO(long serviceBoardNo, String serviceBoardTitle, String serviceBoardContent,
			Date serviceBoardCreateDate, long serviceBoardHits, String nation, String memberProfile,
			String serviceBoardImg) {
		super();
		this.serviceBoardNo = serviceBoardNo;
		this.serviceBoardTitle = serviceBoardTitle;
		this.serviceBoardContent = serviceBoardContent;
		this.serviceBoardCreateDate = serviceBoardCreateDate;
		this.serviceBoardHits = serviceBoardHits;
		this.nation = nation;
		this.memberProfile = memberProfile;
		this.serviceBoardImg = serviceBoardImg;
	}
	public long getServiceBoardNo() {
		return serviceBoardNo;
	}
	public void setServiceBoardNo(long serviceBoardNo) {
		this.serviceBoardNo = serviceBoardNo;
	}
	public String getServiceBoardTitle() {
		return serviceBoardTitle;
	}
	public void setServiceBoardTitle(String serviceBoardTitle) {
		this.serviceBoardTitle = serviceBoardTitle;
	}
	public String getServiceBoardContent() {
		return serviceBoardContent;
	}
	public void setServiceBoardContent(String serviceBoardContent) {
		this.serviceBoardContent = serviceBoardContent;
	}
	public Date getServiceBoardCreateDate() {
		return serviceBoardCreateDate;
	}
	public void setServiceBoardCreateDate(Date serviceBoardCreateDate) {
		this.serviceBoardCreateDate = serviceBoardCreateDate;
	}
	public long getServiceBoardHits() {
		return serviceBoardHits;
	}
	public void setServiceBoardHits(long serviceBoardHits) {
		this.serviceBoardHits = serviceBoardHits;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	public String getMemberProfile() {
		return memberProfile;
	}
	public void setMemberProfile(String memberProfile) {
		this.memberProfile = memberProfile;
	}
	public String getServiceBoardImg() {
		return serviceBoardImg;
	}
	public void setServiceBoardImg(String serviceBoardImg) {
		this.serviceBoardImg = serviceBoardImg;
	}
	@Override
	public String toString() {
		return "ServiceBoardVO [serviceBoardNo=" + serviceBoardNo + ", serviceBoardTitle=" + serviceBoardTitle
				+ ", serviceBoardContent=" + serviceBoardContent + ", serviceBoardCreateDate=" + serviceBoardCreateDate
				+ ", serviceBoardHits=" + serviceBoardHits + ", nation=" + nation + ", memberProfile=" + memberProfile
				+ ", serviceBoardImg=" + serviceBoardImg + "]";
	}
	
}
