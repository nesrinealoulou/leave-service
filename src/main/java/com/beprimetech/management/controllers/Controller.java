package com.beprimetech.management.controllers;

import com.beprimetech.management.models.Leave;
import com.beprimetech.management.sevices.LeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(path = "/api/employee/leave")
public class Controller {

    @Autowired
    LeaveService leaveService;

    @GetMapping(value = "/getLeavesListbyEmployeeId/{id}")
    public ResponseEntity<List<Leave>> getLeavesByEmployeeId(@PathVariable String id) {
        List<Leave> employees = leaveService.getLeavesByEmployeeId(id);
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
}
