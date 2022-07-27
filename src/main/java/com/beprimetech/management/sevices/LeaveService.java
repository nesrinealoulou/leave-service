package com.beprimetech.management.sevices;



import com.beprimetech.management.dto.EmployeeDto;
import com.beprimetech.management.models.Leave;
import com.beprimetech.management.repository.LeaveRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.ArrayList;
import java.util.List;

import static java.text.MessageFormat.format;

@Service
public class LeaveService {

    @Autowired
    private final LeaveRepository leaveRepository;


    public LeaveService(LeaveRepository leaveRepository) {
        this.leaveRepository = leaveRepository;
    }
    public Leave findLeaveById(String id) {
        return leaveRepository.findLeaveById(id).orElseThrow(
                () -> new UserNotFoundException("leave by id" + id + "not found"));
    }

    /*public Leave addLeave(Leave leave) {
        return leaveRepository.save(leave);
    }

    public List<Leave> findAllEmployees() {
        List<Leave> leaves = Lists.newArrayList();
        leaves.forEach(leave -> leaves.add(leave)
        );
        return leaves;
    }
    public Leave updateLeave (Leave leave) {
        Leave nvLeave = this.findLeaveById(leave.getId());
        nvLeave = leave;
        return leaveRepository.save(nvLeave);
    }
    public void deleteEmployee(String id) {
       Leave leave = this.findLeaveById(id);
        leaveRepository.delete(leave);
    }*/





}
