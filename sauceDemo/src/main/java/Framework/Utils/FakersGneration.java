package Framework.Utils;

import net.datafaker.Faker;

import java.text.Normalizer;
import java.util.Locale;

public class FakersGneration {

    private Faker faker;
    private String firstName;
    private String lastName;
    private String zipCode;

    public FakersGneration() {

        faker = new Faker(new Locale("pt-BR"));
    }


    public  static  String removerAcentos(String texto){
        return Normalizer
                .normalize(texto, Normalizer.Form.NFD)
                .replaceAll("\\p{M}", "");
    }

    public String getFirstName(){

        firstName = removerAcentos(faker.name().firstName());

        return firstName;
    }

    public String getLastName(){

        lastName = removerAcentos(faker.name().lastName());

        return lastName;
    }

    public String getZipCode(){

        zipCode = faker.address().zipCode();

        return zipCode;
    }




}

