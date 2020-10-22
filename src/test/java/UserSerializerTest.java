import deserializer.JsonUserDeserializer;
import deserializer.XmlUserDeserializer;
import model.User;
import model.UserCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import serializer.JsonUserSerializer;
import serializer.XmlUserSerializer;

import java.io.File;
import java.util.ArrayList;

public class UserSerializerTest {
    private UserCollection PeopleUse() {
        User sergey = new User();
        sergey.setName("Sergey");
        sergey.setId(1);
        sergey.setEmail("Sergey@email.com");
        User oleg = new User();
        oleg.setName("Oleg");
        oleg.setId(2);
        oleg.setEmail("Oleg@email.com");
        User misha = new User();
        misha.setName("Misha");
        misha.setId(3);
        misha.setEmail("Misha@email.com");
        User nikita = new User();
        nikita.setName("Nikita");
        nikita.setId(4);
        nikita.setEmail("Nikita@email.com");
        User sasha = new User();
        sasha.setName("Sasha");
        sasha.setId(5);
        sasha.setEmail("Sasha@email.com");
        User petya = new User();
        petya.setName("Petya");
        petya.setId(6);
        petya.setEmail("Petya@email.com");
        User igor = new User();
        igor.setName("Igor");
        igor.setId(7);
        igor.setEmail("Igor@email.com");
        User anton = new User();
        anton.setName("Anton");
        anton.setId(8);
        anton.setEmail("Anton@email.com");
        User lesha = new User();
        lesha.setName("Lesha");
        lesha.setId(9);
        lesha.setEmail("Lesha@email.com");
        User evgeniy = new User();
        evgeniy.setName("Evgeniy");
        evgeniy.setId(10);
        evgeniy.setEmail("Evgeniy@email.com");
        UserCollection userCollection = new UserCollection();
        userCollection.setUsers(new ArrayList<User>());
        userCollection.getUsers().add(sergey);
        userCollection.getUsers().add(oleg);
        userCollection.getUsers().add(misha);
        userCollection.getUsers().add(nikita);
        userCollection.getUsers().add(sasha);
        userCollection.getUsers().add(petya);
        userCollection.getUsers().add(igor);
        userCollection.getUsers().add(anton);
        userCollection.getUsers().add(lesha);
        userCollection.getUsers().add(evgeniy);

        return userCollection;
    }

    @Test
    public void serializerJson(){
        UserCollection userCollection = PeopleUse();
        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serialize(userCollection, "users.json");
        Assertions.assertTrue(new File("users.json").exists());
    }

    @Test
    void serializeDeserializeTestJson(){
        UserCollection userCollection = PeopleUse();
        JsonUserSerializer jsonUserSerializer = new JsonUserSerializer();
        jsonUserSerializer.serialize(userCollection, "users.json");
        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        UserCollection collection = jsonUserDeserializer.deserialize("users.json");
        Assertions.assertEquals(userCollection,collection);
    }

    @Test
    void serializeDeserializeTestXml(){
        UserCollection userCollection = PeopleUse();
        XmlUserSerializer xmlUserSerializer = new XmlUserSerializer();
        xmlUserSerializer.serialize(userCollection, "users.xml");
        XmlUserDeserializer xmlUserDeserializer = new XmlUserDeserializer();
        UserCollection collection = xmlUserDeserializer.deserialize("users.xml");
        Assertions.assertEquals(userCollection,collection);
    }
}
