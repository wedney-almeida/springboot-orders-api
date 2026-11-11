package com.wedneyalmeida.course.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timesTemp;
	private Integer status;
	private String erro;
	private String message;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Instant timesTemp, Integer status, String erro, String message, String path) {
		super();
		this.timesTemp = timesTemp;
		this.status = status;
		this.erro = erro;
		this.message = message;
		this.path = path;
	}

	public Instant getTimesTemp() {
		return timesTemp;
	}

	public void setTimesTemp(Instant timesTemp) {
		this.timesTemp = timesTemp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getErro() {
		return erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
}
