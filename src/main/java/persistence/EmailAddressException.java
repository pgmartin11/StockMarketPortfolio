package main.java.persistence;

/**
 * todo fill me in
 */
public class EmailAddressException extends Exception{


    /* todo - answer this question: what does providing only constructor that takes
     * two arguments enforce
     * while I did not provide other constructors?
     */

    /**
     *   todo fill me in
     * @param diagnosticMessage
     * @param rootCause
     */
    public EmailAddressException(String diagnosticMessage, Throwable rootCause) {
        super(diagnosticMessage,rootCause);
    }
}
