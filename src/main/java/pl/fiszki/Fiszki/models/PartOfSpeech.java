package pl.fiszki.Fiszki.models;

import javax.persistence.*;

@Entity
@Table(name = "part_of_speech")
public class PartOfSpeech {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(
            length = 20,
            nullable = false
            )
    private String name;

    public PartOfSpeech(){}

    public PartOfSpeech(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PartOfSpeech{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
