//package ems.project.ems_project.Model;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//@Entity
//@Table(name = "admin")
//
//public class Admin {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long admin_id;
//    @Column(name = "adm_username")
//    private String username;
//    @Column(name="adm_password")
//    private String password;
//    @OneToMany(mappedBy = "admin")
//    private List<Product> products;
//}
