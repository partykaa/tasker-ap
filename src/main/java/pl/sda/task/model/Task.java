package pl.sda.task.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Data
@Entity
@EqualsAndHashCode(of = "id")
public class Task {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    @OneToOne
    private User user;

    public void setUser(User user) {
        this.user = user;
    }
}