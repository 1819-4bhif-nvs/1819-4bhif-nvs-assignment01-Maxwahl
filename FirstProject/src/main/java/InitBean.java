import javax.annotation.PostConstruct;
import javax.ejb.Startup;
import javax.ejb.Singleton;

@Startup
@Singleton
public class InitBean {
    @PostConstruct
    public void init(){
        System.out.println("*** it works ***");
    }
}
