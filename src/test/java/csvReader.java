import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class csvReader {
        String firstName;
        String lastName;
        String email;
        String password;

    public csvReader() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static void read(String csvfile) throws IOException {
        CSVReader reader = new CSVReader(new FileReader(csvfile));

        String[] cell;

        while ((cell = reader.readNext()) != null) {
            csvReader s = new csvReader();
            s.setFirstName(cell[0]);
            s.setLastName(cell[1]);
            s.setEmail(cell[2]);
            s.setPassword(cell[3]);

        }

        reader.close();
    }
}