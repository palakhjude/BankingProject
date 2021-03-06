/**
 * 
 */
package com.inb.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.inb.rest.entity.AdminPOJO;
import com.inb.rest.entity.LogoutDetails;
import com.inb.service.interfaces.AdminService;

/**
 * @author Navin Maheshwari
 *
 */
@RequestMapping(value ="/admin")
@CrossOrigin
@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	/*--------------Login Admin--------------*/
	@RequestMapping(value ="/login", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String loginAdmin(@RequestBody AdminPOJO adminPOJO) throws JsonProcessingException {
		return adminService.login(adminPOJO.getUserName(),
				adminPOJO.getPassword());
	}
	
	/*--------------Logout Admin--------------*/
	@RequestMapping(value = "/logout", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody String logoutAdmin(@RequestBody LogoutDetails logoutDetails) throws JsonProcessingException {
		return adminService.logout(logoutDetails.getRole(),logoutDetails.getId());
	}
}  
