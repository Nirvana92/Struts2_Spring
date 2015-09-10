package com.nirvana.action;

import com.nirvana.service.EditService;
import com.opensymphony.xwork2.ActionSupport;

public class EditAction extends ActionSupport {
	private static final long serialVersionUID = 2624089768363416585L;
	private EditService editService;

	@Override
	public String execute() throws Exception {
		editService.edit();
		return SUCCESS;
	}

	public void setEditService(EditService editService) {
		this.editService = editService;
	}
}
