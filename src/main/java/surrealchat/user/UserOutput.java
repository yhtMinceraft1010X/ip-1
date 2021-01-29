package surrealchat.user;

/**
 * Handles printing of output.
 */
public class UserOutput {
    protected boolean isVerbose;

    /**
     * Creates new UserOutput instance.
     * @param isVerbose Flag for whether additional output should be printed.
     */
    public UserOutput(boolean isVerbose) {
        this.isVerbose = isVerbose;
    }

    /**
     * Prints out a greeting upon start up.
     */
    public void printInitialGreeting() {
        System.out.println("I am Meme Man. Whoms't be entering the VIMension?");
        if (this.isVerbose) {
            System.out.println("I speak a lot. For I am verbose!\n");
        } else {
            System.out.println("\n");
        }
    }

    /**
     * Prints output from regular user commands.
     * @param outputString Output string from user commands.
     */
    public void printOutput(String outputString) {
        System.out.println(outputString);
    }

    /**
     * Prints out EasterEgg outputs.
     * @param easterEgg String from easteregg commands.
     */
    public void printEasterEggOutput(String easterEgg) {
        System.err.println(easterEgg);
    }

    /**
     * Prints output only if isVerbose is true.
     * @param output The output to be printed in verbose mode.
     */
    public void printVerbose(String output) {
        if (this.isVerbose) {
            System.out.println(output);
        }
    }

    /**
     * Prints out the farewell message upon program exiting normally.
     */
    public void printExitProgram() {
        if (this.isVerbose) {
            System.out.println("Saving tasks now...");
        }
        System.out.println("You have been EJECTED!");
    }

    /**
     * Prints out exception message.
     * @param e Any caught exception.
     */
    public void printException(Exception e) {
        System.err.println(e.getMessage() + "\n");
    }
}
