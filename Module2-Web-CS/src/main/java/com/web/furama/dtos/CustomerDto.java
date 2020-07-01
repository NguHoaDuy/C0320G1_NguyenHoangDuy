package com.web.furama.dtos;

import com.web.furama.models.Account;
import com.web.furama.models.Contract;
import com.web.furama.models.CustomerType;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class CustomerDto {

    @Pattern(regexp = "^KH-\\d{4}$")
    private String code;

    private String name;

    @Pattern(regexp = "^\\d{9}$", message = "ID Card format must be 9 number!")
    private String idCard;

    @Pattern(regexp = "^((\\(\\+84\\))|0)9[01]\\d{7}$", message = "Phone number is wrong format")
    private String phoneNumber;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthday;

    @Pattern(regexp = "^\\w+$", message = "Invalid address")
    private String address;

    private CustomerType customerType;

}
