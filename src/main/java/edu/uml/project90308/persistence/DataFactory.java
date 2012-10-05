package edu.uml.project90308.persistence;

/**
 *
 */
public class DataFactory {

    public static DataReader getDataReader() {
        return new XMLReader();
    }


}
