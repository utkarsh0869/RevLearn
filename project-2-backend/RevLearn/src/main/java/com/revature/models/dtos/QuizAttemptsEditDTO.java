package com.revature.models.dtos;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class QuizAttemptsEditDTO {
    private Integer quizAttempts_id;

	private Integer student_id;

    private Integer quiz_id;
	
	private Timestamp attempt_date;
	
	private Double score;
}
