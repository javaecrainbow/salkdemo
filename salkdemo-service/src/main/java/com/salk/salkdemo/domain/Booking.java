package com.salk.salkdemo.domain;

import java.util.Date;

public class Booking {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.ID
	 * @mbggenerated
	 */
	private Long id;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.VERSION
	 * @mbggenerated
	 */
	private Integer version=0;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.db_type
	 * @mbggenerated
	 */
	private String dbType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.lang_type
	 * @mbggenerated
	 */
	private String langType;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.mail
	 * @mbggenerated
	 */
	private String mail;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.mark
	 * @mbggenerated
	 */
	private String mark;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.telephone
	 * @mbggenerated
	 */
	private String telephone;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.title
	 * @mbggenerated
	 */
	private String title;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.auditor
	 * @mbggenerated
	 */
	private String auditor;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.booking_time
	 * @mbggenerated
	 */
	private Date bookingTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.ip
	 * @mbggenerated
	 */
	private String ip;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.update_time
	 * @mbggenerated
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.update_name
	 * @mbggenerated
	 */
	private String updateName;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column booking.contents
	 * @mbggenerated
	 */
	private String contents;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.ID
	 * @return  the value of booking.ID
	 * @mbggenerated
	 */
	public Long getId() {
		return id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.ID
	 * @param id  the value for booking.ID
	 * @mbggenerated
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.VERSION
	 * @return  the value of booking.VERSION
	 * @mbggenerated
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.VERSION
	 * @param version  the value for booking.VERSION
	 * @mbggenerated
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.db_type
	 * @return  the value of booking.db_type
	 * @mbggenerated
	 */
	public String getDbType() {
		return dbType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.db_type
	 * @param dbType  the value for booking.db_type
	 * @mbggenerated
	 */
	public void setDbType(String dbType) {
		this.dbType = dbType == null ? null : dbType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.lang_type
	 * @return  the value of booking.lang_type
	 * @mbggenerated
	 */
	public String getLangType() {
		return langType;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.lang_type
	 * @param langType  the value for booking.lang_type
	 * @mbggenerated
	 */
	public void setLangType(String langType) {
		this.langType = langType == null ? null : langType.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.mail
	 * @return  the value of booking.mail
	 * @mbggenerated
	 */
	public String getMail() {
		return mail;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.mail
	 * @param mail  the value for booking.mail
	 * @mbggenerated
	 */
	public void setMail(String mail) {
		this.mail = mail == null ? null : mail.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.mark
	 * @return  the value of booking.mark
	 * @mbggenerated
	 */
	public String getMark() {
		return mark;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.mark
	 * @param mark  the value for booking.mark
	 * @mbggenerated
	 */
	public void setMark(String mark) {
		this.mark = mark == null ? null : mark.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.telephone
	 * @return  the value of booking.telephone
	 * @mbggenerated
	 */
	public String getTelephone() {
		return telephone;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.telephone
	 * @param telephone  the value for booking.telephone
	 * @mbggenerated
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone == null ? null : telephone.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.title
	 * @return  the value of booking.title
	 * @mbggenerated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.title
	 * @param title  the value for booking.title
	 * @mbggenerated
	 */
	public void setTitle(String title) {
		this.title = title == null ? null : title.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.auditor
	 * @return  the value of booking.auditor
	 * @mbggenerated
	 */
	public String getAuditor() {
		return auditor;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.auditor
	 * @param auditor  the value for booking.auditor
	 * @mbggenerated
	 */
	public void setAuditor(String auditor) {
		this.auditor = auditor == null ? null : auditor.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.booking_time
	 * @return  the value of booking.booking_time
	 * @mbggenerated
	 */
	public Date getBookingTime() {
		return bookingTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.booking_time
	 * @param bookingTime  the value for booking.booking_time
	 * @mbggenerated
	 */
	public void setBookingTime(Date bookingTime) {
		this.bookingTime = bookingTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.ip
	 * @return  the value of booking.ip
	 * @mbggenerated
	 */
	public String getIp() {
		return ip;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.ip
	 * @param ip  the value for booking.ip
	 * @mbggenerated
	 */
	public void setIp(String ip) {
		this.ip = ip == null ? null : ip.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.update_time
	 * @return  the value of booking.update_time
	 * @mbggenerated
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.update_time
	 * @param updateTime  the value for booking.update_time
	 * @mbggenerated
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.update_name
	 * @return  the value of booking.update_name
	 * @mbggenerated
	 */
	public String getUpdateName() {
		return updateName;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.update_name
	 * @param updateName  the value for booking.update_name
	 * @mbggenerated
	 */
	public void setUpdateName(String updateName) {
		this.updateName = updateName == null ? null : updateName.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column booking.contents
	 * @return  the value of booking.contents
	 * @mbggenerated
	 */
	public String getContents() {
		return contents;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column booking.contents
	 * @param contents  the value for booking.contents
	 * @mbggenerated
	 */
	public void setContents(String contents) {
		this.contents = contents == null ? null : contents.trim();
	}
}