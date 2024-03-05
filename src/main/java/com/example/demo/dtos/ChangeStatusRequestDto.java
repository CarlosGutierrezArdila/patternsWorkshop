package com.example.demo.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
public class ChangeStatusRequestDto {
  private String itemId;
  private String siteId;
  private String currentStatus;
  private String newStatus;
}
