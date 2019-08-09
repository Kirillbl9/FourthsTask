package DAO;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

import javax.sql.DataSource;

@Data
 public final class Person {
    int id;
    @NotNull
    String firstName;
    @NotNull
    String secondName;

    public Person(int id, @NotNull String firstName, @NotNull String secondName) {
        this.id=id;
        this.firstName=firstName;
        this.secondName=secondName;
    }

    public Person(DataSource mockDataSource) {
    }


    @NotNull
    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstName='" + firstName + '\'' + ", secondName='" + secondName + '\'' + '}';
    }

    public void create(@NotNull Person person) {

    }
}
