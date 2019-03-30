package com.example.demo.entity;

import javax.persistence.*;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long id;
    
    @Column(name = "username")
    private String userName;
    
    @Column(name = "password")
    private char[] password;
    
    @Column(name = "email")
    private String email;
    
    private String image;
    
    @Column(name = "followers")
    private int followers; 
    
    @Column(name = "following")
    private int following;

    @Column(name = "posts")
    private int posts;
    
    @Column(name = "active")
    private int active;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "friend_following", joinColumns =
    @JoinColumn(name = "user_id"))
    private List<Following> friends_following;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_image", joinColumns =
    @JoinColumn(name = "user_id"))
    private List<Image> images;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_comment", joinColumns =
    @JoinColumn(name = "user_id"))
    private List<Comment> comments;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_story", joinColumns =
    @JoinColumn(name = "user_id"))
    private List<Story> stories;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "user_like", joinColumns =
    @JoinColumn(name = "user_id"))
    private List<Like> likes;
}
