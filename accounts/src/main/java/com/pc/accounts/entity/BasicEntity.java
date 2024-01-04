package com.pc.accounts.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BasicEntity {

	@Column(updatable = false)
	private LocalDateTime createdAt;

	@Column(updatable = false)
	private String createdBy;

	@Column(insertable = false)
	private LocalDateTime updatedAt;

	@Column(insertable = false)
	private String updatedBy;
}
