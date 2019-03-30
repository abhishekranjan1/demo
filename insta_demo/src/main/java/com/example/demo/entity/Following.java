package com.example.demo.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "following")
public class Following {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    @Column(name = "following_id")
	    private long id;
	 		 	
	 	@Column(name = "followee_id")
	 	private long other_user_id;
	 
	    
}
