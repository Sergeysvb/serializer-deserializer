package deserializer;

import model.UserCollection;

import java.io.IOException;

public interface UserDeserializer {
    UserCollection deserialize (String fileName) throws IOException;
}
