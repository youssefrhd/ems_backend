package ems.project.ems_project.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long client_id;
    @Column(name ="firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "email")
    private String email;
    @Column(name = "adresse")
    private String adresse;
    @Column(name = "phone_num")
    private String phone_num;
    @Column(name = "username",nullable = false,unique = true)
    private String username;
    @Column(name = "password" ,nullable=false)
    private String password;
    @Column(name = "isLoggedIn")
    private boolean isLoggedIn;

    @OneToMany(mappedBy = "user",fetch = FetchType.LAZY)
    private List<Adresse> adresses;

    /*@OneToMany(mappedBy = "user")
    private List<Order> orders;*/

    @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
    private Cart cart;
}


