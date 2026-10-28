package Framework.Utils;

import net.datafaker.Faker;

import java.util.Locale;

public class FakersGneration {

    private Faker faker;
    private String firstName;
    private String lastName;
    private String zipCode;

    public FakersGneration() {

        faker = new Faker(new Locale("pt-BR"));
    }

    public String getFirstName(){

        return faker.name().firstName();
    }

    public String getLastName(){

        return faker.name().lastName();
    }

    public String getZipCode(){

        zipCode = faker.address().zipCode();

        return zipCode;
    }


}

