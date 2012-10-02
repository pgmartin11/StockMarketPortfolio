/**
 * User: pgmartin
 * Date: 10/1/12
 * Time: 5:12 PM
 */
package edu.uml.project90308.businesslogic;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StockTest {

    private Stock tStock;

    @Before
    public void setup() {
        tStock = new Stock();
    }

    @Test
    public void testStockConstruction() {
        Stock stock = new Stock("EMC", "EMC Corporation", "28.75");
        assertEquals("Stock Constructor was successful", stock, tStock);
    }

}
