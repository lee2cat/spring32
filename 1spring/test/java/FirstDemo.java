import com.test.OneBean;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;



/**
 * Created by cjp on 2017/4/10.
 */
public class FirstDemo {

    public static void main(String[] args) throws InterruptedException {
        FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("1spring\\test\\resource\\spring\\applicationContext.xml");
        OneBean oneBean = new OneBean();
        oneBean.setName("2134");
    }
}
