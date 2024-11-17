package co.edu.poli.chainresp.model;

/**
 * 
 */
public class Error extends Logger {

    /**
     * @param levels
     */
    public Error(int levels) {
        this.level = levels;
    }

    /**
     * @param msg
     */
    protected void displayLog(String msg) {
    	System.out.println("ERROR LOGGER INFO: "+msg);
    }

}