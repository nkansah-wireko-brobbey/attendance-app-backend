package com.example.demo.domain;

import com.example.demo.constants.AttendanceStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@Setter
@Getter
@Entity
public class Attendance extends Audit {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private User user;

    private LocalDateTime timestamp;

    @Enumerated(EnumType.STRING)
    private AttendanceStatus status;

}
