package elective_2.parsing;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class ParsingApp {
    public static void main(String[] args) {
        try{
            File jsonFile = new File("src/elective_2/parsing/application.json");
            File yamlFile = new File("src/elective_2/parsing/application.yml");

            ObjectMapper jsonMapper = new ObjectMapper();

            ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());

            Config configFromJson = jsonMapper.readValue(jsonFile, Config.class);

            Config configFromYaml = yamlMapper.readValue(yamlFile, Config.class);

            System.out.println("Данные из JSON:");
            System.out.println(configFromJson);

            System.out.println("*".repeat(15));

            System.out.println("Данные из YAML:");
            System.out.println(configFromYaml);

        } catch (StreamReadException e) {
            throw new RuntimeException(e);
        } catch (DatabindException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
