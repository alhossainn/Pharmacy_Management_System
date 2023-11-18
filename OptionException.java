public class OptionException extends Exception {
    public int optError;

    OptionException(int optError) {
        this.optError = optError;
    }

    public String toString() {
        return "Error :-(" + "\n" + " ----- You have only two option, 1 or 2!!" + "\n" + "Please try again :-)";
    }
}

