package com.EmployeeManagement.dto;

public class CommonDto<T>
{
private String status;
private T responseData;
private T responseType;
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public Object getResponseData() {
	return responseData;
}
public void setResponseData(T responseData) {
	this.responseData = responseData;
}
public Object getResponseType() {
	return responseType;
}
public void setResponseType(T responseType) {
	this.responseType = responseType;
}





}
