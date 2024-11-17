package co.edu.poli.chainresp.model;

/**
 * 
 */
public class Debug extends Logger {


    /**
     * @param levels
     */
    public Debug(int levels) {
        this.level = levels;
    }

    /**
     * @param msg
     */
    protected void displayLog(String msg) {
    	 System.out.println("DEBUG LOGGER INFO: "+msg);  
    }

}