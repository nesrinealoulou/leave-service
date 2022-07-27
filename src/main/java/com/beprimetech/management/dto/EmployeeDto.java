package com.beprimetech.management.dto;

import com.beprimetech.management.models.Leave;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.assertj.core.util.Lists;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "EmployeeDb")
@Builder(toBuilder = true)
public class EmployeeDto {
    @Id
    private String id;
    @Builder.Default
    private List<Leave> leavesList = Lists.newArrayList();
}
