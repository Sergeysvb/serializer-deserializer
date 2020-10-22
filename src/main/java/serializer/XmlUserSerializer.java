package serializer;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.UserCollection;

import java.io.File;
import java.io.IOException;

public class XmlUserSerializer implements UserSerializer{
    public void serialize(UserCollection userCollection, String fileName) {
        XmlMapper objectMapper = new XmlMapper();
        File file = new File(fileName);
        try {
            objectMapper.writerFor(UserCollection.class).writeValue(file, userCollection);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
