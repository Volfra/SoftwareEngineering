package co.edu.poli.chainresp.model;

/**
 * 
 */
public abstract class Logger {

    /**
     * 
     */
    protected int level;

    /**
     * 
     */
    protected Logger nextLevel;



    /**
     * @param nextLevel
     */
    public void setLogger(Logger nextLevel) {
       this.nextLevel = nextLevel;
    }

    /**
     * @param levels 
     * @param msg
     */
    public void logMsg(int levels, String msg) {
        
        if (this.level<=levels){  
            displayLog(msg);  
        }  
        
        if (nextLevel!=null) {  
            nextLevel.logMsg(levels, msg);  
        } 
    	
    }

    /**
     * @param msg
     */
    protected abstract void displayLog(String msg);

}