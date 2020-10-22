package serializer;

import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import model.UserCollection;

public class CsvUserSerializer implements UserSerializer{
    public void serialize(UserCollection userCollection, String fileName) {
        CsvSchema schema = CsvSchema.builder()
                .addColumn("id",CsvSchema.ColumnType.NUMBER)
                .addColumn("name")
                .addColumn("email")
                .build();
    }
}
