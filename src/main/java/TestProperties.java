import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author Ivan Yushin
 */
public class TestProperties {
    private final Properties properties = new Properties();
    private static TestProperties INSTANCE = null;

    private TestProperties(){
        try {
            properties.load(new FileInputStream(new File("C:\\Users\\Asus\\Desktop\\insurance-test\\" + System.getProperty("environment") + ".properties")));
        } catch (IOException ex){
            ex.printStackTrace();
        }
    }

    public static TestProperties getInstance(){
        if (INSTANCE == null){
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }

    public Properties getProperties(){
        return properties;
    }
}