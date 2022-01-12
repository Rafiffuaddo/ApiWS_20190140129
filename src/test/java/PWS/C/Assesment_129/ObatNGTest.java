/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package PWS.C.Assesment_129;

import java.util.List;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author user
 */
public class ObatNGTest {
    
    public ObatNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of save method, of class Obat.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Obat j = null;
        Obat expResult = null;
        Obat result = Obat.save(j);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findById method, of class Obat.
     */
    @Test
    public void testFindById() {
        System.out.println("findById");
        String id_baju = "";
        Object expResult = null;
        Object result = Obat.findById(id_baju);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class Obat.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        List expResult = null;
        List result = Obat.findAll();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId_obat method, of class Obat.
     */
    @Test
    public void testGetId_obat() {
        System.out.println("getId_obat");
        Obat instance = new Obat();
        int expResult = 0;
        int result = instance.getId_obat();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNama_Obat method, of class Obat.
     */
    @Test
    public void testGetNama_Obat() {
        System.out.println("getNama_Obat");
        Obat instance = new Obat();
        String expResult = "";
        String result = instance.getNama_Obat();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getHarga method, of class Obat.
     */
    @Test
    public void testGetHarga() {
        System.out.println("getHarga");
        Obat instance = new Obat();
        String expResult = "";
        String result = instance.getHarga();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpired method, of class Obat.
     */
    @Test
    public void testGetExpired() {
        System.out.println("getExpired");
        Obat instance = new Obat();
        String expResult = "";
        String result = instance.getExpired();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getJumlah method, of class Obat.
     */
    @Test
    public void testGetJumlah() {
        System.out.println("getJumlah");
        Obat instance = new Obat();
        String expResult = "";
        String result = instance.getJumlah();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId_obat method, of class Obat.
     */
    @Test
    public void testSetId_obat() {
        System.out.println("setId_obat");
        int id_obat = 0;
        Obat instance = new Obat();
        instance.setId_obat(id_obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNama_Obat method, of class Obat.
     */
    @Test
    public void testSetNama_Obat() {
        System.out.println("setNama_Obat");
        String Nama_Obat = "";
        Obat instance = new Obat();
        instance.setNama_Obat(Nama_Obat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHarga method, of class Obat.
     */
    @Test
    public void testSetHarga() {
        System.out.println("setHarga");
        String Harga = "";
        Obat instance = new Obat();
        instance.setHarga(Harga);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setExpired method, of class Obat.
     */
    @Test
    public void testSetExpired() {
        System.out.println("setExpired");
        String Expired = "";
        Obat instance = new Obat();
        instance.setExpired(Expired);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setJumlah method, of class Obat.
     */
    @Test
    public void testSetJumlah() {
        System.out.println("setJumlah");
        String Jumlah = "";
        Obat instance = new Obat();
        instance.setJumlah(Jumlah);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Obat.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Obat instance = new Obat();
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of canEqual method, of class Obat.
     */
    @Test
    public void testCanEqual() {
        System.out.println("canEqual");
        Object other = null;
        Obat instance = new Obat();
        boolean expResult = false;
        boolean result = instance.canEqual(other);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Obat.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Obat instance = new Obat();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Obat.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Obat instance = new Obat();
        String expResult = "";
        String result = instance.toString();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
