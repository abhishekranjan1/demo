package com.example.demo.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "stories")
public class Story {	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "story_id")
    private long id;
	
	@Column(name = "no_of_likes")
 	private String numOfLikes;
	
	 @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	    @JoinTable(name = "friend_following", joinColumns =
	    @JoinColumn(name = "image_id"))
	    private List<Following> friends_following;
	
	@Column(name = "username")
 	private String userName;
	
	@Column(name = "username")
 	private String userName;
	
	@Column(name = "username")
 	private String userName;
	
	@Column(name = "username")
 	private String userName;
	
	@Column(name = "username")
 	private String userName;

}
