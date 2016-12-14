
import javax.ejb.EJB;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.spec.EnterpriseArchive;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jonathanosterman.ejb.bo.ExampleBOLocal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import br.com.it.base.AbstractTestIntegration;

@RunWith(Arquillian.class)
public class ExampleDAOIT
    extends
    AbstractTestIntegration {

    @Deployment(
        name = "deploymentEar")
    public static Archive<?> deploymentEar() {
        final JavaArchive jar = getJAR();
        jar.addPackages(true, "org.jonathanosterman.core");
        jar.addPackages(true, "org.jonathanosterman.ejb");
        jar.addPackages(true, "org.jonathanosterman.dao");
        final WebArchive war = getWAR();
        war.addPackage("org.jonathanosterman.webservice");
        war.addClass(ExampleDAOIT.class);
        final EnterpriseArchive ear = getEAR(jar, war);
        System.out.println(ear.toString(true));
        return ear;
    }

    @Before
    public void setUp() {
    }

    @EJB
    private ExampleBOLocal exampleBO;

    @Test
    public void test() {
        final String result = exampleBO.getResult(1);
        System.err.println(result);
    }

}
