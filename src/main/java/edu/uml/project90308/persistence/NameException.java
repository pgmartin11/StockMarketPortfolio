package edu.uml.project90308.persistence;

/**
 * todo fill me in
 */
public class NameException extends Exception{


    /* todo - answer this question: what does providing only constructor that take argumetns enforce
     */

    /**
     *   todo fill me in
     * @param diagnosticMessage
     * @param rootCause
     */
    public NameException( String diagnosticMessage, Throwable rootCause) {
        super(diagnosticMessage,rootCause);
    }

    /**
     *   todo fill me in
     * @param diagnosticMessage
      */
    public NameException( String diagnosticMessage) {
        super(diagnosticMessage);
    }
}
