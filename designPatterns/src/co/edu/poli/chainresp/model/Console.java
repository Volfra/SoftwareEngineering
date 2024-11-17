package co.edu.poli.chainresp.model;

/**
 * 
 */
public class Console extends Logger {

    /**
     * @param levels
     */
    public Console(int levels) {
        this.level = levels;
    }

    /**
     * @param msg
     */
    protected void displayLog(String msg) {
    	System.out.println("CONSOLE LOGGER INFO: "+msg);
    }

}