package dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class ErrorDTO {
	private int status;
	private String message;
	private LocalDateTime timestamp;
}
