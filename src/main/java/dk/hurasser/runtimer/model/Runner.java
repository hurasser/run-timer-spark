package dk.hurasser.runtimer.model;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;
import java.util.StringJoiner;

@Entity
@Table(name="Runner", catalog = "RunTimerTest")
public class Runner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date birthdate;

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Runner runner = (Runner) o;
        return id == runner.id &&
                name.equals(runner.name) &&
                gender.equals(runner.gender) &&
                birthdate.equals(runner.birthdate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, gender, birthdate);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Runner.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .add("name='" + name + "'")
                .add("gender='" + gender + "'")
                .add("birthdate=" + birthdate)
                .toString();
    }
}
