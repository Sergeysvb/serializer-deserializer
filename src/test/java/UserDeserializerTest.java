import deserializer.JsonUserDeserializer;
import deserializer.XmlUserDeserializer;
import model.UserCollection;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserDeserializerTest {
    @Test
    void deserializeJson() {
        JsonUserDeserializer jsonUserDeserializer = new JsonUserDeserializer();
        UserCollection collection = jsonUserDeserializer.deserialize("users.json");
        Assertions.assertNotNull(collection);
    }
    @Test
    void deserializeXml() {
        XmlUserDeserializer xmlUserDeserializer = new XmlUserDeserializer();
        UserCollection collection = xmlUserDeserializer.deserialize("users.xml");
        Assertions.assertNotNull(collection);
    }
}
