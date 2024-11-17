package co.edu.poli.chainresp.model;

/**
 * 
 */
public class Chain {

	public Chain() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @return
	 */
	public Logger doChaining() {

		Logger consoleLogger = new Console(0);

		Logger errorLogger = new Error(1);
		consoleLogger.setLogger(errorLogger);

		Logger debugLogger = new Debug(2);
		errorLogger.setLogger(debugLogger);

		return consoleLogger;

	}

}