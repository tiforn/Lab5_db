import com.didula.manager.SessionManager;
import com.didula.view.View;

public class Main {
  public static void main(final String[] args) throws Exception {
    SessionManager.openSessionFactory();
    new View().show();
    SessionManager.closeSessionFactory();
  }
}