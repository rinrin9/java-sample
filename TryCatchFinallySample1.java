import java.util.logging.*;

public class TryCatchFinallySample1 {
	private static Logger logger = Logger.getLogger(TryCatchFinallySample1.class.getName());

	public static void main(String[] args) {
		logger.setLevel(Level.ALL);

		try {
			logger.warning("try");
			Integer.parseInt(args[0]);
		} catch (Exception e) {
			logger.severe("catch");
		} finally {
			logger.info("finally");
		}
	}
}