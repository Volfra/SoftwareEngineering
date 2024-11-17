package co.edu.poli.chainresp.model;

/**
 * 
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Chain c = new Chain();
		Logger chainLogger = c.doChaining();

		chainLogger.logMsg(TipoLogger.CONSOLE.ordinal(), "Enter the sequence of values ");
		chainLogger.logMsg(TipoLogger.ERROR.ordinal(), "An error is occured now");
		chainLogger.logMsg(TipoLogger.DEBUG.ordinal(), "This was the error now debugging is compiled");

	}

}