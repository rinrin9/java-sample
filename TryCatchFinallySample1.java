import java.util.logging.*;

public class TryCatchFinallySample {
	private static Logger logger = Logger.getLogger(TryCatchFinallySample.class.getName());

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