package deserializer;

import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import model.UserCollection;

import java.io.File;
import java.io.IOException;

public class XmlUserDeserializer implements UserDeserializer{
    public UserCollection deserialize(String fileName) {
        XmlMapper mapper = new XmlMapper();
        ObjectReader objectReader = mapper.readerFor(UserCollection.class);
        UserCollection users = null;

        try {
            users = objectReader.readValue(new File(fileName), UserCollection.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }
}
