package serializer;

import model.UserCollection;

public interface UserSerializer {
    void serialize (UserCollection userCollection, String fileName);
}
