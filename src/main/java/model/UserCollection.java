package model;

import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;

public class UserCollection implements Serializable {
    String name;
    Collection<User> users;

    @Override
    public String toString() {
        return "UserCollection{" +
                "name='" + name + '\'' +
                ", users=" + users +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollection that = (UserCollection) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(users, that.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, users);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<User> getUsers() {
        return users;
    }

    public void setUsers(Collection<User> users) {
        this.users = users;
    }
}
