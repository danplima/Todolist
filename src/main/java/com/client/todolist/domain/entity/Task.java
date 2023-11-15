package com.client.todolist.domain.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_task")
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_task")
	private Long id;
	private String name;
	private String description;
	@Enumerated(EnumType.STRING)
	private StatusTask status = StatusTask.TO_DO;
	
	@CreationTimestamp
	@Column(name = "created_date")
	private LocalDateTime createdAt;
	@Column(name = "start_date")
	private LocalDateTime startAt;
	@Column(name = "end_date")
	private LocalDateTime endAt;
	
	@ManyToOne
	@JoinColumn(name = "id_project")
	private Project project;
}
