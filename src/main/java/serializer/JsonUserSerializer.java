package serializer;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.UserCollection;

import java.io.File;
import java.io.IOException;

public class JsonUserSerializer implements UserSerializer {

    public void serialize(UserCollection userCollection, String fileName) {
        ObjectMapper objectMapper = new ObjectMapper();
        File out = new File(fileName);
        try {
            objectMapper.writerFor(UserCollection.class).writeValue(out, userCollection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
