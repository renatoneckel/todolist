package com.neckelrenato.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity(name = "tb_users")
public class UserModel {
    
    @Id
    @GeneratedValue(generator = "UUID")
    private UUID id;
  
    @Column (unique = true)
    public String username;
    public String name;
    public String Password;
    
    @CreationTimestamp
    private LocalDateTime createdAt;
    /*  
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setPassword(String password) {
            Password = password;
        }

        public String getPassword() {
            return Password;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getUsername() {
            return username;
        } 
    */


}
